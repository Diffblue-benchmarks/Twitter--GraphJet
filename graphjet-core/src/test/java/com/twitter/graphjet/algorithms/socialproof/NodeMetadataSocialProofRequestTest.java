package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.NodeMetadataSocialProofRequest
 */

public class NodeMetadataSocialProofRequestTest {

    @Test
    public void constructorNodeMetadataTypeToIdsMapIsNullAndSocialProofTypesIsEmptyAndWeightedSeedNodesIsNull() {
        byte[] socialProofTypes = new byte[] { };
        NodeMetadataSocialProofRequest nodeMetadataSocialProofRequest = new NodeMetadataSocialProofRequest(null, null, socialProofTypes);
        assertNull(nodeMetadataSocialProofRequest.getLeftSeedNodesWithWeight());
        assertNull(nodeMetadataSocialProofRequest.getNodeMetadataTypeToIdsMap());
        assertEquals(0L, nodeMetadataSocialProofRequest.getQueryNode());
        assertArrayEquals(new byte[] { }, nodeMetadataSocialProofRequest.getSocialProofTypes());
        assertTrue(nodeMetadataSocialProofRequest.getToBeFiltered().isEmpty());
    }
}
