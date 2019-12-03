package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.SocialProofTypesFilter
 */

public class SocialProofTypesFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new SocialProofTypesFilter(null);
    }
}
