package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature
 */

public class TweetFeatureTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void atIndexIsOneReturnsTWEET_FEATURE_SIZE() {
        assertTrue(com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature.TWEET_FEATURE_SIZE == TweetFeature.at(1));
    }

    @Test
    public void getValueReturnsZero() {
        assertEquals(0, com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature.TWEET_FEATURE.getValue());
    }

    @Test
    public void valuesReturnsTWEET_FEATURETWEET_FEATURE_SIZE() {
        TweetFeature[] result = TweetFeature.values();
        assertTrue(com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature.TWEET_FEATURE == result[0]);
        assertTrue(com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature.TWEET_FEATURE_SIZE == result[1]);
    }

    @Test
    public void valueOfNameIsFooThrows() {
        // No enum constant com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature.foo
        thrown.expect(IllegalArgumentException.class);
        TweetFeature.valueOf("foo");
    }
}
