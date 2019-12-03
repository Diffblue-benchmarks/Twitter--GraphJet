package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.RecentTweetFilter
 */

public class RecentTweetFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void originalTimeStampFromTweetIdIdIsOne() {
        assertEquals(1_288_834_974_657L, RecentTweetFilter.originalTimeStampFromTweetId(1L));
    }

    @Test
    public void constructorKeepWithInLastXMillisIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RecentTweetFilter(1L, null);
    }
}
