package com.twitter.graphjet.algorithms.salsa.fullgraph;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.SalsaInternalState
 */

public class SalsaInternalStateTest {

    @Test
    public void constructorBipartiteGraphIsNullAndExpectedNodesToHitIsOne() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        assertNull(salsaInternalState.getBipartiteGraph());
        assertNull(salsaInternalState.getBipartiteGraph());
        assertTrue(salsaInternalState.getCurrentLeftNodes().isEmpty());
        assertTrue(salsaInternalState.getCurrentRightNodes().isEmpty());
        assertTrue(salsaInternalState.getNonZeroSeedSet().isEmpty());
        assertNull(salsaInternalState.getSalsaRequest());
        assertSame(salsaStats, salsaInternalState.getSalsaStats());
        assertTrue(salsaInternalState.getVisitedRightNodes().isEmpty());
    }
}
