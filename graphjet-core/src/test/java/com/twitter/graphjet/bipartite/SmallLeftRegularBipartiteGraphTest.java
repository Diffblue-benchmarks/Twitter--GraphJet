package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph
 */

public class SmallLeftRegularBipartiteGraphTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorLeftDegreeIsOneAndMaxNumEdgesIsOneAndMaxNumLeftNodesIsOneAndMaxNumRightNodesIsOneAndMaxRightDegreeIsOneAndRightPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new SmallLeftRegularBipartiteGraph(1, 1, 1, 1, 1.0, 1, null);
    }
}
