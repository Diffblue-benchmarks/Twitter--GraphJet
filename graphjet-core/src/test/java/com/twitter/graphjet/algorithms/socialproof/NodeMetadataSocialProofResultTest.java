package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.NodeMetadataSocialProofResult
 */

public class NodeMetadataSocialProofResultTest {

    @Test
    public void constructorNodeMetadataIdIsOneAndRecommendationTypeIsHASHTAGAndSocialProofIsNullAndWeightIsOne() {
        NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1, null, 1.0, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertEquals(1, nodeMetadataSocialProofResult.getNodeMetadataId());
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.HASHTAG == nodeMetadataSocialProofResult.getRecommendationType());
        assertNull(nodeMetadataSocialProofResult.getSocialProof());
        assertEquals(1.0, nodeMetadataSocialProofResult.getWeight(), 0);
    }
}
