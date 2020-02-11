package com.twitter.graphjet.algorithms.socialproof;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.NodeMetadataSocialProofRequest
 *
 * @author Diffblue JCover
 */

public class NodeMetadataSocialProofRequestTest {

    @Test(timeout=10000)
    public void getLeftSeedNodesWithWeight() {
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.ints.IntSet> nodeMetadataTypeToIdsMap = mock(Byte2ObjectMap.class);
        Long2DoubleMap weightedSeedNodes = mock(Long2DoubleMap.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new NodeMetadataSocialProofRequest(nodeMetadataTypeToIdsMap, weightedSeedNodes, socialProofTypes).getLeftSeedNodesWithWeight(), sameInstance(weightedSeedNodes));
    }

    @Test(timeout=10000)
    public void getNodeMetadataTypeToIdsMap() {
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.ints.IntSet> nodeMetadataTypeToIdsMap = mock(Byte2ObjectMap.class);
        Long2DoubleMap weightedSeedNodes = mock(Long2DoubleMap.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new NodeMetadataSocialProofRequest(nodeMetadataTypeToIdsMap, weightedSeedNodes, socialProofTypes).getNodeMetadataTypeToIdsMap(), sameInstance(nodeMetadataTypeToIdsMap));
    }
}
