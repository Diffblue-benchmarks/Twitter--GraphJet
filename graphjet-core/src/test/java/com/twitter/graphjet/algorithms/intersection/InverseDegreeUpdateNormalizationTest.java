package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.InverseDegreeUpdateNormalization
 */

public class InverseDegreeUpdateNormalizationTest {

    @Test
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        InverseDegreeUpdateNormalization inverseDegreeUpdateNormalization = new InverseDegreeUpdateNormalization();
        assertEquals(1.0, inverseDegreeUpdateNormalization.computeLeftNeighborContribution(1), 0);
    }

    @Test
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsOneReturnsOne() {
        InverseDegreeUpdateNormalization inverseDegreeUpdateNormalization = new InverseDegreeUpdateNormalization();
        assertEquals(1.0, inverseDegreeUpdateNormalization.computeScoreNormalization(1.0, 1, 1), 0);
    }
}
