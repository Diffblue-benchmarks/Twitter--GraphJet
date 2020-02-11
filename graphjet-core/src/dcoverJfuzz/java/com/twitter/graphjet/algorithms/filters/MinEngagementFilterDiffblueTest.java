package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class MinEngagementFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterTest2() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertTrue((new MinEngagementFilter(1, bipartiteGraph, new NullStatsReceiver())).filter(1L));
  }

  @Test(timeout=10000)
  public void filterTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertFalse((new MinEngagementFilter(0, bipartiteGraph, new NullStatsReceiver())).filter(1L));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act
    MinEngagementFilter actualMinEngagementFilter = new MinEngagementFilter(1, bipartiteGraph, new NullStatsReceiver());

    // Assert
    assertSame(actualMinEngagementFilter.filteredCounter, actualMinEngagementFilter.inputCounter);
  }
}

