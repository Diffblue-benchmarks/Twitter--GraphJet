package com.twitter.graphjet.algorithms.counting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.RecommendationStats;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.TopSecondDegreeByCountResponse
 *
 * @author Diffblue JCover
 */

public class TopSecondDegreeByCountResponseDiffblueTest {

    @Test(timeout=10000)
    public void getTopSecondDegreeByCountStats() {
        @SuppressWarnings("unchecked")
        Iterable<com.twitter.graphjet.algorithms.RecommendationInfo> rankedRecommendations = mock(Iterable.class);
        RecommendationStats topSecondDegreeByCountStats = new RecommendationStats();
        assertThat(new TopSecondDegreeByCountResponse(rankedRecommendations, topSecondDegreeByCountStats).getTopSecondDegreeByCountStats(), sameInstance(topSecondDegreeByCountStats));
    }
}
