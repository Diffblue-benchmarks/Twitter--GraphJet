package com.twitter.graphjet.algorithms.salsa.subgraph;

import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FinalSubgraphSalsaIterationTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 1,
        1);

    // Act
    new FinalSubgraphSalsaIteration(salsaSubgraphInternalState);
  }

  @Test
  public void runSingleIterationTest() {
    // Arrange
    FinalSubgraphSalsaIteration finalSubgraphSalsaIteration = new FinalSubgraphSalsaIteration(
        new SalsaSubgraphInternalState(null, new SalsaStats(), 1, 1));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    finalSubgraphSalsaIteration.runSingleIteration();
  }
}

