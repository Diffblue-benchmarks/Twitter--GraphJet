package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class TweetCardFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest3() {
    // Arrange
    TweetCardFilter tweetCardFilter = new TweetCardFilter(true, true, true, true, true, new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(tweetCardFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void filterResultTest2() {
    // Arrange
    TweetCardFilter tweetCardFilter = new TweetCardFilter(true, true, true, true, true, new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(tweetCardFilter.filterResult(9223372036854775807L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    TweetCardFilter tweetCardFilter = new TweetCardFilter(false, true, true, true, true, new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(tweetCardFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TweetCardFilter actualTweetCardFilter = new TweetCardFilter(true, true, true, true, true, new NullStatsReceiver());

    // Assert
    assertTrue(actualTweetCardFilter.scopedStatsReceiver instanceof NullStatsReceiver);
    assertSame(actualTweetCardFilter.inputCounter, actualTweetCardFilter.filteredCounter);
  }
}

