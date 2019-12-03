package com.twitter.graphjet.algorithms.salsa.fullgraph;

import com.twitter.graphjet.algorithms.salsa.SalsaRequest;
import com.twitter.graphjet.algorithms.salsa.SalsaResponse;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void computeRecommendationsTest() {
    // Arrange
    Salsa salsa = new Salsa(null, 1, new DefaultStatsReceiver("SALSA"));
    SalsaRequest request = null;
    Random random = new Random();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsa.computeRecommendations(request, random);
  }
  @Test
  public void constructorTest() {
    // Arrange
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    int expectedNodesToHit = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("SALSA");

    // Act
    new Salsa(bipartiteGraph, expectedNodesToHit, statsReceiver);
  }
}

