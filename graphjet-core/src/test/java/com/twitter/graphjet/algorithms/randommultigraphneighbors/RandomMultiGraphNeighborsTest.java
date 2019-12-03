package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.RandomMultiGraphNeighbors
 */

public class RandomMultiGraphNeighborsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNullAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new RandomMultiGraphNeighbors(null, null);
    }
}
