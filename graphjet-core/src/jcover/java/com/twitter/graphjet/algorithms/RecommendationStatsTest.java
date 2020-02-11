package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationStats
 *
 * @author Diffblue JCover
 */

public class RecommendationStatsTest {

    @Test(timeout=10000)
    public void addToNumRHSVisitsNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.addToNumRHSVisits(1);
        assertThat(recommendationStats.getNumRHSVisits(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxVisitsPerRightNode() {
        assertThat(new RecommendationStats(1, 1, 1, 1, 1, 1).getMaxVisitsPerRightNode(), is(1));
        assertThat(new RecommendationStats().getMaxVisitsPerRightNode(), is(0));
    }

    @Test(timeout=10000)
    public void getMinVisitsPerRightNode() {
        assertThat(new RecommendationStats().getMinVisitsPerRightNode(), is(2_147_483_647));
        assertThat(new RecommendationStats(1, 1, 1, 0, 1, 1).getMinVisitsPerRightNode(), is(0));
    }

    @Test(timeout=10000)
    public void getNumDirectNeighbors() {
        assertThat(new RecommendationStats(1, 1, 1, 1, 1, 1).getNumDirectNeighbors(), is(1));
        assertThat(new RecommendationStats().getNumDirectNeighbors(), is(0));
    }

    @Test(timeout=10000)
    public void getNumRHSVisits() {
        assertThat(new RecommendationStats(1, 1, 1, 1, 1, 1).getNumRHSVisits(), is(1));
        assertThat(new RecommendationStats().getNumRHSVisits(), is(0));
    }

    @Test(timeout=10000)
    public void getNumRightNodesFiltered() {
        assertThat(new RecommendationStats(1, 1, 1, 1, 1, 1).getNumRightNodesFiltered(), is(1));
        assertThat(new RecommendationStats().getNumRightNodesFiltered(), is(0));
    }

    @Test(timeout=10000)
    public void getNumRightNodesReached() {
        assertThat(new RecommendationStats(1, 1, 1, 1, 1, 1).getNumRightNodesReached(), is(1));
        assertThat(new RecommendationStats().getNumRightNodesReached(), is(0));
    }

    @Test(timeout=10000)
    public void reset() {
        new RecommendationStats().reset();
    }

    @Test(timeout=10000)
    public void setMaxVisitsPerRightNodeToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setMaxVisitsPerRightNode(1);
        assertThat(recommendationStats.getMaxVisitsPerRightNode(), is(1));
    }

    @Test(timeout=10000)
    public void setMinVisitsPerRightNodeToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setMinVisitsPerRightNode(1);
        assertThat(recommendationStats.getMinVisitsPerRightNode(), is(1));
    }

    @Test(timeout=10000)
    public void setNumDirectNeighborsToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumDirectNeighbors(1);
        assertThat(recommendationStats.getNumDirectNeighbors(), is(1));
    }

    @Test(timeout=10000)
    public void setNumRHSVisitsToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRHSVisits(1);
        assertThat(recommendationStats.getNumRHSVisits(), is(1));
    }

    @Test(timeout=10000)
    public void setNumRightNodesFilteredToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRightNodesFiltered(1);
        assertThat(recommendationStats.getNumRightNodesFiltered(), is(1));
    }

    @Test(timeout=10000)
    public void setNumRightNodesReachedToOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.setNumRightNodesReached(1);
        assertThat(recommendationStats.getNumRightNodesReached(), is(1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new RecommendationStats().equals("foo"), is(false));
        assertThat(new RecommendationStats().equals(null), is(false));
    }

    @Test(timeout=10000)
    public void updateMaxVisitsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateMaxVisitsPerRightNode(1);
        assertThat(recommendationStats.getMaxVisitsPerRightNode(), is(1));
    }

    @Test(timeout=10000)
    public void updateMinVisitsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateMinVisitsPerRightNode(1);
        assertThat(recommendationStats.getMinVisitsPerRightNode(), is(1));
    }

    @Test(timeout=10000)
    public void updateVisitStatsPerRightNodeNumVisitsIsOne() {
        RecommendationStats recommendationStats = new RecommendationStats();
        recommendationStats.updateVisitStatsPerRightNode(1);
        assertThat(recommendationStats.getMaxVisitsPerRightNode(), is(1));
        assertThat(recommendationStats.getMinVisitsPerRightNode(), is(1));
    }
}
