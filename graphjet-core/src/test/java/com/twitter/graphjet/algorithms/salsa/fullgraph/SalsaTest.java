package com.twitter.graphjet.algorithms.salsa.fullgraph;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.Salsa
 */

public class SalsaTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndExpectedNodesToHitIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new Salsa(null, 1, null);
    }
}
