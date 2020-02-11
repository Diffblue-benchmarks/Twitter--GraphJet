package com.twitter.graphjet.algorithms.socialproof;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.SocialProofRequest
 *
 * @author Diffblue JCover
 */

public class SocialProofRequestTest {

    @Test(timeout=10000)
    public void getLeftSeedNodesWithWeight() {
        LongSet rightNodeIds = mock(LongSet.class);
        Long2DoubleMap weightedSeedNodes = mock(Long2DoubleMap.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new SocialProofRequest(rightNodeIds, weightedSeedNodes, socialProofTypes).getLeftSeedNodesWithWeight(), sameInstance(weightedSeedNodes));
    }

    @Test(timeout=10000)
    public void getRightNodeIds() {
        LongSet rightNodeIds = mock(LongSet.class);
        Long2DoubleMap weightedSeedNodes = mock(Long2DoubleMap.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new SocialProofRequest(rightNodeIds, weightedSeedNodes, socialProofTypes).getRightNodeIds(), sameInstance(rightNodeIds));
    }
}
