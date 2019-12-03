package com.twitter.graphjet.hashing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.ArrayBasedIntToIntArrayMap
 */

public class ArrayBasedIntToIntArrayMapTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNumNodesIsOne() {
        thrown.expect(NullPointerException.class);
        new ArrayBasedIntToIntArrayMap(1, 1, null);
    }

    @Test
    public void constructorExpectedNumNodesIsZero() {
        // Need to have at least one node!
        thrown.expect(IllegalArgumentException.class);
        new ArrayBasedIntToIntArrayMap(0, 1, null);
    }
}
