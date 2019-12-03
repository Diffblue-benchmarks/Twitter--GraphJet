package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.TweetIDMask
 */

public class TweetIDMaskTest {

    @Test
    public void photoTweetIsOne() {
        assertEquals(4_611_686_018_427_387_905L, TweetIDMask.photo(1L));
    }

    @Test
    public void playerTweetIsOne() {
        assertEquals(6_917_529_027_641_081_857L, TweetIDMask.player(1L));
    }

    @Test
    public void promotionTweetIsOne() {
        assertEquals(-9_223_372_036_854_775_807L, TweetIDMask.promotion(1L));
    }

    @Test
    public void restoreNodeIsOneReturnsOne() {
        TweetIDMask tweetIDMask = new TweetIDMask();
        assertEquals(1L, tweetIDMask.restore(1L));
    }

    @Test
    public void summaryTweetIsOne() {
        assertEquals(2_305_843_009_213_693_953L, TweetIDMask.summary(1L));
    }

    @Test
    public void tweetTweetIsOneReturnsOne() {
        assertEquals(1L, TweetIDMask.tweet(1L));
    }
}
