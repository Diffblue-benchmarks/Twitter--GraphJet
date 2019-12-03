package com.twitter.graphjet.hashing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.hashing.ShardedBigIntArray
 */

public class ShardedBigIntArrayTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorMinShardSizeIsOneAndNullEntryIsOneAndNumExpectedEntriesIsOneAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new ShardedBigIntArray(1, 1, 1, null);
    }
}
