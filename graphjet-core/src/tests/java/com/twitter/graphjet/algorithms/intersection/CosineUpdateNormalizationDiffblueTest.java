package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.CosineUpdateNormalization
 *
 * @author Diffblue JCover
 */

public class CosineUpdateNormalizationDiffblueTest {

    @Test(timeout=10000)
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        assertEquals(1.0, new CosineUpdateNormalization().computeLeftNeighborContribution(1), 0);
    }

    @Test(timeout=10000)
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsZeroReturnsInf() {
        assertEquals(Double.POSITIVE_INFINITY, new CosineUpdateNormalization().computeScoreNormalization(1.0, 0, 1), 0);
    }
}
