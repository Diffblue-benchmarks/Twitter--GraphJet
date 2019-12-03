package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaResponse
 */

public class SalsaResponseTest {

    @Test
    public void constructorRankedRecommendationsIsNull() {
        SalsaStats salsaStats = new SalsaStats();
        SalsaResponse salsaResponse = new SalsaResponse(null, salsaStats);
        assertSame(salsaStats, salsaResponse.getSalsaStats());
        assertNull(salsaResponse.getRankedRecommendations());
    }
}
