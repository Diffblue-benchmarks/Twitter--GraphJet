package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.LeftIndexedPowerLawSegmentProvider
 */

public class LeftIndexedPowerLawSegmentProviderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new LeftIndexedPowerLawSegmentProvider(1, 1, 1.0, 1, null, null);
    }
}
