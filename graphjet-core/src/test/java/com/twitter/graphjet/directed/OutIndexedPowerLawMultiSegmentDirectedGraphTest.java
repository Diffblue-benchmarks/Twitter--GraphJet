package com.twitter.graphjet.directed;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.directed.OutIndexedPowerLawMultiSegmentDirectedGraph
 */

public class OutIndexedPowerLawMultiSegmentDirectedGraphTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxDegreeIsOneAndExpectedNumNodesIsOneAndMaxNumEdgesPerSegmentIsOneAndMaxNumSegmentsIsOneAndPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new OutIndexedPowerLawMultiSegmentDirectedGraph(1, 1, 1, 1, 1.0, null, null);
    }
}
