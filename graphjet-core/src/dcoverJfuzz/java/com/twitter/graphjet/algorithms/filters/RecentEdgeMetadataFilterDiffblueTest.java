package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RecentEdgeMetadataFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    RecentEdgeMetadataFilter recentEdgeMetadataFilter = new RecentEdgeMetadataFilter(1L, (byte) 1,
        new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(recentEdgeMetadataFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    RecentEdgeMetadataFilter actualRecentEdgeMetadataFilter = new RecentEdgeMetadataFilter(1L, (byte) 1,
        nullStatsReceiver);

    // Assert
    assertSame(nullStatsReceiver, actualRecentEdgeMetadataFilter.scopedStatsReceiver);
    assertSame(actualRecentEdgeMetadataFilter.inputCounter, actualRecentEdgeMetadataFilter.filteredCounter);
  }
}

