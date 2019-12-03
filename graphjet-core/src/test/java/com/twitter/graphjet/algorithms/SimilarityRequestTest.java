package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityRequest
 */

public class SimilarityRequestTest {

    @Test
    public void constructorMaxNumResultsIsOneAndQueryNodeIsOne() {
        SimilarityRequest similarityRequest = new SimilarityRequest(1L, 1);
        assertEquals(1, similarityRequest.getMaxNumResults());
        assertEquals(1L, similarityRequest.getQueryNode());
    }
}
