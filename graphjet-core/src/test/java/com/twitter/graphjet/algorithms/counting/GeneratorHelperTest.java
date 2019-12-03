package com.twitter.graphjet.algorithms.counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.GeneratorHelper
 */

public class GeneratorHelperTest {

    @Test
    public void addResultToPriorityQueue() {
        PriorityQueue<com.twitter.graphjet.algorithms.NodeInfo> topResults = new PriorityQueue<com.twitter.graphjet.algorithms.NodeInfo>();
        com.twitter.graphjet.algorithms.NodeInfo e = new com.twitter.graphjet.algorithms.NodeInfo(1L, 1.0, 1);
        topResults.add(e);
        com.twitter.graphjet.algorithms.NodeInfo nodeInfo = new com.twitter.graphjet.algorithms.NodeInfo(1L, 1.0, 1);
        GeneratorHelper.addResultToPriorityQueue(topResults, nodeInfo, 1);
    }

    @Test
    public void addResultToPriorityQueueTopResultsIsEmpty() {
        PriorityQueue<com.twitter.graphjet.algorithms.NodeInfo> topResults = new PriorityQueue<com.twitter.graphjet.algorithms.NodeInfo>();
        com.twitter.graphjet.algorithms.NodeInfo nodeInfo = new com.twitter.graphjet.algorithms.NodeInfo(1L, 1.0, 1);
        GeneratorHelper.addResultToPriorityQueue(topResults, nodeInfo, 1);
    }

    @Test
    public void getMaxNumResultsReturnsOne() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        maxNumResultsByRecType.put(com.twitter.graphjet.algorithms.RecommendationType.HASHTAG, 1);
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet request = new com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        assertEquals(1, GeneratorHelper.getMaxNumResults(request, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG));
    }

    @Test
    public void getMaxNumResultsReturnsOneHundred() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet request = new com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        assertEquals(100, GeneratorHelper.getMaxNumResults(request, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG));
    }
}
