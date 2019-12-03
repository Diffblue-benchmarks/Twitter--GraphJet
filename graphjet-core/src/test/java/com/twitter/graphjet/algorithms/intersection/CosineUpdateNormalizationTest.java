package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.intersection.CosineUpdateNormalization
 */

public class CosineUpdateNormalizationTest {

    @Test
    public void computeLeftNeighborContributionLeftNodeDegreeIsOneReturnsOne() {
        CosineUpdateNormalization cosineUpdateNormalization = new CosineUpdateNormalization();
        assertEquals(1.0, cosineUpdateNormalization.computeLeftNeighborContribution(1), 0);
    }

    @Test
    public void computeScoreNormalizationCooccurrenceIsOneAndNodeDegreeIsOneAndSimilarNodeDegreeIsOneReturnsOne() {
        CosineUpdateNormalization cosineUpdateNormalization = new CosineUpdateNormalization();
        assertEquals(1.0, cosineUpdateNormalization.computeScoreNormalization(1.0, 1, 1), 0);
    }
}
