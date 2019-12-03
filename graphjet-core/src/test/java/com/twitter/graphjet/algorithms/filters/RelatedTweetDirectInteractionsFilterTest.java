package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.RelatedTweetDirectInteractionsFilter
 */

public class RelatedTweetDirectInteractionsFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndQueryUserIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RelatedTweetDirectInteractionsFilter(null, 1L, null);
    }
}
