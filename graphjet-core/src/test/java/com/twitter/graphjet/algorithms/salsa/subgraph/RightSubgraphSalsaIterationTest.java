package com.twitter.graphjet.algorithms.salsa.subgraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.RightSubgraphSalsaIteration
 */

public class RightSubgraphSalsaIterationTest {

    @Test
    public void constructor() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        RightSubgraphSalsaIteration rightSubgraphSalsaIteration = new RightSubgraphSalsaIteration(salsaSubgraphInternalState);
        // pojo RightSubgraphSalsaIteration
    }

    @Test
    public void runSingleIteration() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        RightSubgraphSalsaIteration rightSubgraphSalsaIteration = new RightSubgraphSalsaIteration(salsaSubgraphInternalState);
        rightSubgraphSalsaIteration.runSingleIteration();
    }
}
