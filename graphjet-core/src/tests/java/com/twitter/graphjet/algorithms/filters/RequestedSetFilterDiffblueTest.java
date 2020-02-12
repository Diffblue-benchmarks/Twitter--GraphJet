package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RequestedSetFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    RequestedSetFilter requestedSetFilter = new RequestedSetFilter(new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(requestedSetFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    RequestedSetFilter actualRequestedSetFilter = new RequestedSetFilter(nullStatsReceiver);

    // Assert
    assertSame(nullStatsReceiver, actualRequestedSetFilter.scopedStatsReceiver);
    assertSame(actualRequestedSetFilter.inputCounter, actualRequestedSetFilter.filteredCounter);
  }

  @Test(timeout=10000)
  public void getStatsScopeTest() {
    // Arrange, Act and Assert
    assertEquals("RequestedSetFilter", (new RequestedSetFilter(new NullStatsReceiver())).getStatsScope());
  }
}

