package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweetfeature.TweetRecommendationInfo
 *
 * @author Diffblue JCover
 */

public class TweetRecommendationInfoTest {

    @Test(timeout=10000)
    public void equalsReturnsFalse() {
        int[] tweetFeature = new int[] { 1 };
        assertThat(new TweetRecommendationInfo(1L, 1.0, new HashMap<Byte, com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata>(), tweetFeature).equals(new Object()), is(false));
    }

    @Test(timeout=10000)
    public void getTweetFeatureReturnsOne() {
        int[] tweetFeature = new int[] { 1 };
        assertArrayEquals(new int[] { 1 }, new TweetRecommendationInfo(1L, 1.0, new HashMap<Byte, com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata>(), tweetFeature).getTweetFeature());
    }
}
