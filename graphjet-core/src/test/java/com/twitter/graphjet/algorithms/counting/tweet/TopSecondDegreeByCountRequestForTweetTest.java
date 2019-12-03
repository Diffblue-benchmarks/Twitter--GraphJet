package com.twitter.graphjet.algorithms.counting.tweet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet
 */

public class TopSecondDegreeByCountRequestForTweetTest {

    @Test
    public void constructorLeftSeedNodesWithWeightIsNullAndMaxEdgeAgeInMillisIsOneAndMaxNumResultsByRecTypeIsEmptyAndMaxRightNodeAgeInMillisIsOneAndMaxSocialProofTypeSizeIsOneAndMaxTweetSocialProofSizeIsOneAndMaxUserSocialProofSizeIsOneAndMinUserSocialProofSizesIsEmptyAndQueryNodeIsOneAndRecommendationTypesIsEmptyAndSocialProofTypeUnionsIsEmptyAndSocialProofTypesIsEmptyAndToBeFilteredIsNull() {
        HashSet<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { };
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain resultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        HashSet<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(1L, null, null, recommendationTypes, maxNumResultsByRecType, 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, resultFilterChain, socialProofTypeUnions);
        assertSame(maxNumResultsByRecType, (HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>)topSecondDegreeByCountRequestForTweet.getMaxNumResultsByType());
        assertEquals(1, topSecondDegreeByCountRequestForTweet.getMaxTweetSocialProofSize());
        assertEquals(1, topSecondDegreeByCountRequestForTweet.getMaxUserSocialProofSize());
        assertSame(minUserSocialProofSizes, (HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>)topSecondDegreeByCountRequestForTweet.getMinUserSocialProofSizes());
        assertSame(recommendationTypes, (HashSet<com.twitter.graphjet.algorithms.RecommendationType>)topSecondDegreeByCountRequestForTweet.getRecommendationTypes());
        assertSame(socialProofTypeUnions, (HashSet<byte[]>)topSecondDegreeByCountRequestForTweet.getSocialProofTypeUnions());
        assertNull(topSecondDegreeByCountRequestForTweet.getLeftSeedNodesWithWeight());
        assertEquals(1L, topSecondDegreeByCountRequestForTweet.getMaxEdgeAgeInMillis());
        assertEquals(1L, topSecondDegreeByCountRequestForTweet.getMaxRightNodeAgeInMillis());
        assertEquals(1, topSecondDegreeByCountRequestForTweet.getMaxSocialProofTypeSize());
        assertEquals(1L, topSecondDegreeByCountRequestForTweet.getQueryNode());
        assertArrayEquals(new byte[] { }, topSecondDegreeByCountRequestForTweet.getSocialProofTypes());
        assertNull(topSecondDegreeByCountRequestForTweet.getToBeFiltered());
    }
}
