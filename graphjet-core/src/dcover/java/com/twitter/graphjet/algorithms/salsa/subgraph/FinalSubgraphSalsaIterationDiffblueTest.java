package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class FinalSubgraphSalsaIterationDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph leftIndexedBipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(leftIndexedBipartiteGraph,
        new SalsaStats(), 1, 10);

    // Act
    FinalSubgraphSalsaIteration actualFinalSubgraphSalsaIteration = new FinalSubgraphSalsaIteration(
        salsaSubgraphInternalState);

    // Assert
    assertSame(salsaSubgraphInternalState, actualFinalSubgraphSalsaIteration.salsaSubgraphInternalState);
    assertTrue(actualFinalSubgraphSalsaIteration.firstIteration);
    assertTrue(
        actualFinalSubgraphSalsaIteration.nodeVisitor instanceof SalsaNodeVisitor.WeightedNodeVisitorWithSocialProof);
  }
}

