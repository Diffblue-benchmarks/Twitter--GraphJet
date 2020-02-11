package com.twitter.graphjet.algorithms.counting.tweet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.filters.ResultFilterChain;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet
 *
 * @author Diffblue JCover
 */

public class TopSecondDegreeByCountRequestForTweetTest {

    @Test(timeout=10000)
    public void getMaxNumResultsByType() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<com.twitter.graphjet.algorithms.RecommendationType, Integer> maxNumResultsByRecType = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), maxNumResultsByRecType, 1, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMaxNumResultsByType(), sameInstance(maxNumResultsByRecType));
    }

    @Test(timeout=10000)
    public void getMaxTweetSocialProofSizeReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMaxTweetSocialProofSize(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxTweetSocialProofSizeReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 0, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMaxTweetSocialProofSize(), is(0));
    }

    @Test(timeout=10000)
    public void getMaxUserSocialProofSizeReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(0L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMaxUserSocialProofSize(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxUserSocialProofSizeReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 0, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMaxUserSocialProofSize(), is(0));
    }

    @Test(timeout=10000)
    public void getMinUserSocialProofSizes() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<com.twitter.graphjet.algorithms.RecommendationType, Integer> minUserSocialProofSizes = new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>();
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 1, minUserSocialProofSizes, socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getMinUserSocialProofSizes(), sameInstance(minUserSocialProofSizes));
    }

    @Test(timeout=10000)
    public void getRecommendationTypes() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Set<com.twitter.graphjet.algorithms.RecommendationType> recommendationTypes = new HashSet<com.twitter.graphjet.algorithms.RecommendationType>();
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, recommendationTypes, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), new HashSet<byte[]>()).getRecommendationTypes(), sameInstance(recommendationTypes));
    }

    @Test(timeout=10000)
    public void getSocialProofTypeUnions() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        Set<byte[]> socialProofTypeUnions = new HashSet<byte[]>();
        assertThat(new TopSecondDegreeByCountRequestForTweet(1L, leftSeedNodesWithWeight, toBeFiltered, new HashSet<com.twitter.graphjet.algorithms.RecommendationType>(), new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), 1, 1, 1, new HashMap<com.twitter.graphjet.algorithms.RecommendationType, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>()), socialProofTypeUnions).getSocialProofTypeUnions(), sameInstance(socialProofTypeUnions));
    }
}
