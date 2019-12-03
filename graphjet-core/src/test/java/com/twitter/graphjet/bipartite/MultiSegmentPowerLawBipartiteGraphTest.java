package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph
 */

public class MultiSegmentPowerLawBipartiteGraphTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedMaxRightDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndMaxNumEdgesPerSegmentIsOneAndMaxNumSegmentsIsOneAndRightPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new MultiSegmentPowerLawBipartiteGraph(1, 1, 1, 1, 1.0, 1, 1, 1.0, null, null);
    }
}
