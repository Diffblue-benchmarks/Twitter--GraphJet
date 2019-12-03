package com.twitter.graphjet.algorithms.filters;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.ResultFilterChain
 */

public class ResultFilterChainTest {

    @Test
    public void constructorResultFilterSetIsEmpty() {
        ArrayList<ResultFilter> resultFilterSet = new ArrayList<ResultFilter>();
        ResultFilterChain resultFilterChain = new ResultFilterChain(resultFilterSet);
        // pojo ResultFilterChain
    }

    @Test
    public void filterResultNodeIsOneAndSocialProofsIsEmptyReturnsFalse() {
        ArrayList<ResultFilter> resultFilterSet = new ArrayList<ResultFilter>();
        ResultFilterChain resultFilterChain = new ResultFilterChain(resultFilterSet);
        com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap[] socialProofs = new com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap[] { };
        assertFalse(resultFilterChain.filterResult(1L, socialProofs));
    }

    @Test
    public void resetFiltersRequestIsNull() {
        ArrayList<ResultFilter> resultFilterSet = new ArrayList<ResultFilter>();
        ResultFilterChain resultFilterChain = new ResultFilterChain(resultFilterSet);
        resultFilterChain.resetFilters(null);
    }
}
