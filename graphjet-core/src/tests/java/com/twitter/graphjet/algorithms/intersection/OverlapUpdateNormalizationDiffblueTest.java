package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.OverlapUpdateNormalization
 *
 * @author Diffblue JCover
 */

public class OverlapUpdateNormalizationDiffblueTest {

    @Test(timeout=10000)
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        assertEquals(1.0, new OverlapUpdateNormalization().computeLeftNeighborContribution(1), 0);
    }

    @Test(timeout=10000)
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsZeroReturnsOne() {
        assertEquals(1.0, new OverlapUpdateNormalization().computeScoreNormalization(1.0, 0, 1), 0);
    }
}
