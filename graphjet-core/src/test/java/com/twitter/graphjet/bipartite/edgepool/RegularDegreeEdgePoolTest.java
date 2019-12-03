package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool
 */

public class RegularDegreeEdgePoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNumNodesIsOneAndMaxDegreeIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RegularDegreeEdgePool(1, 1, null);
    }
}
