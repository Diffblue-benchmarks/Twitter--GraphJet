package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.ScaledUpdateNormalization
 */

public class ScaledUpdateNormalizationTest {

    @Test
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsInf() {
        ScaledUpdateNormalization scaledUpdateNormalization = new ScaledUpdateNormalization();
        assertEquals(Double.POSITIVE_INFINITY, scaledUpdateNormalization.computeLeftNeighborContribution(1), 0);
    }

    @Test
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsOneReturnsOne() {
        ScaledUpdateNormalization scaledUpdateNormalization = new ScaledUpdateNormalization();
        assertEquals(1.0, scaledUpdateNormalization.computeScoreNormalization(1.0, 1, 1), 0);
    }
}
