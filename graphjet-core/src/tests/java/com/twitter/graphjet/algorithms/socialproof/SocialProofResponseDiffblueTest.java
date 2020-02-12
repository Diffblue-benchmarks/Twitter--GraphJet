package com.twitter.graphjet.algorithms.socialproof;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.SocialProofResponse
 *
 * @author Diffblue JCover
 */

public class SocialProofResponseDiffblueTest {

    @Test(timeout=10000)
    public void getRankedRecommendations() {
        List<com.twitter.graphjet.algorithms.RecommendationInfo> rightNodesWithSocialProof = new ArrayList<com.twitter.graphjet.algorithms.RecommendationInfo>();
        assertThat(new SocialProofResponse(rightNodesWithSocialProof).getRankedRecommendations(), instanceOf(List.class));
        assertThat(((List<com.twitter.graphjet.algorithms.RecommendationInfo>)new SocialProofResponse(rightNodesWithSocialProof).getRankedRecommendations()), sameInstance(rightNodesWithSocialProof));
    }
}
