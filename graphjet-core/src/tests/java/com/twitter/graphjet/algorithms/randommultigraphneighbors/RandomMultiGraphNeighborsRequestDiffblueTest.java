package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.RandomMultiGraphNeighborsRequest
 *
 * @author Diffblue JCover
 */

public class RandomMultiGraphNeighborsRequestDiffblueTest {

    @Test(timeout=10000)
    public void getLeftSeedNodesWithWeight() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        assertThat(new RandomMultiGraphNeighborsRequest(leftSeedNodesWithWeight, 1, 1).getLeftSeedNodesWithWeight(), sameInstance(leftSeedNodesWithWeight));
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        assertThat(new RandomMultiGraphNeighborsRequest(leftSeedNodesWithWeight, 0, 1).getMaxNumResults(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        assertThat(new RandomMultiGraphNeighborsRequest(leftSeedNodesWithWeight, 1, 0).getMaxNumResults(), is(0));
    }

    @Test(timeout=10000)
    public void getMaxNumSamplesReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        assertThat(new RandomMultiGraphNeighborsRequest(leftSeedNodesWithWeight, 1, 0).getMaxNumSamples(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumSamplesReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        assertThat(new RandomMultiGraphNeighborsRequest(leftSeedNodesWithWeight, 0, 1).getMaxNumSamples(), is(0));
    }
}
