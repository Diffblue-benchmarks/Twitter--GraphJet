package com.twitter.graphjet.algorithms.salsa.subgraph;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.SubgraphSalsa
 */

public class SubgraphSalsaTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndExpectedNodesToHitIsOneAndExpectedNumLeftNodesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new SubgraphSalsa(null, 1, 1, null);
    }
}
