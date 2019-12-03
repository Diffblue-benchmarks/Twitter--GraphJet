package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.PageRank
 */

public class PageRankTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorDampingFactorIsOneAndGraphIsNullAndMaxIterationsIsOneAndMaxNodeIdIsOneAndNodesIsEmptyAndToleranceIsOne() {
        it.unimi.dsi.fastutil.longs.LongOpenHashSet nodes = new it.unimi.dsi.fastutil.longs.LongOpenHashSet();
        PageRank pageRank = new PageRank(null, nodes, 1L, 1.0, 1, 1.0);
        assertEquals(0x1.fffffffffffffp+1023 /* 1.79769e+308 */, pageRank.getL1Norm(), 0);
        assertNull(pageRank.getPageRankVector());
    }

    @Test
    public void runReturnsOne() {
        it.unimi.dsi.fastutil.longs.LongOpenHashSet nodes = new it.unimi.dsi.fastutil.longs.LongOpenHashSet();
        PageRank pageRank = new PageRank(null, nodes, 1L, 1.0, 1, 1.0);
        assertEquals(1, pageRank.run());
        assertEquals(0.0, pageRank.getL1Norm(), 0);
        assertArrayEquals(new double[] { 0.0, 0.0 }, pageRank.getPageRankVector(), 0);
    }

    @Test
    public void runReturnsZero() {
        it.unimi.dsi.fastutil.longs.LongOpenHashSet nodes = new it.unimi.dsi.fastutil.longs.LongOpenHashSet();
        PageRank pageRank = new PageRank(null, nodes, 1L, 1.0, 1, 0x1.fffffffffffffp+1023 /* 1.79769e+308 */);
        assertEquals(0, pageRank.run());
        assertArrayEquals(new double[] { 0.0, 0.0 }, pageRank.getPageRankVector(), 0);
    }

    @Test
    public void runThrows() {
        long[] a = new long[] { 1L };
        it.unimi.dsi.fastutil.longs.LongOpenHashSet nodes = new it.unimi.dsi.fastutil.longs.LongOpenHashSet(a);
        PageRank pageRank = new PageRank(null, nodes, 1L, 1.0, 1, 1.0);
        thrown.expect(NullPointerException.class);
        pageRank.run();
    }
}
