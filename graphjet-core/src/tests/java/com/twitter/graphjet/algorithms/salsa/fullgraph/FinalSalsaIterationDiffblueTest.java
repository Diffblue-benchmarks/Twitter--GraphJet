package com.twitter.graphjet.algorithms.salsa.fullgraph;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class FinalSalsaIterationDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());

    // Act and Assert
    assertTrue((new FinalSalsaIteration(new SalsaInternalState(bipartiteGraph, new SalsaStats(),
        1))).nodeVisitor instanceof SalsaNodeVisitor.NodeVisitorWithSocialProof);
  }
}

