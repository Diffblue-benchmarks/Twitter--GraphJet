package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.NeighborInfo
 *
 * @author Diffblue JCover
 */

public class NeighborInfoTest {

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new NeighborInfo(0L, Double.NaN, 0).compareTo(new NeighborInfo(1L, 1.0, 1)), is(1));
        assertThat(new NeighborInfo(0L, 1.0, 0).compareTo(new NeighborInfo(1L, 1.0, 1)), is(0));
    }

    @Test(timeout=10000)
    public void getDegree() {
        assertThat(new NeighborInfo(1L, 1.0, 1).getDegree(), is(1));
        assertThat(new NeighborInfo(1L, 1.0, 0).getDegree(), is(0));
    }

    @Test(timeout=10000)
    public void getNeighborNode() {
        assertThat(new NeighborInfo(1L, 1.0, 1).getNeighborNode(), is(1L));
        assertThat(new NeighborInfo(0L, 1.0, 1).getNeighborNode(), is(0L));
    }

    @Test(timeout=10000)
    public void getScoreReturnsOne() {
        assertEquals(1.0, new NeighborInfo(1L, 1.0, 1).getScore(), 0);
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new NeighborInfo(1L, 1.0, 1).equals("foo"), is(false));
        assertThat(new NeighborInfo(1L, 1.0, 1).equals(null), is(false));
    }
}
