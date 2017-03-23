/**
 * Copyright 2017 Twitter. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twitter.graphjet.algorithms.counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.common.collect.Lists;

import org.junit.Test;

import com.twitter.graphjet.algorithms.BipartiteGraphTestHelper;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.RecommendationStats;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.RequestedSetFilter;
import com.twitter.graphjet.algorithms.ResultFilter;
import com.twitter.graphjet.algorithms.ResultFilterChain;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountForMoment;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;

import it.unimi.dsi.fastutil.longs.Long2DoubleArrayMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

import static org.junit.Assert.assertEquals;

public class TopSecondDegreeByCountForMomentTest {

  @Test
  public void testTopSecondDegreeByCountForMomentWithSmallGraph1() throws Exception {
    // Test 1: Test regular test case without max result limitations
    HashMap<Byte, LongList> socialProofFor3 = new HashMap<> ();
    socialProofFor3.put((byte) 1, new LongArrayList(new long[]{1, 2, 3}));

    HashMap<Byte, LongList> socialProofFor5 = new HashMap<> ();
    socialProofFor5.put((byte) 0, new LongArrayList(new long[]{2}));
    socialProofFor5.put((byte) 3, new LongArrayList(new long[]{1}));

    HashMap<Byte, LongList> socialProofFor7 = new HashMap<> ();
    socialProofFor7.put((byte) 0, new LongArrayList(new long[]{1}));
    socialProofFor7.put((byte) 1, new LongArrayList(new long[]{2}));

    Map<Byte, Integer> minUserPerSocialProof = new HashMap<>();
    List<TopSecondDegreeByCountRecommendationInfo> expectedTopResults = new ArrayList<>();

    byte[] socialProofTypes = new byte[] {0, 1, 2, 3};
    RecommendationStats expectedTopSecondDegreeByCountStats = new RecommendationStats(5, 6, 17, 2, 4, 0);

    int maxNumResults = 3;
    expectedTopResults.add(new TopSecondDegreeByCountRecommendationInfo(3, RecommendationType.MOMENT,3.0, socialProofFor3));
    expectedTopResults.add(new TopSecondDegreeByCountRecommendationInfo(5, RecommendationType.MOMENT, 2.5, socialProofFor5));
    expectedTopResults.add(new TopSecondDegreeByCountRecommendationInfo(7, RecommendationType.MOMENT,2.5, socialProofFor7));
    testTopSecondDegreeByCountHelper(
      maxNumResults,
      minUserPerSocialProof,
      socialProofTypes,
      expectedTopResults,
      expectedTopSecondDegreeByCountStats);
  }

  @Test
  public void testTopSecondDegreeByCountForMomentWithSmallGraph2() throws Exception {
    // Test 2: Test with small maxNumResults
    HashMap<Byte, LongList> socialProofFor3 = new HashMap<> ();
    socialProofFor3.put((byte) 1, new LongArrayList(new long[]{1, 2, 3}));

    Map<Byte, Integer> minUserPerSocialProof = new HashMap<>();
    List<TopSecondDegreeByCountRecommendationInfo> expectedTopResults = new ArrayList<>();

    byte[] socialProofTypes = new byte[] {0, 1, 2, 3};
    RecommendationStats expectedTopSecondDegreeByCountStats = new RecommendationStats(5, 6, 17, 2, 4, 0);

    int maxNumResults = 1;
    expectedTopResults.clear();
    expectedTopResults.add(new TopSecondDegreeByCountRecommendationInfo(3, RecommendationType.MOMENT,3.0, socialProofFor3));
    testTopSecondDegreeByCountHelper(
      maxNumResults,
      minUserPerSocialProof,
      socialProofTypes,
      expectedTopResults,
      expectedTopSecondDegreeByCountStats);
  }

  @Test
  public void testTopSecondDegreeByCountForMomentWithSmallGraph3() throws Exception {
    // Test 3: Test limiting minimum number of minimum per social proof
    HashMap<Byte, LongList> socialProofFor3 = new HashMap<> ();
    socialProofFor3.put((byte) 1, new LongArrayList(new long[]{1, 2, 3}));

    Map<Byte, Integer> minUserPerSocialProof = new HashMap<>();
    List<TopSecondDegreeByCountRecommendationInfo> expectedTopResults = new ArrayList<>();

    byte[] socialProofTypes = new byte[] {0, 1, 2, 3};
    RecommendationStats expectedTopSecondDegreeByCountStats = new RecommendationStats(5, 6, 17, 2, 4, 0);

    int maxNumResults = 3;
    minUserPerSocialProof.put((byte) 1, 3); // 3 moments per proof
    expectedTopResults.clear();
    expectedTopResults.add(new TopSecondDegreeByCountRecommendationInfo(3, RecommendationType.MOMENT, 3.0, socialProofFor3));
    testTopSecondDegreeByCountHelper(
      maxNumResults,
      minUserPerSocialProof,
      socialProofTypes,
      expectedTopResults,
      expectedTopSecondDegreeByCountStats);
  }

  private void testTopSecondDegreeByCountHelper(
    int maxNumResults,
    Map<Byte, Integer> minUserPerSocialProof,
    byte[] socialProofTypes,
    List<TopSecondDegreeByCountRecommendationInfo> expectedTopResults,
    RecommendationStats expectedTopSecondDegreeByCountStats
  ) throws Exception {
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph =
      BipartiteGraphTestHelper.buildSmallTestLeftIndexedPowerLawMultiSegmentBipartiteGraphWithEdgeTypes();

    long queryNode = 1;
    int maxSocialProofSize = 4;
    int maxNumSocialProofs = 100;
    Long2DoubleMap seedsMap = new Long2DoubleArrayMap(new long[]{1, 2, 3}, new double[]{1.5, 1.0, 0.5});
    LongSet toBeFiltered = new LongOpenHashSet(new long[]{});
    ResultFilterChain resultFilterChain = new ResultFilterChain(Lists.<ResultFilter>newArrayList(
      new RequestedSetFilter(new NullStatsReceiver())));

    int expectedNodesToHit = 100;
    long randomSeed = 918324701982347L;
    Random random = new Random(randomSeed);

    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(
      queryNode,
      seedsMap,
      toBeFiltered,
      maxNumResults,
      maxNumSocialProofs,
      maxSocialProofSize,
      minUserPerSocialProof,
      socialProofTypes,
      resultFilterChain);

    try {
      TopSecondDegreeByCountResponse response = new TopSecondDegreeByCountForMoment(
        bipartiteGraph,
        expectedNodesToHit,
        new NullStatsReceiver()
      ).computeRecommendations(request, random);

      List<RecommendationInfo> topSecondDegreeByCountResults =
        Lists.newArrayList(response.getRankedRecommendations());

      RecommendationStats topSecondDegreeByCountStats = response.getTopSecondDegreeByCountStats();

      assertEquals(expectedTopSecondDegreeByCountStats, topSecondDegreeByCountStats);
      assertEquals(expectedTopResults, topSecondDegreeByCountResults);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}