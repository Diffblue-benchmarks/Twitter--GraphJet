package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap
 */

public class IntToIntPairArrayIndexBasedMapTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getFirstValueFromNodeInfoNodeInfoIsOneReturnsZero() {
        assertEquals(0, IntToIntPairArrayIndexBasedMap.getFirstValueFromNodeInfo(1L));
    }

    @Test
    public void getSecondValueFromNodeInfoNodeInfoIsOneReturnsOne() {
        assertEquals(1, IntToIntPairArrayIndexBasedMap.getSecondValueFromNodeInfo(1L));
    }

    @Test
    public void constructorDefaultReturnValueIsOneAndExpectedNumNodesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new IntToIntPairArrayIndexBasedMap(1, 1, null);
    }
}
