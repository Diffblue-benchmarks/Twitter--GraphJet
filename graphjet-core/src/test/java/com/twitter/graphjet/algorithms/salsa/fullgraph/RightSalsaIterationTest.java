package com.twitter.graphjet.algorithms.salsa.fullgraph;

import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import org.junit.Test;

public class RightSalsaIterationTest {
  @Test
  public void constructorTest() {
    // Arrange
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 1);

    // Act
    new RightSalsaIteration(salsaInternalState);
  }

  @Test
  public void runSingleIterationTest() {
    // Arrange
    RightSalsaIteration rightSalsaIteration = new RightSalsaIteration(
        new SalsaInternalState(null, new SalsaStats(), 1));

    // Act
    rightSalsaIteration.runSingleIteration();
  }
}

