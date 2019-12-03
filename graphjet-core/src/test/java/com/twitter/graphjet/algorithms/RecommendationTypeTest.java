package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.RecommendationType
 */

public class RecommendationTypeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void atIndexIsOneReturnsURL() {
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.URL == RecommendationType.at(1));
    }

    @Test
    public void getValueReturnsZero() {
        assertEquals(0, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG.getValue());
    }

    @Test
    public void valuesReturnsHASHTAGURLMETADATASIZETWEETUSERMOMENT() {
        RecommendationType[] result = RecommendationType.values();
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.HASHTAG == result[0]);
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.URL == result[1]);
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.METADATASIZE == result[2]);
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.TWEET == result[3]);
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.USER == result[4]);
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.MOMENT == result[5]);
    }

    @Test
    public void valueOfNameIsFooThrows() {
        // No enum constant com.twitter.graphjet.algorithms.RecommendationType.foo
        thrown.expect(IllegalArgumentException.class);
        RecommendationType.valueOf("foo");
    }
}
