package com.twitter.graphjet.algorithms.filters;

import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RelatedTweetDirectInteractionsFilterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph = null;
    long queryUser = 1L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new RelatedTweetDirectInteractionsFilter(bipartiteGraph, queryUser, statsReceiver);
  }
}
