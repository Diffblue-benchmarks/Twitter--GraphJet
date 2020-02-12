package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RecentTweetFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    RecentTweetFilter recentTweetFilter = new RecentTweetFilter(1L, new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(recentTweetFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void timeStampFromTweetIdTest() {
    // Arrange, Act and Assert
    assertEquals(1288834974657L, RecentTweetFilter.timeStampFromTweetId(123L));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    RecentTweetFilter actualRecentTweetFilter = new RecentTweetFilter(1L, new NullStatsReceiver());

    // Assert
    assertTrue(actualRecentTweetFilter.scopedStatsReceiver instanceof NullStatsReceiver);
    assertSame(actualRecentTweetFilter.inputCounter, actualRecentTweetFilter.filteredCounter);
  }

  @Test(timeout=10000)
  public void originalTimeStampFromTweetIdTest() {
    // Arrange, Act and Assert
    assertEquals(1288834974657L, RecentTweetFilter.originalTimeStampFromTweetId(123L));
  }
}

