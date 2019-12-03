package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityResponse
 */

public class SimilarityResponseTest {

    @Test
    public void constructorQueryNodeDegreeIsOneAndRankedSimilarNodesIsNull() {
        SimilarityResponse similarityResponse = new SimilarityResponse(null, 1);
        assertEquals(1, similarityResponse.getDegree());
        assertNull(similarityResponse.getRankedSimilarNodes());
    }
}
