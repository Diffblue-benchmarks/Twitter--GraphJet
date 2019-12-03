package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.RandomMultiGraphNeighborsRequest
 */

public class RandomMultiGraphNeighborsRequestTest {

    @Test
    public void constructorLeftSeedNodesWithWeightIsNullAndMaxNumSamplesIsOneAndMaxResultsIsOne() {
        RandomMultiGraphNeighborsRequest randomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(null, 1, 1);
        assertNull(randomMultiGraphNeighborsRequest.getLeftSeedNodesWithWeight());
        assertEquals(1, randomMultiGraphNeighborsRequest.getMaxNumResults());
        assertEquals(1, randomMultiGraphNeighborsRequest.getMaxNumSamples());
    }
}
