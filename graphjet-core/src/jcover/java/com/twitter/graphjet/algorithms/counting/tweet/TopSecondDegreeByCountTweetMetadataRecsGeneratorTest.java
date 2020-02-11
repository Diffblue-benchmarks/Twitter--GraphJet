package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountTweetMetadataRecsGenerator
 *
 * @author Diffblue JCover
 */

public class TopSecondDegreeByCountTweetMetadataRecsGeneratorTest {

    @Test(timeout=10000)
    public void generateTweetMetadataRecs() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        List<NodeInfo> nodeInfoList = new ArrayList<NodeInfo>();
        ((ArrayList<NodeInfo>)nodeInfoList).add(new NodeInfo(1L, 1.0, 1));
        assertTrue(TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(new TopSecondDegreeByCountRequestForTweet(-1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 0, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 0L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), nodeInfoList, RecommendationType.HASHTAG).isEmpty());
    }

    @Test(timeout=10000)
    public void generateTweetMetadataRecsNodeInfoListIsEmpty() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertTrue(TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<RecommendationType>(), new HashMap<RecommendationType, Integer>(), 1, 1, 1, new HashMap<RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()), new ArrayList<NodeInfo>(), RecommendationType.HASHTAG).isEmpty());
    }

    @Test(timeout=10000)
    public void generateTweetMetadataRecsRequestIsNull() {
        List<NodeInfo> nodeInfoList = new ArrayList<NodeInfo>();
        int[][] nodeMetadata = new int[][] { null };
        ((ArrayList<NodeInfo>)nodeInfoList).add(new NodeInfo(1L, nodeMetadata, 1.0, 1));
        assertTrue(TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(null, nodeInfoList, RecommendationType.HASHTAG).isEmpty());
    }
}
