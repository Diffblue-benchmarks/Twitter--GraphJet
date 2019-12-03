package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.DefaultCounter
 */

public class DefaultCounterTest {

    @Test
    public void constructor() {
        DefaultCounter defaultCounter = new DefaultCounter();
        assertEquals(0L, defaultCounter.getCount());
    }

    @Test
    public void incr() {
        DefaultCounter defaultCounter = new DefaultCounter();
        defaultCounter.incr();
        assertEquals(1L, defaultCounter.getCount());
    }

    @Test
    public void incrDeltaIsOne() {
        DefaultCounter defaultCounter = new DefaultCounter();
        defaultCounter.incr(1);
        assertEquals(1L, defaultCounter.getCount());
    }
}
