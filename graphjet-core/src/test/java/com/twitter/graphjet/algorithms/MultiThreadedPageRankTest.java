package com.twitter.graphjet.algorithms;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.MultiThreadedPageRank
 */

public class MultiThreadedPageRankTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorDampingFactorIsOneAndGraphIsNullAndMaxIterationsIsOneAndMaxNodeIdIsOneAndNodesIsEmptyAndThreadsIsOneAndToleranceIsOne() {
        it.unimi.dsi.fastutil.longs.LongArrayList nodes = new it.unimi.dsi.fastutil.longs.LongArrayList();
        MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, nodes, 1L, 1.0, 1, 1.0, 1);
        assertEquals(0x1.fffffffffffffp+1023 /* 1.79769e+308 */, multiThreadedPageRank.getL1Norm(), 0);
        assertNull(multiThreadedPageRank.getPageRankVector());
    }

    @Test
    public void runReturnsOne() {
        it.unimi.dsi.fastutil.longs.LongArrayList nodes = new it.unimi.dsi.fastutil.longs.LongArrayList();
        MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, nodes, 1L, 1.0, 1, 1.0, 1);
        assertEquals(1, multiThreadedPageRank.run());
        assertEquals(0.0, multiThreadedPageRank.getL1Norm(), 0);
        // pojo com.google.common.util.concurrent.AtomicDoubleArray
    }

    @Test
    public void runReturnsZero() {
        it.unimi.dsi.fastutil.longs.LongArrayList nodes = new it.unimi.dsi.fastutil.longs.LongArrayList();
        MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, nodes, 1L, 1.0, 1, 0x1.fffffffffffffp+1023 /* 1.79769e+308 */, 1);
        assertEquals(0, multiThreadedPageRank.run());
        // pojo com.google.common.util.concurrent.AtomicDoubleArray
    }

    @Test
    public void runThrows() {
        LinkedList<Long> c = new LinkedList<Long>();
        c.add(1L);
        it.unimi.dsi.fastutil.longs.LongArrayList nodes = new it.unimi.dsi.fastutil.longs.LongArrayList(c);
        MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, nodes, 1L, 1.0, 1, 1.0, 1);
        thrown.expect(NullPointerException.class);
        multiThreadedPageRank.run();
    }
}
