package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.OverlapUpdateNormalization
 */

public class OverlapUpdateNormalizationTest {

    @Test
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        OverlapUpdateNormalization overlapUpdateNormalization = new OverlapUpdateNormalization();
        assertEquals(1.0, overlapUpdateNormalization.computeLeftNeighborContribution(1), 0);
    }

    @Test
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsOneReturnsOne() {
        OverlapUpdateNormalization overlapUpdateNormalization = new OverlapUpdateNormalization();
        assertEquals(1.0, overlapUpdateNormalization.computeScoreNormalization(1.0, 1, 1), 0);
    }
}
