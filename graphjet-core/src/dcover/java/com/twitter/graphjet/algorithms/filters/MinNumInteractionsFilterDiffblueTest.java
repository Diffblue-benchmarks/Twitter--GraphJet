package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class MinNumInteractionsFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    MinNumInteractionsFilter minNumInteractionsFilter = new MinNumInteractionsFilter(bipartiteGraph, 1,
        new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(minNumInteractionsFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act
    MinNumInteractionsFilter actualMinNumInteractionsFilter = new MinNumInteractionsFilter(bipartiteGraph, 1,
        new NullStatsReceiver());

    // Assert
    assertTrue(actualMinNumInteractionsFilter.scopedStatsReceiver instanceof NullStatsReceiver);
    assertSame(actualMinNumInteractionsFilter.inputCounter, actualMinNumInteractionsFilter.filteredCounter);
  }

  @Test(timeout=10000)
  public void getStatsScopeTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals("MinNumInteractionsFilter",
        (new MinNumInteractionsFilter(bipartiteGraph, 1, new NullStatsReceiver())).getStatsScope());
  }
}

