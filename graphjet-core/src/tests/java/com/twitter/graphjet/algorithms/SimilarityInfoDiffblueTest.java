package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityInfo
 *
 * @author Diffblue JCover
 */

public class SimilarityInfoDiffblueTest {

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new SimilarityInfo(0L, Double.NaN, -1, 0).compareTo(new SimilarityInfo(1L, 1.0, 1, 1)), is(1));
        assertThat(new SimilarityInfo(0L, 1.0, -1, 0).compareTo(new SimilarityInfo(1L, 1.0, 1, 1)), is(0));
    }

    @Test(timeout=10000)
    public void getCooccurrence() {
        assertThat(new SimilarityInfo(1L, 1.0, 1, 0).getCooccurrence(), is(1));
        assertThat(new SimilarityInfo(1L, 1.0, 0, 1).getCooccurrence(), is(0));
    }

    @Test(timeout=10000)
    public void getDegree() {
        assertThat(new SimilarityInfo(1L, 1.0, 0, 1).getDegree(), is(1));
        assertThat(new SimilarityInfo(1L, 1.0, 1, 0).getDegree(), is(0));
    }

    @Test(timeout=10000)
    public void getSimilarNode() {
        assertThat(new SimilarityInfo(1L, 1.0, 0, 1).getSimilarNode(), is(1L));
        assertThat(new SimilarityInfo(0L, 1.0, 1, 1).getSimilarNode(), is(0L));
    }

    @Test(timeout=10000)
    public void getWeightReturnsOne() {
        assertEquals(1.0, new SimilarityInfo(1L, 1.0, 0, 1).getWeight(), 0);
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new SimilarityInfo(1L, 1.0, 0, 1).equals("foo"), is(false));
        assertThat(new SimilarityInfo(1L, 1.0, 0, 1).equals(null), is(false));
    }
}
