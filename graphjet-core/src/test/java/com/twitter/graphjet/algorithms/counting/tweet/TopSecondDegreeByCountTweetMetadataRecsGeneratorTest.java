package com.twitter.graphjet.algorithms.counting.tweet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountTweetMetadataRecsGenerator
 */

public class TopSecondDegreeByCountTweetMetadataRecsGeneratorTest {

    @Test
    public void generateTweetMetadataRecs1() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        ArrayList<com.twitter.graphjet.algorithms.NodeInfo> nodeInfoList = new ArrayList<com.twitter.graphjet.algorithms.NodeInfo>();
        com.twitter.graphjet.algorithms.NodeInfo e = new com.twitter.graphjet.algorithms.NodeInfo(1L, 1.0, 1);
        nodeInfoList.add(e);
        java.util.List<com.twitter.graphjet.algorithms.RecommendationInfo> result = TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(request, nodeInfoList, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generateTweetMetadataRecs2() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        ArrayList<com.twitter.graphjet.algorithms.NodeInfo> nodeInfoList = new ArrayList<com.twitter.graphjet.algorithms.NodeInfo>();
        int[][] nodeMetadata = new int[][] { null };
        com.twitter.graphjet.algorithms.NodeInfo e = new com.twitter.graphjet.algorithms.NodeInfo(1L, nodeMetadata, 1.0, 1);
        nodeInfoList.add(e);
        java.util.List<com.twitter.graphjet.algorithms.RecommendationInfo> result = TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(request, nodeInfoList, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generateTweetMetadataRecs3() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        ArrayList<com.twitter.graphjet.algorithms.NodeInfo> nodeInfoList = new ArrayList<com.twitter.graphjet.algorithms.NodeInfo>();
        int[] element = new int[] { 0, 0 };
        int[][] nodeMetadata = new int[][] { element };
        com.twitter.graphjet.algorithms.NodeInfo e = new com.twitter.graphjet.algorithms.NodeInfo(1L, nodeMetadata, 1.0, 1);
        nodeInfoList.add(e);
        java.util.List<com.twitter.graphjet.algorithms.RecommendationInfo> result = TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(request, nodeInfoList, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generateTweetMetadataRecsNodeInfoListIsEmpty() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        ArrayList<com.twitter.graphjet.algorithms.NodeInfo> nodeInfoList = new ArrayList<com.twitter.graphjet.algorithms.NodeInfo>();
        java.util.List<com.twitter.graphjet.algorithms.RecommendationInfo> result = TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(request, nodeInfoList, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertTrue(result.isEmpty());
    }
}
