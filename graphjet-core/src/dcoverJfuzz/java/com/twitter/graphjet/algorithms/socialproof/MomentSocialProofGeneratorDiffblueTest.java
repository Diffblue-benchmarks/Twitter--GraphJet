package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class MomentSocialProofGeneratorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    MomentSocialProofGenerator actualMomentSocialProofGenerator = new MomentSocialProofGenerator(
        new LeftIndexedPowerLawMultiSegmentBipartiteGraph(3, 3, 10, 1, 10.0, 10, edgeTypeMask,
            new NullStatsReceiver()));

    // Assert
    assertTrue(actualMomentSocialProofGenerator.idMask instanceof com.twitter.graphjet.algorithms.IdentityIDMask);
    assertEquals(RecommendationType.MOMENT, actualMomentSocialProofGenerator.recommendationType);
  }
}

