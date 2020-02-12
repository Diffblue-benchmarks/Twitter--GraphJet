package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationType
 *
 * @author Diffblue JCover
 */

public class RecommendationTypeDiffblueTest {

    @Test(timeout=10000)
    public void atIndexIsOneReturnsURL() {
        assertThat(RecommendationType.at(1), is(RecommendationType.URL));
    }

    @Test(timeout=10000)
    public void getValue() {
        assertThat(RecommendationType.URL.getValue(), is(1));
        assertThat(RecommendationType.HASHTAG.getValue(), is(0));
    }

    @Test(timeout=10000)
    public void valuesReturnsHASHTAGURLMETADATASIZETWEETUSERMOMENT() {
        RecommendationType[] result = RecommendationType.values();
        assertThat(result[0], is(RecommendationType.HASHTAG));
        assertThat(result[1], is(RecommendationType.URL));
        assertThat(result[2], is(RecommendationType.METADATASIZE));
        assertThat(result[3], is(RecommendationType.TWEET));
        assertThat(result[4], is(RecommendationType.USER));
        assertThat(result[5], is(RecommendationType.MOMENT));
    }
}
