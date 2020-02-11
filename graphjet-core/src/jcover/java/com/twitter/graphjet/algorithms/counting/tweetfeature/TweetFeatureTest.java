package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweetfeature.TweetFeature
 *
 * @author Diffblue JCover
 */

public class TweetFeatureTest {

    @Test(timeout=10000)
    public void atIndexIsOneReturnsTWEET_FEATURE_SIZE() {
        assertThat(TweetFeature.at(1), is(TweetFeature.TWEET_FEATURE_SIZE));
    }

    @Test(timeout=10000)
    public void getValue() {
        assertThat(TweetFeature.TWEET_FEATURE_SIZE.getValue(), is(1));
        assertThat(TweetFeature.TWEET_FEATURE.getValue(), is(0));
    }

    @Test(timeout=10000)
    public void valuesReturnsTWEET_FEATURETWEET_FEATURE_SIZE() {
        TweetFeature[] result = TweetFeature.values();
        assertThat(result[0], is(TweetFeature.TWEET_FEATURE));
        assertThat(result[1], is(TweetFeature.TWEET_FEATURE_SIZE));
    }
}
