package com.twitter.graphjet.algorithms.salsa;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaResponse
 *
 * @author Diffblue JCover
 */

public class SalsaResponseDiffblueTest {

    @Test(timeout=10000)
    public void getSalsaStats() {
        @SuppressWarnings("unchecked")
        Iterable<com.twitter.graphjet.algorithms.RecommendationInfo> rankedRecommendations = mock(Iterable.class);
        SalsaStats salsaStats = new SalsaStats();
        assertThat(new SalsaResponse(rankedRecommendations, salsaStats).getSalsaStats(), sameInstance(salsaStats));
    }
}
