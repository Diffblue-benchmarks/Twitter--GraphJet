package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TweetIDMaskDiffblueTest {
  @Test(timeout=10000)
  public void summaryTest() {
    // Arrange, Act and Assert
    assertEquals(2305843009213693953L, TweetIDMask.summary(1L));
  }

  @Test(timeout=10000)
  public void photoTest() {
    // Arrange, Act and Assert
    assertEquals(4611686018427387905L, TweetIDMask.photo(1L));
  }

  @Test(timeout=10000)
  public void playerTest() {
    // Arrange, Act and Assert
    assertEquals(6917529027641081857L, TweetIDMask.player(1L));
  }

  @Test(timeout=10000)
  public void restoreTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new TweetIDMask()).restore(1L));
  }

  @Test(timeout=10000)
  public void promotionTest() {
    // Arrange, Act and Assert
    assertEquals(-9223372036854775807L, TweetIDMask.promotion(1L));
  }

  @Test(timeout=10000)
  public void tweetTest() {
    // Arrange, Act and Assert
    assertEquals(1L, TweetIDMask.tweet(1L));
  }
}

