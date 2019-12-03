package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.edgepool.WithEdgeMetadataPowerLawDegreeEdgePool
 */

public class WithEdgeMetadataPowerLawDegreeEdgePoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedMaxDegreeIsOneAndExpectedNumNodesIsOneAndPowerLawExponentIsOneAndStatsReceiverIsNull() {
        // The power-law exponent must be greater than 1.0!
        thrown.expect(IllegalArgumentException.class);
        new WithEdgeMetadataPowerLawDegreeEdgePool(1, 1, 1.0, null);
    }
}
