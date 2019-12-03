package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.NodeMetadataLeftIndexedPowerLawBipartiteGraphSegment
 */

public class NodeMetadataLeftIndexedPowerLawBipartiteGraphSegmentTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndMaxNumEdgesIsOneAndNumRightNodeMetadataTypesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new NodeMetadataLeftIndexedPowerLawBipartiteGraphSegment(1, 1, 1.0, 1, 1, 1, null, null);
    }
}
