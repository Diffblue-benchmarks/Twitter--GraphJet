package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.RecentEdgeMetadataFilter
 */

public class RecentEdgeMetadataFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorRejectWithInLastXMillisIsOneAndSocialProofTypeIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RecentEdgeMetadataFilter(1L, (byte)1, null);
    }
}
