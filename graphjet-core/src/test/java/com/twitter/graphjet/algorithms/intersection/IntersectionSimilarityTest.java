package com.twitter.graphjet.algorithms.intersection;

import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class IntersectionSimilarityTest {
  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("lessThanMaxNumNeighbors");
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    CosineUpdateNormalization relatedTweetUpdateNormalization = null;

    // Act
    new IntersectionSimilarity(bipartiteGraph, relatedTweetUpdateNormalization, statsReceiver);
  }
}
