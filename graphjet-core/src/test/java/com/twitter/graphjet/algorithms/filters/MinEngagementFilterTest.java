package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.MinEngagementFilter
 */

public class MinEngagementFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndMinEngagementIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new MinEngagementFilter(1, null, null);
    }
}
