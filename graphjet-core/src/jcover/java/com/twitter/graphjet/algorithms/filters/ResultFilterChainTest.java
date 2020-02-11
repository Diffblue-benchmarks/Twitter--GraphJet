package com.twitter.graphjet.algorithms.filters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.RecommendationRequest;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.ResultFilterChain
 *
 * @author Diffblue JCover
 */

public class ResultFilterChainTest {

    @Test(timeout=10000)
    public void filterResultNodeIsOneReturnsFalse() {
        SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[] { new SmallArrayBasedLongToDoubleMap() };
        assertThat(new ResultFilterChain(new ArrayList<ResultFilter>()).filterResult(1L, socialProofs), is(false));
    }

    @Test(timeout=10000)
    public void resetFilters1() {
        RecommendationRequest request = mock(RecommendationRequest.class);
        new ResultFilterChain(new ArrayList<ResultFilter>()).resetFilters(request);
    }

    @Test(timeout=10000)
    public void resetFilters2() {
        List<ResultFilter> resultFilterSet = new ArrayList<ResultFilter>();
        ResultFilter resultFilter = mock(ResultFilter.class);
        ((ArrayList<ResultFilter>)resultFilterSet).add(resultFilter);
        RecommendationRequest request = mock(RecommendationRequest.class);
        new ResultFilterChain(resultFilterSet).resetFilters(request);
    }
}
