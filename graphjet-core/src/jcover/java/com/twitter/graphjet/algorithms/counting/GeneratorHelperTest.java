package com.twitter.graphjet.algorithms.counting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.GeneratorHelper
 *
 * @author Diffblue JCover
 */

public class GeneratorHelperTest {

    @Test(timeout=10000)
    public void addResultToPriorityQueueMaxNumResultsIsMinusOne() {
        PriorityQueue<NodeInfo> topResults = new PriorityQueue<NodeInfo>();
        topResults.add(new NodeInfo(0L, 1.0, 0));
        GeneratorHelper.addResultToPriorityQueue(topResults, new NodeInfo(1L, 1.0, 1), -1);
    }

    @Test(timeout=10000)
    public void addResultToPriorityQueueMaxNumResultsIsOneAndTopResultsIsEmpty() {
        PriorityQueue<NodeInfo> topResults = new PriorityQueue<NodeInfo>();
        NodeInfo nodeInfo2 = new NodeInfo(1L, 1.0, 0);
        GeneratorHelper.addResultToPriorityQueue(topResults, nodeInfo2, 1);
        // unknown collection PriorityQueue<NodeInfo>
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<RecommendationType, Integer> maxNumResultsByRecType = new HashMap<RecommendationType, Integer>();
        ((HashMap<RecommendationType, Integer>)maxNumResultsByRecType).put(RecommendationType.HASHTAG, 1);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMaxNumResults(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), maxNumResultsByRecType, 1, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsOneHundred() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMaxNumResults(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 0, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(100));
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<RecommendationType, Integer> maxNumResultsByRecType = new HashMap<RecommendationType, Integer>();
        ((HashMap<RecommendationType, Integer>)maxNumResultsByRecType).put(RecommendationType.HASHTAG, 0);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMaxNumResults(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), maxNumResultsByRecType, 1, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(0));
    }

    @Test(timeout=10000)
    public void getMinUserSocialProofSize1() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMinUserSocialProofSize(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 0, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(1));
    }

    @Test(timeout=10000)
    public void getMinUserSocialProofSize2() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<RecommendationType, Integer> minUserSocialProofSizes = new HashMap<RecommendationType, Integer>();
        ((HashMap<RecommendationType, Integer>)minUserSocialProofSizes).put(RecommendationType.HASHTAG, 1);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMinUserSocialProofSize(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(1));
    }

    @Test(timeout=10000)
    public void getMinUserSocialProofSizeReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<RecommendationType, Integer> minUserSocialProofSizes = new HashMap<RecommendationType, Integer>();
        ((HashMap<RecommendationType, Integer>)minUserSocialProofSizes).put(RecommendationType.HASHTAG, 0);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(GeneratorHelper.getMinUserSocialProofSize(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), RecommendationType.HASHTAG), is(0));
    }

    @Test(timeout=10000)
    public void getValidNodes() {
        List<NodeInfo> nodeInfoList = new ArrayList<NodeInfo>();
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        ((ArrayList<NodeInfo>)nodeInfoList).add(nodeInfo);
        // unknown collection PriorityQueue<NodeInfo>
    }

    @Test(timeout=10000)
    public void getValidNodesNodeInfoListIsEmptyReturnsEmpty() {
        assertTrue(GeneratorHelper.getValidNodes(new ArrayList<NodeInfo>(), new HashMap<Byte, Integer>(), 1).isEmpty());
    }

    @Test(timeout=10000)
    public void isValidSocialProof() {
        SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[] { new SmallArrayBasedLongToDoubleMap() };
        assertThat(GeneratorHelper.isValidSocialProof(new HashMap<Byte, Integer>(), socialProofs), is(true));
    }

    @Test(timeout=10000)
    public void isValidSocialProofSocialProofsIsEmpty() {
        assertThat(GeneratorHelper.isValidSocialProof(new HashMap<Byte, Integer>(), new SmallArrayBasedLongToDoubleMap[] { }), is(true));
    }

    @Test(timeout=10000)
    public void pickTopSocialProofs() {
        SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[] { new SmallArrayBasedLongToDoubleMap() };
        Map<Byte, com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata> result = GeneratorHelper.pickTopSocialProofs(socialProofs);
        assertTrue(result.get((byte)0).getConnectingUsers().isEmpty());
        assertTrue(result.get((byte)0).getMetadata().isEmpty());
    }

    @Test(timeout=10000)
    public void pickTopSocialProofsSocialProofsIsEmpty() {
        assertThat(GeneratorHelper.pickTopSocialProofs(new SmallArrayBasedLongToDoubleMap[] { }).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void pickTopSocialProofsSocialProofsIsNull() {
        SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[] { null };
        assertThat(GeneratorHelper.pickTopSocialProofs(socialProofs).isEmpty(), is(true));
    }
}
