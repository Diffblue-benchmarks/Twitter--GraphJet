package com.twitter.graphjet.algorithms.salsa;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaStats
 *
 * @author Diffblue JCover
 */

public class SalsaStatsDiffblueTest {

    @Test(timeout=10000)
    public void addToNumRHSVisitsNumVisitsIsOne() {
        SalsaStats salsaStats = new SalsaStats();
        salsaStats.addToNumRHSVisits(1);
        assertThat(salsaStats.getNumRHSVisits(), is(1));
    }

    @Test(timeout=10000)
    public void getNumSeedNodesReturnsZero() {
        assertThat(new SalsaStats().getNumSeedNodes(), is(0));
    }

    @Test(timeout=10000)
    public void reset() {
        new SalsaStats().reset();
    }

    @Test(timeout=10000)
    public void setNumSeedNodesToOne() {
        SalsaStats salsaStats = new SalsaStats();
        salsaStats.setNumSeedNodes(1);
        assertThat(salsaStats.getNumSeedNodes(), is(1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new SalsaStats().equals("foo"), is(false));
        assertThat(new SalsaStats().equals(null), is(false));
    }
}
