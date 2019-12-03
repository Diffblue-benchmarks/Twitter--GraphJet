package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph
 */

public class RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraphTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndMaxNumEdgesPerSegmentIsOneAndMaxNumSegmentsIsOneAndNumRightNodeMetadataTypesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(1, 1, 1, 1, 1.0, 1, 1, null, null);
    }
}
