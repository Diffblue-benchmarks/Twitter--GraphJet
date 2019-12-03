package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TweetIDMaskTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new TweetIDMask();
  }

  @Test
  public void photoTest() {
    // Arrange
    long tweet = 1L;

    // Act
    long actual = TweetIDMask.photo(tweet);

    // Assert
    assertEquals(4611686018427387905L, actual);
  }

  @Test
  public void playerTest() {
    // Arrange
    long tweet = 1L;

    // Act
    long actual = TweetIDMask.player(tweet);

    // Assert
    assertEquals(6917529027641081857L, actual);
  }

  @Test
  public void promotionTest() {
    // Arrange
    long tweet = 1L;

    // Act
    long actual = TweetIDMask.promotion(tweet);

    // Assert
    assertEquals(-9223372036854775807L, actual);
  }

  @Test
  public void restoreTest() {
    // Arrange
    TweetIDMask tweetIDMask = new TweetIDMask();
    long node = 1L;

    // Act
    long actual = tweetIDMask.restore(node);

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void summaryTest() {
    // Arrange
    long tweet = 1L;

    // Act
    long actual = TweetIDMask.summary(tweet);

    // Assert
    assertEquals(2305843009213693953L, actual);
  }

  @Test
  public void tweetTest() {
    // Arrange
    long tweet = 1L;

    // Act
    long actual = TweetIDMask.tweet(tweet);

    // Assert
    assertEquals(1L, actual);
  }
}






