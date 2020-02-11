package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweetfeature.TopSecondDegreeByCountTweetRecsGenerator
 *
 * @author Diffblue JCover
 */

public class TopSecondDegreeByCountTweetRecsGeneratorTest {

    @Test(timeout=10000)
    public void generateTweetRecs() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        List<NodeInfo> nodeInfoList = new ArrayList<NodeInfo>();
        ((ArrayList<NodeInfo>)nodeInfoList).add(new NodeInfo(1L, 1.0, 5));
        assertTrue(TopSecondDegreeByCountTweetRecsGenerator.generateTweetRecs(new TopSecondDegreeByCountRequestForTweet(-1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 0, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), nodeInfoList).isEmpty());
    }

    @Test(timeout=10000)
    public void generateTweetRecsNodeInfoListIsEmpty() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertTrue(TopSecondDegreeByCountTweetRecsGenerator.generateTweetRecs(new TopSecondDegreeByCountRequestForTweet(-1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), -1, 0, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 0L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), new ArrayList<NodeInfo>()).isEmpty());
    }
}
