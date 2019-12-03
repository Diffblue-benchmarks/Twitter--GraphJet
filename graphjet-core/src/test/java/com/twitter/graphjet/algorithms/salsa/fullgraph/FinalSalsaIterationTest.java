package com.twitter.graphjet.algorithms.salsa.fullgraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.FinalSalsaIteration
 */

public class FinalSalsaIterationTest {

    @Test
    public void constructor() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        FinalSalsaIteration finalSalsaIteration = new FinalSalsaIteration(salsaInternalState);
        // pojo FinalSalsaIteration
    }
}
