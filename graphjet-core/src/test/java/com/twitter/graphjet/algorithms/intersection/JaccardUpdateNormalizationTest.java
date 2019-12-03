package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.JaccardUpdateNormalization
 */

public class JaccardUpdateNormalizationTest {

    @Test
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        JaccardUpdateNormalization jaccardUpdateNormalization = new JaccardUpdateNormalization();
        assertEquals(1.0, jaccardUpdateNormalization.computeLeftNeighborContribution(1), 0);
    }

    @Test
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsOneReturnsOne() {
        JaccardUpdateNormalization jaccardUpdateNormalization = new JaccardUpdateNormalization();
        assertEquals(1.0, jaccardUpdateNormalization.computeScoreNormalization(1.0, 1, 1), 0);
    }
}
