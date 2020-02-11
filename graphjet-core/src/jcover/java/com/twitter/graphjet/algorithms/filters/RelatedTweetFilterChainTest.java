package com.twitter.graphjet.algorithms.filters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.RelatedTweetFilterChain
 *
 * @author Diffblue JCover
 */

public class RelatedTweetFilterChainTest {

    @Test(timeout=10000)
    public void filterTweetIsOneReturnsFalse() {
        assertThat(new RelatedTweetFilterChain(new ArrayList<RelatedTweetFilter>()).filter(1L), is(false));
    }
}
