package com.twitter.graphjet.algorithms.counting.tweet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TweetRecommendationInfo
 *
 * @author Diffblue JCover
 */

public class TweetRecommendationInfoTest {

    @Test(timeout=10000)
    public void equalsReturnsFalse() {
        assertThat(new TweetRecommendationInfo(1L, 1.0, new HashMap<Byte, com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata>()).equals(new Object()), is(false));
    }
}
