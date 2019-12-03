package com.twitter.graphjet.algorithms.salsa.subgraph;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.FinalSubgraphSalsaIteration
 */

public class FinalSubgraphSalsaIterationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        FinalSubgraphSalsaIteration finalSubgraphSalsaIteration = new FinalSubgraphSalsaIteration(salsaSubgraphInternalState);
        // pojo FinalSubgraphSalsaIteration
    }

    @Test
    public void runSingleIterationThrows() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        FinalSubgraphSalsaIteration finalSubgraphSalsaIteration = new FinalSubgraphSalsaIteration(salsaSubgraphInternalState);
        thrown.expect(NullPointerException.class);
        finalSubgraphSalsaIteration.runSingleIteration();
    }
}
