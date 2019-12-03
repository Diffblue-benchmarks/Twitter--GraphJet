package com.twitter.graphjet.algorithms.salsa.subgraph;

import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import org.junit.Test;

public class RightSubgraphSalsaIterationTest {
  @Test
  public void constructorTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 1,
        1);

    // Act
    new RightSubgraphSalsaIteration(salsaSubgraphInternalState);
  }

  @Test
  public void runSingleIterationTest() {
    // Arrange
    RightSubgraphSalsaIteration rightSubgraphSalsaIteration = new RightSubgraphSalsaIteration(
        new SalsaSubgraphInternalState(null, new SalsaStats(), 1, 1));

    // Act
    rightSubgraphSalsaIteration.runSingleIteration();
  }
}

