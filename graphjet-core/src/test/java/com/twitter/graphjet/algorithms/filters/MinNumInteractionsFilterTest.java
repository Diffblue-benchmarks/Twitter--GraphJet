package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.MinNumInteractionsFilter
 */

public class MinNumInteractionsFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndMinNumInteractionsIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new MinNumInteractionsFilter(null, 1, null);
    }
}
