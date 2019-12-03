package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.DefaultStatsReceiver
 */

public class DefaultStatsReceiverTest {

    @Test
    public void constructorNameIsFoo() {
        DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("foo");
        // pojo DefaultStatsReceiver
    }

    @Test
    public void counterCounterNameIsFoo() {
        DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("foo");
        DefaultCounter result = defaultStatsReceiver.counter("foo");
        assertEquals(0L, result.getCount());
    }

    @Test
    public void getCountCounterNameIsFooReturnsZero() {
        assertEquals(0L, DefaultStatsReceiver.getCount("foo"));
    }

    @Test
    public void scopeNamespaceIsFoo() {
        DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("foo");
        StatsReceiver result = defaultStatsReceiver.scope("foo");
        // pojo StatsReceiver
    }
}
