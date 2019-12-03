package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.edgepool.WithEdgeMetadataRegularDegreeEdgePool
 */

public class WithEdgeMetadataRegularDegreeEdgePoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNumNodesIsOneAndMaxDegreeIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new WithEdgeMetadataRegularDegreeEdgePool(1, 1, null);
    }
}
