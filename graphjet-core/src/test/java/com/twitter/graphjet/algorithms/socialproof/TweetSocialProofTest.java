/**
 * Copyright 2018 Twitter. All rights reserved.
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

package com.twitter.graphjet.algorithms.socialproof;

import java.util.*;

import org.junit.Test;

import com.twitter.graphjet.algorithms.BipartiteGraphTestHelper;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedMultiSegmentBipartiteGraph;

import it.unimi.dsi.fastutil.bytes.Byte2ObjectArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleArrayMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;

import static org.junit.Assert.*;

import static com.twitter.graphjet.algorithms.RecommendationRequest.AUTHOR_SOCIAL_PROOF_TYPE;
import static com.twitter.graphjet.algorithms.RecommendationRequest.CLICK_SOCIAL_PROOF_TYPE;
import static com.twitter.graphjet.algorithms.RecommendationRequest.FAVORITE_SOCIAL_PROOF_TYPE;
import static com.twitter.graphjet.algorithms.RecommendationRequest.IS_MENTIONED_SOCIAL_PROOF_TYPE;
import static com.twitter.graphjet.algorithms.RecommendationRequest.REPLY_SOCIAL_PROOF_TYPE;
import static com.twitter.graphjet.algorithms.RecommendationRequest.RETWEET_SOCIAL_PROOF_TYPE;

/**
 * Unit test for social proof finder.
 *
 * Build graph using BipartiteGraphTestHelper, and test the proof finder logic with
 * one type of edges.
 *
 * Issue: the BipartiteGraphTestHelper does not support more than one type of edges
 * so far.
 */
public class TweetSocialProofTest {

  private long user1 = 1;
  private long user2 = 2;
  private long user3 = 3;

  private long tweet2 = 2;
  private long tweet3 = 3;
  private long tweet4 = 4;
  private long tweet5 = 5;
  private long tweet6 = 6;
  private long tweet7 = 7;
  private long tweet8 = 8;

  private void assertEqualSocialProofResults(SocialProofResult expected, SocialProofResult actual) {
    assertEquals(expected.getNode(), actual.getNode());
    assertEquals(expected.getSocialProof(), actual.getSocialProof());
    assertEquals(expected.getSocialProofSize(), actual.getSocialProofSize());
    assertEquals(0, Double.compare(expected.getWeight(), actual.getWeight()));
  }

  @Test
  public void testTweetSocialProofs() {
    NodeMetadataLeftIndexedMultiSegmentBipartiteGraph bipartiteGraph =
      BipartiteGraphTestHelper.buildSmallTestNodeMetadataLeftIndexedMultiSegmentBipartiteGraph();

    Long2DoubleMap seedsMap = new Long2DoubleArrayMap(
      new long[] {user2, user3}, new double[] {1.0, 0.5});
    LongSet tweets = new LongArraySet(new long[] {tweet2, tweet3, tweet4, tweet5});

    byte[] validSocialProofTypes = new byte[] {
      CLICK_SOCIAL_PROOF_TYPE,
      FAVORITE_SOCIAL_PROOF_TYPE,
      RETWEET_SOCIAL_PROOF_TYPE,
      REPLY_SOCIAL_PROOF_TYPE,
      AUTHOR_SOCIAL_PROOF_TYPE,
    };

    SocialProofRequest socialProofRequest = new SocialProofRequest(
      tweets,
      seedsMap,
      validSocialProofTypes
    );
    HashMap<Long, SocialProofResult> results = new HashMap<>();

    new TweetSocialProofGenerator(bipartiteGraph)
      .computeRecommendations(socialProofRequest, new Random(0))
      .getRankedRecommendations().forEach( recInfo ->
        results.put(((SocialProofResult)recInfo).getNode(), (SocialProofResult)recInfo));

    assertEquals(results.size(), 2);

    // Test social proofs for tweet 2
    SocialProofResult actual2 = results.get(tweet2);
    Byte2ObjectMap<LongSet> expectedProofs2 = new Byte2ObjectArrayMap<>();
    expectedProofs2.put(CLICK_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user3}));
    SocialProofResult expected2 =
      new SocialProofResult(tweet2, expectedProofs2, 0.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected2, actual2);

    // Test social proofs for tweet 5
    SocialProofResult actual5 = results.get(tweet5);
    Byte2ObjectMap<LongSet> expectedProofs5 = new Byte2ObjectArrayMap<>();
    expectedProofs5.put(CLICK_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user2, user3}));
    SocialProofResult expected5 =
      new SocialProofResult(tweet5, expectedProofs5, 1.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected5, actual5);
  }

  @Test
  public void testTweetSocialProofs2() {
    // Run on another test graph
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph =
      BipartiteGraphTestHelper.buildSmallTestLeftIndexedPowerLawMultiSegmentBipartiteGraphWithEdgeTypes();

    Long2DoubleMap seedsMap = new Long2DoubleArrayMap(
      new long[] {user1, user2}, new double[] {1.0, 0.5});
    LongSet tweets = new LongArraySet(new long[] {tweet2, tweet3, tweet4, tweet5, tweet6, tweet7, tweet8});

    byte[] validSocialProofTypes = new byte[] {
      FAVORITE_SOCIAL_PROOF_TYPE,
      RETWEET_SOCIAL_PROOF_TYPE
    };

    SocialProofRequest socialProofRequest = new SocialProofRequest(
      tweets,
      seedsMap,
      validSocialProofTypes
    );
    HashMap<Long, SocialProofResult> results = new HashMap<>();
    new TweetSocialProofGenerator(bipartiteGraph)
      .computeRecommendations(socialProofRequest, new Random(0))
      .getRankedRecommendations().forEach( recInfo ->
      results.put(((SocialProofResult)recInfo).getNode(), (SocialProofResult)recInfo));

    assertEquals(5, results.size());

    // Test social proofs for tweet 3
    SocialProofResult actual3 = results.get(tweet3);
    Byte2ObjectMap<LongSet> expectedProofs3 = new Byte2ObjectArrayMap<>();
    expectedProofs3.put(FAVORITE_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user1, user2}));
    SocialProofResult expected3 =
      new SocialProofResult(tweet3, expectedProofs3, 1.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected3, actual3);

    // Test social proofs for tweet 4
    SocialProofResult actual4 = results.get(tweet4);
    Byte2ObjectMap<LongSet> expectedProofs4 = new Byte2ObjectArrayMap<>();
    expectedProofs4.put(RETWEET_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user1}));
    SocialProofResult expected4 =
      new SocialProofResult(tweet4, expectedProofs4, 1, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected4, actual4);

    // Test social proofs for tweet 6
    SocialProofResult actual6 = results.get(tweet6);
    Byte2ObjectMap<LongSet> expectedProofs6 = new Byte2ObjectArrayMap<>();
    expectedProofs6.put(FAVORITE_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user2}));
    SocialProofResult expected6 =
      new SocialProofResult(tweet6, expectedProofs6, 0.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected6, actual6);

    // Test social proofs for tweet 7
    SocialProofResult actual7 = results.get(tweet7);
    Byte2ObjectMap<LongSet> expectedProofs7 = new Byte2ObjectArrayMap<>();
    expectedProofs7.put(FAVORITE_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user2}));
    SocialProofResult expected7 =
      new SocialProofResult(tweet7, expectedProofs7, 0.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected7, actual7);

    // Test social proofs for tweet 8
    SocialProofResult actual8 = results.get(tweet8);
    Byte2ObjectMap<LongSet> expectedProofs8 = new Byte2ObjectArrayMap<>();
    expectedProofs8.put(FAVORITE_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user1}));
    expectedProofs8.put(RETWEET_SOCIAL_PROOF_TYPE, new LongArraySet(new long[] {user2}));
    SocialProofResult expected8 =
      new SocialProofResult(tweet8, expectedProofs8, 1.5, RecommendationType.TWEET);
    assertEqualSocialProofResults(expected8, actual8);

  }

  @Test
  public void testTweetSocialProofsWithInvalidType() {
    // Test cases where the requested social proof types yield no results
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph =
      BipartiteGraphTestHelper.buildSmallTestLeftIndexedPowerLawMultiSegmentBipartiteGraphWithEdgeTypes();

    Long2DoubleMap seedsMap = new Long2DoubleArrayMap(
      new long[] {user1, user2}, new double[] {1.0, 0.5});
    LongSet tweets = new LongArraySet(new long[] {tweet2, tweet3, tweet4, tweet5, tweet6, tweet7});

    // In the graph there are no valid social proofs corresponding to these types
    byte[] validSocialProofTypes = new byte[] {
      AUTHOR_SOCIAL_PROOF_TYPE,
      IS_MENTIONED_SOCIAL_PROOF_TYPE
    };

    SocialProofRequest socialProofRequest = new SocialProofRequest(
      tweets,
      seedsMap,
      validSocialProofTypes
    );
    HashMap<Long, SocialProofResult> results = new HashMap<>();
    new TweetSocialProofGenerator(bipartiteGraph)
      .computeRecommendations(socialProofRequest, new Random(0))
      .getRankedRecommendations().forEach( recInfo ->
      results.put(((SocialProofResult)recInfo).getNode(), (SocialProofResult)recInfo));

    assertTrue(results.isEmpty());
  }

  @Test
  public void testTweetSocialProofsWithUnfavorites() {
    NodeMetadataLeftIndexedMultiSegmentBipartiteGraph graph =
      BipartiteGraphTestHelper.buildTestNodeMetadataLeftIndexedMultiSegmentBipartiteGraphWithUnfavorite();

    Long2DoubleMap seedsMap = new Long2DoubleArrayMap(
        new long[] {user1, user2}, new double[] {1.0, 0.5});
    LongSet tweets = new LongArraySet(new long[] {tweet2, tweet3, tweet4, tweet5, tweet6, tweet7});

    // In the graph there are no valid social proofs corresponding to these types
    byte[] validSocialProofTypes = new byte[] {
      FAVORITE_SOCIAL_PROOF_TYPE,
      RETWEET_SOCIAL_PROOF_TYPE
    };

    SocialProofRequest socialProofRequest = new SocialProofRequest(
      tweets,
      seedsMap,
      validSocialProofTypes
    );
    HashMap<Long, SocialProofResult> results = new HashMap<>();
    new TweetSocialProofGenerator(graph)
      .computeRecommendations(socialProofRequest, new Random(0))
      .getRankedRecommendations().forEach( recInfo ->
      results.put(((SocialProofResult)recInfo).getNode(), (SocialProofResult)recInfo));


  }
}
