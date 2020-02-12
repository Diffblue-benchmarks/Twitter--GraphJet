package com.twitter.graphjet.algorithms.intersection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.longs.LongSet;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.IntersectionSimilarityRequest
 *
 * @author Diffblue JCover
 */

public class IntersectionSimilarityRequestDiffblueTest {

    @Test(timeout=10000)
    public void getMaxLowerMultiplicativeDeviationReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertEquals(1.0, new IntersectionSimilarityRequest(1L, -1, seedSet, 0, 1, 1, 1, 1, 1.0, 1.0, false).getMaxLowerMultiplicativeDeviation(), 0);
    }

    @Test(timeout=10000)
    public void getMaxNumNeighborsReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getMaxNumNeighbors(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumNeighborsReturnsZero() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 0, 1, 1, 1, 1, 1.0, 1.0, false).getMaxNumNeighbors(), is(0));
    }

    @Test(timeout=10000)
    public void getMaxNumSamplesPerNeighborReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getMaxNumSamplesPerNeighbor(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumSamplesPerNeighborReturnsZero() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 1, 0, 1, 1, 1.0, 1.0, false).getMaxNumSamplesPerNeighbor(), is(0));
    }

    @Test(timeout=10000)
    public void getMaxUpperMultiplicativeDeviationReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertEquals(1.0, new IntersectionSimilarityRequest(1L, -1, seedSet, 0, 1, 1, 1, 1, 1.0, 1.0, false).getMaxUpperMultiplicativeDeviation(), 0);
    }

    @Test(timeout=10000)
    public void getMinCooccurrenceReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getMinCooccurrence(), is(1));
    }

    @Test(timeout=10000)
    public void getMinCooccurrenceReturnsZero() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 1, 1, 0, 1, 1.0, 1.0, false).getMinCooccurrence(), is(0));
    }

    @Test(timeout=10000)
    public void getMinNeighborDegreeReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getMinNeighborDegree(), is(1));
    }

    @Test(timeout=10000)
    public void getMinNeighborDegreeReturnsZero() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 0, 1, 1, 1, 1.0, 1.0, false).getMinNeighborDegree(), is(0));
    }

    @Test(timeout=10000)
    public void getMinQueryDegreeReturnsOne() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getMinQueryDegree(), is(1));
    }

    @Test(timeout=10000)
    public void getMinQueryDegreeReturnsZero() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 1, 1, 1, 0, 1.0, 1.0, false).getMinQueryDegree(), is(0));
    }

    @Test(timeout=10000)
    public void getPopulateTweetFeaturesReturnsFalse() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 0, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getPopulateTweetFeatures(), is(false));
    }

    @Test(timeout=10000)
    public void getPopulateTweetFeaturesReturnsTrue() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, true).getPopulateTweetFeatures(), is(true));
    }

    @Test(timeout=10000)
    public void getSeedSet() {
        LongSet seedSet = mock(LongSet.class);
        assertThat(new IntersectionSimilarityRequest(1L, 1, seedSet, 1, 1, 1, 1, 1, 1.0, 1.0, false).getSeedSet(), sameInstance(seedSet));
    }
}
