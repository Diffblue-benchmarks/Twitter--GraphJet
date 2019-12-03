package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.SocialProofRequest
 */

public class SocialProofRequestTest {

    @Test
    public void constructorRightNodeIdsIsNullAndSocialProofTypesIsEmptyAndWeightedSeedNodesIsNull() {
        byte[] socialProofTypes = new byte[] { };
        SocialProofRequest socialProofRequest = new SocialProofRequest(null, null, socialProofTypes);
        assertNull(socialProofRequest.getLeftSeedNodesWithWeight());
        assertNull(socialProofRequest.getRightNodeIds());
        assertEquals(0L, socialProofRequest.getQueryNode());
        assertArrayEquals(new byte[] { }, socialProofRequest.getSocialProofTypes());
        assertTrue(socialProofRequest.getToBeFiltered().isEmpty());
    }
}
