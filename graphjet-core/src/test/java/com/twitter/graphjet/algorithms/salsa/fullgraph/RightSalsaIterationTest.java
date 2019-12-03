package com.twitter.graphjet.algorithms.salsa.fullgraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.RightSalsaIteration
 */

public class RightSalsaIterationTest {

    @Test
    public void constructor() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        RightSalsaIteration rightSalsaIteration = new RightSalsaIteration(salsaInternalState);
        // pojo RightSalsaIteration
    }

    @Test
    public void runSingleIteration() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        RightSalsaIteration rightSalsaIteration = new RightSalsaIteration(salsaInternalState);
        rightSalsaIteration.runSingleIteration();
    }
}
