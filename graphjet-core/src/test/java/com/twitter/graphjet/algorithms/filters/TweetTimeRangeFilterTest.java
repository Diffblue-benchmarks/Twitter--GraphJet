package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class TweetTimeRangeFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    long after = 1L;
    long before = 1L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new TweetTimeRangeFilter(after, before, statsReceiver);
  }

  @Test
  public void filterTest() {
    // Arrange
    TweetTimeRangeFilter tweetTimeRangeFilter = new TweetTimeRangeFilter(1L, 1L, new DefaultStatsReceiver("aaaaa"));
    long tweet = 1L;

    // Act
    boolean actual = tweetTimeRangeFilter.filter(tweet);

    // Assert
    assertTrue(actual);
  }

  @Test
  public void originalTimeStampFromTweetIdTest() {
    // Arrange
    long id = 1L;

    // Act
    long actual = TweetTimeRangeFilter.originalTimeStampFromTweetId(id);

    // Assert
    assertEquals(1288834974657L, actual);
  }

  @Test
  public void timeStampFromTweetIdTest() {
    // Arrange
    long id = 1L;

    // Act
    long actual = TweetTimeRangeFilter.timeStampFromTweetId(id);

    // Assert
    assertEquals(1288834974657L, actual);
  }
}



