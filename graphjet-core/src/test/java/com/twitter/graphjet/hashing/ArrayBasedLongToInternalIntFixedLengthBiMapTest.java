package com.twitter.graphjet.hashing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntFixedLengthBiMap
 */

public class ArrayBasedLongToInternalIntFixedLengthBiMapTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorDefaultGetKeyReturnValueIsZeroAndDefaultGetReturnValueIsOne() {
        thrown.expect(NullPointerException.class);
        new ArrayBasedLongToInternalIntFixedLengthBiMap(1, 1.0, 1, 0L, null);
    }

    @Test
    public void constructorDefaultGetReturnValueIsMinusOne() {
        thrown.expect(NullPointerException.class);
        new ArrayBasedLongToInternalIntFixedLengthBiMap(1, 1.0, -1, 1L, null);
    }

    @Test
    public void constructorDefaultGetReturnValueIsOne() {
        thrown.expect(NullPointerException.class);
        new ArrayBasedLongToInternalIntFixedLengthBiMap(1, 1.0, 1, 1L, null);
    }

    @Test
    public void constructorDefaultGetReturnValueIsZero() {
        // defaultGetReturnValue must NOT be one of the indices that can be returned otherwise.
        thrown.expect(IllegalArgumentException.class);
        new ArrayBasedLongToInternalIntFixedLengthBiMap(1, 1.0, 0, 1L, null);
    }
}
