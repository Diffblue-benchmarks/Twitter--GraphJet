package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationResponse
 *
 * @author Diffblue JCover
 */

public class RecommendationResponseDiffblueTest {

    @Test(timeout=10000)
    public void getRankedRecommendations() {
        @SuppressWarnings("unchecked")
        Iterable<RecommendationInfo> rankedRecommendations = mock(Iterable.class);
        assertThat(new RecommendationResponse(rankedRecommendations).getRankedRecommendations(), sameInstance(rankedRecommendations));
    }
}
