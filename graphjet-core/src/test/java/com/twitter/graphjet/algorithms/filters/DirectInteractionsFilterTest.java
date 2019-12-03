package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.DirectInteractionsFilter
 */

public class DirectInteractionsFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new DirectInteractionsFilter(null, null);
    }
}
