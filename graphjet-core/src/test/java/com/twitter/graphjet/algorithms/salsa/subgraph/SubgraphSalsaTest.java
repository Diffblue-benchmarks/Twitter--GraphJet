package com.twitter.graphjet.algorithms.salsa.subgraph;

import com.twitter.graphjet.algorithms.salsa.SalsaRequest;
import com.twitter.graphjet.algorithms.salsa.SalsaResponse;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SubgraphSalsaTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void computeRecommendationsTest() {
    // Arrange
    SubgraphSalsa subgraphSalsa = new SubgraphSalsa(null, 1, 1, new DefaultStatsReceiver("SubgraphSALSA"));
    SalsaRequest request = null;
    Random random = new Random();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    subgraphSalsa.computeRecommendations(request, random);
  }
  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph = null;
    int expectedNodesToHit = 1;
    int expectedNumLeftNodes = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("SubgraphSALSA");

    // Act
    new SubgraphSalsa(bipartiteGraph, expectedNodesToHit, expectedNumLeftNodes, statsReceiver);
  }
}

