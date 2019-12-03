package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.SimilarityInfo
 */

public class SimilarityInfoTest {

    @Test
    public void compareToReturnsZero() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        SimilarityInfo otherSimilarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        assertEquals(0, similarityInfo.compareTo(otherSimilarityInfo));
    }

    @Test
    public void constructorCooccurrenceIsOneAndDegreeIsOneAndSimilarNodeIsOneAndWeightIsOne() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        assertEquals(1, similarityInfo.getCooccurrence());
        assertEquals(1, similarityInfo.getDegree());
        assertEquals(1L, similarityInfo.getSimilarNode());
        assertEquals(1.0, similarityInfo.getWeight(), 0);
    }

    @Test
    public void equalsObjIsNull() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        assertFalse(similarityInfo.equals(null));
    }

    @Test
    public void equalsReturnsTrue() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        Object obj = new SimilarityInfo(1L, 1.0, 1, 1);
        assertTrue(similarityInfo.equals(obj));
    }

    @Test
    public void testequals1() {
        SimilarityInfo similarityInfo = new SimilarityInfo(0L, 1.0, 1, 1);
        Object obj = new SimilarityInfo(1L, 1.0, 1, 1);
        assertFalse(similarityInfo.equals(obj));
    }

    @Test
    public void testequals2() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, Double.NaN, 1, 1);
        Object obj = new SimilarityInfo(1L, 1.0, 1, 1);
        assertFalse(similarityInfo.equals(obj));
    }

    @Test
    public void testequals3() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 1);
        Object obj = new SimilarityInfo(1L, 1.0, 1, 1);
        assertFalse(similarityInfo.equals(obj));
    }

    @Test
    public void testequals4() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 0);
        Object obj = new SimilarityInfo(1L, 1.0, 1, 1);
        assertFalse(similarityInfo.equals(obj));
    }

    @Test
    public void testhashCode() {
        SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 1, 1);
        assertEquals(67_013_632, similarityInfo.hashCode());
    }
}
