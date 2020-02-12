package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class DirectInteractionsFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    DirectInteractionsFilter directInteractionsFilter = new DirectInteractionsFilter(bipartiteGraph,
        new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(directInteractionsFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    DirectInteractionsFilter actualDirectInteractionsFilter = new DirectInteractionsFilter(bipartiteGraph,
        nullStatsReceiver);

    // Assert
    assertSame(nullStatsReceiver, actualDirectInteractionsFilter.scopedStatsReceiver);
    assertSame(actualDirectInteractionsFilter.inputCounter, actualDirectInteractionsFilter.filteredCounter);
  }

  @Test(timeout=10000)
  public void getStatsScopeTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals("DirectInteractionsFilter",
        (new DirectInteractionsFilter(bipartiteGraph, new NullStatsReceiver())).getStatsScope());
  }
}

