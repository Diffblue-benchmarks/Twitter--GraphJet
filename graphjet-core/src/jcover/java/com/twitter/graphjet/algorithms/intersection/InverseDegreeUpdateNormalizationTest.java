package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.InverseDegreeUpdateNormalization
 *
 * @author Diffblue JCover
 */

public class InverseDegreeUpdateNormalizationTest {

    @Test(timeout=10000)
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        assertEquals(1.0, new InverseDegreeUpdateNormalization().computeLeftNeighborContribution(1), 0);
    }

    @Test(timeout=10000)
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsZeroReturnsOne() {
        assertEquals(1.0, new InverseDegreeUpdateNormalization().computeScoreNormalization(1.0, 0, 1), 0);
    }
}
