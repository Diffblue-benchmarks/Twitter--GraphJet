package com.twitter.graphjet.hashing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap
 *
 * @author Diffblue JCover
 */

public class SmallArrayBasedLongToDoubleMapTest {

    @Test(timeout=10000)
    public void containsKeyIsOneReturnsFalse() {
        assertThat(new SmallArrayBasedLongToDoubleMap().contains(1L), is(false));
    }

    @Test(timeout=10000)
    public void keysReturnsAllZero() {
        assertArrayEquals(new long[] { 0L, 0L, 0L, 0L }, new SmallArrayBasedLongToDoubleMap().keys());
    }

    @Test(timeout=10000)
    public void metadataReturnsAllZero() {
        assertArrayEquals(new long[] { 0L, 0L, 0L, 0L }, new SmallArrayBasedLongToDoubleMap().metadata());
    }

    @Test(timeout=10000)
    public void putKeyIsZeroAndMetadataIsOneAndValueIsOneReturnsTrue() {
        assertThat(new SmallArrayBasedLongToDoubleMap().put(0L, 1.0, 1L), is(true));
    }

    @Test(timeout=10000)
    public void sizeReturnsZero() {
        assertThat(new SmallArrayBasedLongToDoubleMap().size(), is(0));
    }

    @Test(timeout=10000)
    public void sort() {
        new SmallArrayBasedLongToDoubleMap().sort();
    }

    @Test(timeout=10000)
    public void trimInputCapacityIsOneReturnsTrue() {
        assertThat(new SmallArrayBasedLongToDoubleMap().trim(1), is(true));
    }

    @Test(timeout=10000)
    public void uniqueKeysSizeReturnsZero() {
        assertThat(new SmallArrayBasedLongToDoubleMap().uniqueKeysSize(), is(0));
    }

    @Test(timeout=10000)
    public void valuesReturnsAllZero() {
        assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0 }, new SmallArrayBasedLongToDoubleMap().values(), 0);
    }
}
