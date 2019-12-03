package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.IntersectionSimilarityRequest
 */

public class IntersectionSimilarityRequestTest {

    @Test
    public void constructorMaxLowerMultiplicativeDeviationIsOneAndMaxNumNeighborsIsOneAndMaxNumResultsIsOneAndMaxNumSamplesPerNeighborIsOneAndMaxUpperMultiplicativeDeviationIsOneAndMinCooccurrenceIsOneAndMinNeighborDegreeIsOneAndMinQueryDegreeIsOneAndPopulateTweetFeaturesIsTrueAndQueryNodeIsOneAndSeedSetIsNull() {
        IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1, null, 1, 1, 1, 1, 1, 1.0, 1.0, true);
        assertEquals(1.0, intersectionSimilarityRequest.getMaxLowerMultiplicativeDeviation(), 0);
        assertEquals(1, intersectionSimilarityRequest.getMaxNumNeighbors());
        assertEquals(1, intersectionSimilarityRequest.getMaxNumSamplesPerNeighbor());
        assertEquals(1.0, intersectionSimilarityRequest.getMaxUpperMultiplicativeDeviation(), 0);
        assertEquals(1, intersectionSimilarityRequest.getMinCooccurrence());
        assertEquals(1, intersectionSimilarityRequest.getMinNeighborDegree());
        assertEquals(1, intersectionSimilarityRequest.getMinQueryDegree());
        assertTrue(intersectionSimilarityRequest.getPopulateTweetFeatures());
        assertNull(intersectionSimilarityRequest.getSeedSet());
        assertEquals(1, intersectionSimilarityRequest.getMaxNumResults());
        assertEquals(1L, intersectionSimilarityRequest.getQueryNode());
    }
}
