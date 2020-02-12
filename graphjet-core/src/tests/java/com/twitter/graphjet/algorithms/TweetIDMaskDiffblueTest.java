package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.TweetIDMask
 *
 * @author Diffblue JCover
 */

public class TweetIDMaskDiffblueTest {

    @Test(timeout=10000)
    public void photoTweetIsOne() {
        assertThat(TweetIDMask.photo(1L), is(4_611_686_018_427_387_905L));
    }

    @Test(timeout=10000)
    public void playerTweetIsOne() {
        assertThat(TweetIDMask.player(1L), is(6_917_529_027_641_081_857L));
    }

    @Test(timeout=10000)
    public void promotionTweetIsOne() {
        assertThat(TweetIDMask.promotion(1L), is(-9_223_372_036_854_775_807L));
    }

    @Test(timeout=10000)
    public void restore() {
        assertThat(new TweetIDMask().restore(1L), is(1L));
        assertThat(new TweetIDMask().restore(0L), is(0L));
    }

    @Test(timeout=10000)
    public void summaryTweetIsOne() {
        assertThat(TweetIDMask.summary(1L), is(2_305_843_009_213_693_953L));
    }

    @Test(timeout=10000)
    public void tweet() {
        assertThat(TweetIDMask.tweet(1L), is(1L));
        assertThat(TweetIDMask.tweet(0L), is(0L));
    }
}
