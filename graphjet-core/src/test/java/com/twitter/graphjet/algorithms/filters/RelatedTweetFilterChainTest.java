package com.twitter.graphjet.algorithms.filters;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.RelatedTweetFilterChain
 */

public class RelatedTweetFilterChainTest {

    @Test
    public void constructorFilterSetIsEmpty() {
        ArrayList<RelatedTweetFilter> filterSet = new ArrayList<RelatedTweetFilter>();
        RelatedTweetFilterChain relatedTweetFilterChain = new RelatedTweetFilterChain(filterSet);
        // pojo RelatedTweetFilterChain
    }

    @Test
    public void filterTweetIsOneReturnsFalse() {
        ArrayList<RelatedTweetFilter> filterSet = new ArrayList<RelatedTweetFilter>();
        RelatedTweetFilterChain relatedTweetFilterChain = new RelatedTweetFilterChain(filterSet);
        assertFalse(relatedTweetFilterChain.filter(1L));
    }
}
