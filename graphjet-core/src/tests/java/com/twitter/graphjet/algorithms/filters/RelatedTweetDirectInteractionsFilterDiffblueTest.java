package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RelatedTweetDirectInteractionsFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertFalse((new RelatedTweetDirectInteractionsFilter(bipartiteGraph, 1L, new NullStatsReceiver())).filter(1L));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act
    RelatedTweetDirectInteractionsFilter actualRelatedTweetDirectInteractionsFilter = new RelatedTweetDirectInteractionsFilter(
        bipartiteGraph, 1L, new NullStatsReceiver());

    // Assert
    assertSame(actualRelatedTweetDirectInteractionsFilter.filteredCounter,
        actualRelatedTweetDirectInteractionsFilter.inputCounter);
  }
}

