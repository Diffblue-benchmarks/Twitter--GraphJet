package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.TweetCardFilter
 */

public class TweetCardFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorPhotoIsTrueAndPlayerIsTrueAndPromotionIsTrueAndStatsReceiverIsNullAndSummaryIsTrueAndTweetIsTrue() {
        thrown.expect(NullPointerException.class);
        new TweetCardFilter(true, true, true, true, true, null);
    }
}
