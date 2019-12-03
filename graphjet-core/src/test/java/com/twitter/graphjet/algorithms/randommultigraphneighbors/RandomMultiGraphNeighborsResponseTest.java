package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.RandomMultiGraphNeighborsResponse
 */

public class RandomMultiGraphNeighborsResponseTest {

    @Test
    public void constructorNeighborNodesIsNull() {
        RandomMultiGraphNeighborsResponse randomMultiGraphNeighborsResponse = new RandomMultiGraphNeighborsResponse(null);
        assertNull(randomMultiGraphNeighborsResponse.getNeighborNodes());
    }
}
