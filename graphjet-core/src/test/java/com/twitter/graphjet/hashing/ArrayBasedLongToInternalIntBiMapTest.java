package com.twitter.graphjet.hashing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap
 */

public class ArrayBasedLongToInternalIntBiMapTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorDefaultGetKeyReturnValueIsOneAndDefaultGetReturnValueIsOneAndExpectedNumKeysIsOneAndLoadFactorIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1, 1L, null);
    }
}
