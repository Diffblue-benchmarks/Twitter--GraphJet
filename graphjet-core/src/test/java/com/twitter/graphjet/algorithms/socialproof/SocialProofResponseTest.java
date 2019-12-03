package com.twitter.graphjet.algorithms.socialproof;

import java.util.ArrayList;

import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.SocialProofResponse
 */

public class SocialProofResponseTest {

    @Test
    public void constructorRightNodesWithSocialProofIsEmpty() {
        ArrayList<com.twitter.graphjet.algorithms.RecommendationInfo> rightNodesWithSocialProof = new ArrayList<com.twitter.graphjet.algorithms.RecommendationInfo>();
        SocialProofResponse socialProofResponse = new SocialProofResponse(rightNodesWithSocialProof);
        assertSame(rightNodesWithSocialProof, (ArrayList<com.twitter.graphjet.algorithms.RecommendationInfo>)socialProofResponse.getRankedRecommendations());
    }
}
