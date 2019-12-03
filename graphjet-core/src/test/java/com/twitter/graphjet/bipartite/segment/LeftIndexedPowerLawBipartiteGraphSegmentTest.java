package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.LeftIndexedPowerLawBipartiteGraphSegment
 */

public class LeftIndexedPowerLawBipartiteGraphSegmentTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndMaxNumEdgesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new LeftIndexedPowerLawBipartiteGraphSegment(1, 1, 1.0, 1, 1, null, null);
    }
}
