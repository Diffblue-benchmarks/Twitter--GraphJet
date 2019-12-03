package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool
 */

public class OptimizedEdgePoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorMaxNumEdgesIsOneAndNodeDegreesIsEmptyAndStatsReceiverIsNull() {
        int[] nodeDegrees = new int[] { };
        thrown.expect(NullPointerException.class);
        new OptimizedEdgePool(nodeDegrees, 1, null);
    }
}
