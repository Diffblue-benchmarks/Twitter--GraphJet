package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.randommultigraphneighbors.RandomMultiGraphNeighborsResponse
 *
 * @author Diffblue JCover
 */

public class RandomMultiGraphNeighborsResponseDiffblueTest {

    @Test(timeout=10000)
    public void getNeighborNodes() {
        @SuppressWarnings("unchecked")
        Iterable<NeighborInfo> neighborNodes = mock(Iterable.class);
        assertThat(new RandomMultiGraphNeighborsResponse(neighborNodes).getNeighborNodes(), sameInstance(neighborNodes));
    }
}
