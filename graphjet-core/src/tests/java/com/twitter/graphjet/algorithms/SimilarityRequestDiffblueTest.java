package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityRequest
 *
 * @author Diffblue JCover
 */

public class SimilarityRequestDiffblueTest {

    @Test(timeout=10000)
    public void getMaxNumResults() {
        assertThat(new SimilarityRequest(1L, 1).getMaxNumResults(), is(1));
        assertThat(new SimilarityRequest(1L, 0).getMaxNumResults(), is(0));
    }

    @Test(timeout=10000)
    public void getQueryNode() {
        assertThat(new SimilarityRequest(1L, 1).getQueryNode(), is(1L));
        assertThat(new SimilarityRequest(0L, 1).getQueryNode(), is(0L));
    }
}
