package com.twitter.graphjet.algorithms.counting.moment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.moment.MomentRecommendationInfo
 *
 * @author Diffblue JCover
 */

public class MomentRecommendationInfoTest {

    @Test(timeout=10000)
    public void equalsReturnsFalse() {
        assertThat(new MomentRecommendationInfo(1L, 1.0, new HashMap<Byte, com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata>()).equals(new Object()), is(false));
    }
}
