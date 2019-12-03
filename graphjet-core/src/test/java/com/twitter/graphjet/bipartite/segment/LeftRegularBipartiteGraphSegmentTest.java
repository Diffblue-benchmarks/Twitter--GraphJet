package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.LeftRegularBipartiteGraphSegment
 */

public class LeftRegularBipartiteGraphSegmentTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxRightDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftDegreeIsOneAndMaxNumEdgesIsOneAndRightPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new LeftRegularBipartiteGraphSegment(1, 1, 1, 1, 1.0, 1, null, null);
    }
}
