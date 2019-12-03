package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationStats
 */

public class RecommendationStatsTest {

    @Test
    public void addToNumRHSVisitsNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.addToNumRHSVisits(1);
        assertEquals(1, recommendationStats.getNumRHSVisits());
    }

    @Test
    public void constructor() {
        RecommendationStats recommendationStats = new RecommendationStats();
        assertEquals(0, recommendationStats.getMaxVisitsPerRightNode());
        assertEquals(2_147_483_647, recommendationStats.getMinVisitsPerRightNode());
        assertEquals(0, recommendationStats.getNumDirectNeighbors());
        assertEquals(0, recommendationStats.getNumRHSVisits());
        assertEquals(0, recommendationStats.getNumRightNodesFiltered());
        assertEquals(0, recommendationStats.getNumRightNodesReached());
    }

    @Test
    public void equalsObjIsNull() {
        RecommendationStats recommendationStats = new RecommendationStats();
        assertFalse(recommendationStats.equals(null));
    }

    @Test
    public void equalsReturnsTrue() {
        RecommendationStats recommendationStats = new RecommendationStats();
        Object obj = new RecommendationStats();
        assertTrue(recommendationStats.equals(obj));
    }

    @Test
    public void reset() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.reset();
    }

    @Test
    public void setMaxVisitsPerRightNodeToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setMaxVisitsPerRightNode(1);
        assertEquals(1, recommendationStats.getMaxVisitsPerRightNode());
    }

    @Test
    public void setMinVisitsPerRightNodeToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setMinVisitsPerRightNode(1);
        assertEquals(1, recommendationStats.getMinVisitsPerRightNode());
    }

    @Test
    public void setNumDirectNeighborsToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumDirectNeighbors(1);
        assertEquals(1, recommendationStats.getNumDirectNeighbors());
    }

    @Test
    public void setNumRHSVisitsToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRHSVisits(1);
        assertEquals(1, recommendationStats.getNumRHSVisits());
    }

    @Test
    public void setNumRightNodesFilteredToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRightNodesFiltered(1);
        assertEquals(1, recommendationStats.getNumRightNodesFiltered());
    }

    @Test
    public void setNumRightNodesReachedToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRightNodesReached(1);
        assertEquals(1, recommendationStats.getNumRightNodesReached());
    }

    @Test
    public void testequals1() {
        RecommendationStats recommendationStats = new RecommendationStats();
        Object obj = new RecommendationStats(1, 1, 1, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testequals2() {
        RecommendationStats recommendationStats = new RecommendationStats();
        Object obj = new RecommendationStats(0, 1, 1, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testequals3() {
        RecommendationStats recommendationStats = new RecommendationStats(1, 1, 1, 1, 0, 1);
        Object obj = new RecommendationStats(1, 1, 1, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testequals4() {
        RecommendationStats recommendationStats = new RecommendationStats(1, 1, 1, 1, 1, 0);
        Object obj = new RecommendationStats(1, 1, 1, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testequals5() {
        RecommendationStats recommendationStats = new RecommendationStats();
        Object obj = new RecommendationStats(0, 0, 1, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testequals6() {
        RecommendationStats recommendationStats = new RecommendationStats();
        Object obj = new RecommendationStats(0, 0, 0, 1, 1, 1);
        assertFalse(recommendationStats.equals(obj));
    }

    @Test
    public void testhashCode() {
        RecommendationStats recommendationStats = new RecommendationStats();
        assertEquals(-1_259_980_928, recommendationStats.hashCode());
    }

    @Test
    public void updateMaxVisitsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateMaxVisitsPerRightNode(1);
        assertEquals(1, recommendationStats.getMaxVisitsPerRightNode());
    }

    @Test
    public void updateMinVisitsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateMinVisitsPerRightNode(1);
        assertEquals(1, recommendationStats.getMinVisitsPerRightNode());
    }

    @Test
    public void updateVisitStatsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateVisitStatsPerRightNode(1);
        assertEquals(1, recommendationStats.getMaxVisitsPerRightNode());
        assertEquals(1, recommendationStats.getMinVisitsPerRightNode());
    }
}
