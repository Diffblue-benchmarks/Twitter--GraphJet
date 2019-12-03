package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationResponse
 */

public class RecommendationResponseTest {

    @Test
    public void constructorRankedRecommendationsIsNull() {
        RecommendationResponse recommendationResponse = new RecommendationResponse(null);
        assertNull(recommendationResponse.getRankedRecommendations());
    }
}
