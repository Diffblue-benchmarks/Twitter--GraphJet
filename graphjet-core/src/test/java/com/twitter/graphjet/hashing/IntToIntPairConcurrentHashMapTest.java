package com.twitter.graphjet.hashing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.IntToIntPairConcurrentHashMap
 */

public class IntToIntPairConcurrentHashMapTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorDefaultReturnValueIsOneAndExpectedNumNodesIsOneAndLoadFactorIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new IntToIntPairConcurrentHashMap(1, 1.0, 1, null);
    }
}
