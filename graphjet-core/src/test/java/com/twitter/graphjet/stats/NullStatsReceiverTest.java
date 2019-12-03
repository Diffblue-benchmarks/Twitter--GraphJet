package com.twitter.graphjet.stats;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.NullStatsReceiver
 */

public class NullStatsReceiverTest {

    @Test
    public void constructor() {
        NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
        // pojo NullStatsReceiver
    }

    @Test
    public void counterCounterNameIsFoo() {
        NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
        Counter result = nullStatsReceiver.counter("foo");
        // pojo Counter
    }

    @Test
    public void scopeNamespaceIsFoo() {
        NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
        StatsReceiver result = nullStatsReceiver.scope("foo");
        assertTrue(result instanceof NullStatsReceiver);
        assertSame(nullStatsReceiver, ((NullStatsReceiver)result));
    }
}
