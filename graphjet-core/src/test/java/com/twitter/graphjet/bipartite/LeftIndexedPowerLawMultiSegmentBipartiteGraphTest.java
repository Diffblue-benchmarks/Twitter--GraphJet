package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph
 */

public class LeftIndexedPowerLawMultiSegmentBipartiteGraphTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndMaxNumEdgesPerSegmentIsOneAndMaxNumSegmentsIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new LeftIndexedPowerLawMultiSegmentBipartiteGraph(1, 1, 1, 1, 1.0, 1, null, null);
    }
}
