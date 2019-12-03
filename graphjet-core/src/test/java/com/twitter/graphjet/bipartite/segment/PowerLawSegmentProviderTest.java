package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.PowerLawSegmentProvider
 */

public class PowerLawSegmentProviderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndExpectedMaxLeftDegreeIsOneAndExpectedMaxRightDegreeIsOneAndExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftPowerLawExponentIsOneAndRightPowerLawExponentIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new PowerLawSegmentProvider(1, 1, 1.0, 1, 1, 1.0, null, null);
    }
}
