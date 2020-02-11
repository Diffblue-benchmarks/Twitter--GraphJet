package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class ANDFiltersDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    ANDFilters actualAndFilters = new ANDFilters(null, nullStatsReceiver);

    // Assert
    assertSame(nullStatsReceiver, actualAndFilters.scopedStatsReceiver);
    assertSame(actualAndFilters.inputCounter, actualAndFilters.filteredCounter);
  }
}

