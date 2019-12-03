package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.SocialProofResult
 */

public class SocialProofResultTest {

    @Test
    public void constructorNodeIsOneAndRecommendationTypeIsHASHTAGAndSocialProofIsNullAndWeightIsOne() {
        SocialProofResult socialProofResult = new SocialProofResult(1L, null, 1.0, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG);
        assertEquals(1L, socialProofResult.getNode());
        assertTrue(com.twitter.graphjet.algorithms.RecommendationType.HASHTAG == socialProofResult.getRecommendationType());
        assertNull(socialProofResult.getSocialProof());
        assertEquals(1.0, socialProofResult.getWeight(), 0);
    }
}
