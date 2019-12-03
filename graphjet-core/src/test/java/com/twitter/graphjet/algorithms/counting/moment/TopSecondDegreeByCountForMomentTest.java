package com.twitter.graphjet.algorithms.counting.moment;

import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class TopSecondDegreeByCountForMomentTest {
  @Test
  public void constructorTest() {
    // Arrange
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;
    int expectedNodesToHit = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new TopSecondDegreeByCountForMoment(leftIndexedBipartiteGraph, expectedNodesToHit, statsReceiver);
  }
}
