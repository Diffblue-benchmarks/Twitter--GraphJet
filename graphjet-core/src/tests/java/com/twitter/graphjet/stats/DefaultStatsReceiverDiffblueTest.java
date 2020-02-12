package com.twitter.graphjet.stats;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.DefaultStatsReceiver
 *
 * @author Diffblue JCover
 */

public class DefaultStatsReceiverDiffblueTest {

    @Test(timeout=10000)
    public void getCount() {
        assertThat(new DefaultStatsReceiver("/bin/bash").counter("/bin/bash").getCount(), is(0L));
        assertThat(DefaultStatsReceiver.getCount("1"), is(0L));
    }

    @Test(timeout=10000)
    public void scope() {
        // pojo StatsReceiver
    }
}
