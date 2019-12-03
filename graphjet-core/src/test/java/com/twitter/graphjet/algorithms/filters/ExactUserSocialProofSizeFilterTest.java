package com.twitter.graphjet.algorithms.filters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.ExactUserSocialProofSizeFilter
 */

public class ExactUserSocialProofSizeFilterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExactNumUserSocialProofIsOneAndStatsReceiverIsNullAndValidSocialProofTypeIsEmpty() {
        byte[] validSocialProofType = new byte[] { };
        thrown.expect(NullPointerException.class);
        new ExactUserSocialProofSizeFilter(1, validSocialProofType, null);
    }
}
