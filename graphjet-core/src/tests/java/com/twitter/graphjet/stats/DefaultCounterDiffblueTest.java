package com.twitter.graphjet.stats;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.stats.DefaultCounter
 *
 * @author Diffblue JCover
 */

public class DefaultCounterDiffblueTest {

    @Test(timeout=10000)
    public void getCountReturnsZero() {
        assertThat(new DefaultCounter().getCount(), is(0L));
    }

    @Test(timeout=10000)
    public void incr() {
        DefaultCounter defaultCounter = new DefaultCounter();
        defaultCounter.incr();
        assertThat(defaultCounter.getCount(), is(1L));
    }

    @Test(timeout=10000)
    public void incrDeltaIsOne() {
        DefaultCounter defaultCounter = new DefaultCounter();
        defaultCounter.incr(1);
        assertThat(defaultCounter.getCount(), is(1L));
    }
}
