package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityResponse
 *
 * @author Diffblue JCover
 */

public class SimilarityResponseDiffblueTest {

    @Test(timeout=10000)
    public void getDegreeReturnsOne() {
        @SuppressWarnings("unchecked")
        Iterable<SimilarityInfo> rankedSimilarNodes = mock(Iterable.class);
        assertThat(new SimilarityResponse(rankedSimilarNodes, 1).getDegree(), is(1));
    }

    @Test(timeout=10000)
    public void getDegreeReturnsZero() {
        @SuppressWarnings("unchecked")
        Iterable<SimilarityInfo> rankedSimilarNodes = mock(Iterable.class);
        assertThat(new SimilarityResponse(rankedSimilarNodes, 0).getDegree(), is(0));
    }

    @Test(timeout=10000)
    public void getRankedSimilarNodes() {
        @SuppressWarnings("unchecked")
        Iterable<SimilarityInfo> rankedSimilarNodes = mock(Iterable.class);
        assertThat(new SimilarityResponse(rankedSimilarNodes, 1).getRankedSimilarNodes(), sameInstance(rankedSimilarNodes));
    }
}
