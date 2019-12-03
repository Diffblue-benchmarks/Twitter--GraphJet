package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.edgepool.WithEdgeMetadataOptimizedEdgePool
 */

public class WithEdgeMetadataOptimizedEdgePoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorMaxNumEdgesIsOneAndNodeDegreesIsEmptyAndStatsReceiverIsNull() {
        int[] nodeDegrees = new int[] { };
        thrown.expect(NullPointerException.class);
        new WithEdgeMetadataOptimizedEdgePool(nodeDegrees, 1, null);
    }
}
