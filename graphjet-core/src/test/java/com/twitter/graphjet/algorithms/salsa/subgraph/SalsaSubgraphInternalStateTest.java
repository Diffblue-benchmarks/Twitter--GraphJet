package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.SalsaSubgraphInternalState
 */

public class SalsaSubgraphInternalStateTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNodesToHitIsOneAndExpectedNumLeftNodesIsOneAndLeftIndexedBipartiteGraphIsNull() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        assertNull(salsaSubgraphInternalState.getBipartiteGraph());
        assertTrue(salsaSubgraphInternalState.getCurrentLeftNodes().isEmpty());
        assertTrue(salsaSubgraphInternalState.getCurrentRightNodes().isEmpty());
        assertTrue(salsaSubgraphInternalState.getNonZeroSeedSet().isEmpty());
        assertNull(salsaSubgraphInternalState.getSalsaRequest());
        assertSame(salsaStats, salsaSubgraphInternalState.getSalsaStats());
        assertTrue(salsaSubgraphInternalState.getVisitedRightNodes().isEmpty());
    }

    @Test
    public void traverseSubgraphRightToLeft() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        salsaSubgraphInternalState.traverseSubgraphRightToLeft();
    }

    @Test
    public void resetWithRequestIncomingSalsaRequestIsNullThrows() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, salsaStats, 1, 1);
        thrown.expect(NullPointerException.class);
        salsaSubgraphInternalState.resetWithRequest(null);
    }
}
