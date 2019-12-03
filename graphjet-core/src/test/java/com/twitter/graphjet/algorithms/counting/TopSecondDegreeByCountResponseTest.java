package com.twitter.graphjet.algorithms.counting;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.TopSecondDegreeByCountResponse
 */

public class TopSecondDegreeByCountResponseTest {

    @Test
    public void constructorRankedRecommendationsIsNull() {
        com.twitter.graphjet.algorithms.RecommendationStats topSecondDegreeByCountStats = new com.twitter.graphjet.algorithms.RecommendationStats();
        TopSecondDegreeByCountResponse topSecondDegreeByCountResponse = new TopSecondDegreeByCountResponse(null, topSecondDegreeByCountStats);
        assertSame(topSecondDegreeByCountStats, topSecondDegreeByCountResponse.getTopSecondDegreeByCountStats());
        assertNull(topSecondDegreeByCountResponse.getRankedRecommendations());
    }
}
