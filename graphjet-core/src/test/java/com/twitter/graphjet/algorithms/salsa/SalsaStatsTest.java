package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaStats
 */

public class SalsaStatsTest {

    @Test
    public void constructor() {
        SalsaStats salsaStats = new SalsaStats();
        assertEquals(0, salsaStats.getNumSeedNodes());
        assertEquals(0, salsaStats.getMaxVisitsPerRightNode());
        assertEquals(2_147_483_647, salsaStats.getMinVisitsPerRightNode());
        assertEquals(0, salsaStats.getNumDirectNeighbors());
        assertEquals(0, salsaStats.getNumRHSVisits());
        assertEquals(0, salsaStats.getNumRightNodesFiltered());
        assertEquals(0, salsaStats.getNumRightNodesReached());
    }

    @Test
    public void equalsObjIsNull() {
        SalsaStats salsaStats = new SalsaStats();
        assertFalse(salsaStats.equals(null));
    }

    @Test
    public void reset() {
        SalsaStats salsaStats = new SalsaStats();
        salsaStats.reset();
    }

    @Test
    public void setNumSeedNodesToOne() {
        SalsaStats salsaStats = new SalsaStats();
        salsaStats.setNumSeedNodes(1);
        assertEquals(1, salsaStats.getNumSeedNodes());
    }

    @Test
    public void testequals() {
        SalsaStats salsaStats = new SalsaStats();
        Object obj = new com.twitter.graphjet.algorithms.RecommendationStats();
        assertFalse(salsaStats.equals(obj));
    }

    @Test
    public void testhashCode() {
        SalsaStats salsaStats = new SalsaStats();
        assertEquals(-404_674_274, salsaStats.hashCode());
    }
}
