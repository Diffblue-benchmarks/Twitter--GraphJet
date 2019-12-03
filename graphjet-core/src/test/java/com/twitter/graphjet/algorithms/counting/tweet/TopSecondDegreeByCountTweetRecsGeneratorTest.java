package com.twitter.graphjet.algorithms.counting.tweet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountTweetRecsGenerator
 */

public class TopSecondDegreeByCountTweetRecsGeneratorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void generateTweetRecsNodeInfoListIsEmptyReturnsEmpty() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        ArrayList<com.twitter.graphjet.algorithms.NodeInfo> nodeInfoList = new ArrayList<com.twitter.graphjet.algorithms.NodeInfo>();
        java.util.List<com.twitter.graphjet.algorithms.RecommendationInfo> result = TopSecondDegreeByCountTweetRecsGenerator.generateTweetRecs(request, nodeInfoList);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generateTweetRecsThrows() {
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
        // Index 4 out of bounds for length 1
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        TopSecondDegreeByCountTweetRecsGenerator.generateTweetRecs(request, nodeInfoList);
    }
}
