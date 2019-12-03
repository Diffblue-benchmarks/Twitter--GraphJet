package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap
 */

public class SmallArrayBasedLongToDoubleMapTest {

    @Test
    public void constructor() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        // pojo SmallArrayBasedLongToDoubleMap
    }

    @Test
    public void containsKeyIsOneReturnsFalse() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        assertFalse(smallArrayBasedLongToDoubleMap.contains(1L));
    }

    @Test
    public void keysReturnsAllZero() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        long[] result = smallArrayBasedLongToDoubleMap.keys();
        assertArrayEquals(new long[] { 0L, 0L, 0L, 0L }, result);
    }

    @Test
    public void metadataReturnsAllZero() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        long[] result = smallArrayBasedLongToDoubleMap.metadata();
        assertArrayEquals(new long[] { 0L, 0L, 0L, 0L }, result);
    }

    @Test
    public void putKeyIsOneAndMetadataIsOneAndValueIsOneReturnsTrue() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        assertTrue(smallArrayBasedLongToDoubleMap.put(1L, 1.0, 1L));
    }

    @Test
    public void sizeReturnsZero() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        assertEquals(0, smallArrayBasedLongToDoubleMap.size());
    }

    @Test
    public void sort() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        smallArrayBasedLongToDoubleMap.sort();
    }

    @Test
    public void trimInputCapacityIsOneReturnsTrue() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        assertTrue(smallArrayBasedLongToDoubleMap.trim(1));
    }

    @Test
    public void uniqueKeysSizeReturnsZero() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        assertEquals(0, smallArrayBasedLongToDoubleMap.uniqueKeysSize());
    }

    @Test
    public void valuesReturnsAllZero() {
        SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
        double[] result = smallArrayBasedLongToDoubleMap.values();
        assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0 }, result, 0);
    }
}
