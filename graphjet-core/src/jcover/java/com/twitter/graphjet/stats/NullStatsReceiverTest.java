package com.twitter.graphjet.stats;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.NullStatsReceiver
 *
 * @author Diffblue JCover
 */

public class NullStatsReceiverTest {

    @Test(timeout=10000)
    public void counter() {
        // pojo Counter
    }

    @Test(timeout=10000)
    public void scope() {
        NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
        assertThat(nullStatsReceiver.scope("New York"), instanceOf(NullStatsReceiver.class));
        assertThat(((NullStatsReceiver)nullStatsReceiver.scope("New York")), sameInstance(nullStatsReceiver));
    }
}
