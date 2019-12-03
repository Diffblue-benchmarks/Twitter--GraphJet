package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.NeighborInfo
 */

public class NeighborInfoTest {

    @Test
    public void compareToReturnsZero() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 1);
        NeighborInfo otherNeighborInfo = new NeighborInfo(1L, 1.0, 1);
        assertEquals(0, neighborInfo.compareTo(otherNeighborInfo));
    }

    @Test
    public void constructorDegreeIsOneAndNeighborNodeIsOneAndScoreIsOne() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 1);
        assertEquals(1, neighborInfo.getDegree());
        assertEquals(1L, neighborInfo.getNeighborNode());
        assertEquals(1.0, neighborInfo.getScore(), 0);
    }

    @Test
    public void equalsObjIsNull() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 1);
        assertFalse(neighborInfo.equals(null));
    }

    @Test
    public void equalsReturnsTrue() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 1);
        Object obj = new NeighborInfo(1L, 1.0, 1);
        assertTrue(neighborInfo.equals(obj));
    }

    @Test
    public void testequals1() {
        NeighborInfo neighborInfo = new NeighborInfo(0L, 1.0, 1);
        Object obj = new NeighborInfo(1L, 1.0, 1);
        assertFalse(neighborInfo.equals(obj));
    }

    @Test
    public void testequals2() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, Double.NaN, 1);
        Object obj = new NeighborInfo(1L, 1.0, 1);
        assertFalse(neighborInfo.equals(obj));
    }

    @Test
    public void testequals3() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);
        Object obj = new NeighborInfo(1L, 1.0, 1);
        assertFalse(neighborInfo.equals(obj));
    }

    @Test
    public void testhashCode() {
        NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 1);
        assertEquals(-1_106_216_927, neighborInfo.hashCode());
    }
}
