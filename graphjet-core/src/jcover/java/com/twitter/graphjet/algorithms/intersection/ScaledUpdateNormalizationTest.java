package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.ScaledUpdateNormalization
 *
 * @author Diffblue JCover
 */

public class ScaledUpdateNormalizationTest {

    @Test(timeout=10000)
    public void computeLeftNeighborContribution() {
        assertEquals(Double.POSITIVE_INFINITY, new ScaledUpdateNormalization().computeLeftNeighborContribution(1), 0);
        assertEquals(-0.0, new ScaledUpdateNormalization().computeLeftNeighborContribution(0), 0);
    }

    @Test(timeout=10000)
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsZeroReturnsInf() {
        assertEquals(Double.POSITIVE_INFINITY, new ScaledUpdateNormalization().computeScoreNormalization(1.0, 0, 1), 0);
    }
}
