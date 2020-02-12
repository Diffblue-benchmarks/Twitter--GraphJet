package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class TweetTimeRangeFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterTest() {
    // Arrange, Act and Assert
    assertTrue((new TweetTimeRangeFilter(1L, 1L, new NullStatsReceiver())).filter(1L));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TweetTimeRangeFilter actualTweetTimeRangeFilter = new TweetTimeRangeFilter(1L, 1L, new NullStatsReceiver());

    // Assert
    assertSame(actualTweetTimeRangeFilter.filteredCounter, actualTweetTimeRangeFilter.inputCounter);
  }

  @Test(timeout=10000)
  public void timeStampFromTweetIdTest() {
    // Arrange, Act and Assert
    assertEquals(1288834974657L, TweetTimeRangeFilter.timeStampFromTweetId(123L));
  }

  @Test(timeout=10000)
  public void originalTimeStampFromTweetIdTest() {
    // Arrange, Act and Assert
    assertEquals(1288834974657L, TweetTimeRangeFilter.originalTimeStampFromTweetId(123L));
  }
}

