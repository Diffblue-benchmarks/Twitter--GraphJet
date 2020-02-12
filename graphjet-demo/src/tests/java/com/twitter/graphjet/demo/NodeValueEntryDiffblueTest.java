package com.twitter.graphjet.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.demo.NodeValueEntry
 *
 * @author Diffblue JCover
 */

public class NodeValueEntryDiffblueTest {

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new NodeValueEntry(0L, 1.0).compareTo(new NodeValueEntry(1L, 1.0)), is(-1));
        assertThat(new NodeValueEntry(1L, 1.0).compareTo(new NodeValueEntry(0L, 1.0)), is(1));
    }

    @Test(timeout=10000)
    public void getNode() {
        assertThat(new NodeValueEntry(1L, 1.0).getNode(), is(1L));
        assertThat(new NodeValueEntry(0L, 1.0).getNode(), is(0L));
    }

    @Test(timeout=10000)
    public void getValueReturnsOne() {
        assertEquals(1.0, new NodeValueEntry(1L, 1.0).getValue(), 0);
    }
}
