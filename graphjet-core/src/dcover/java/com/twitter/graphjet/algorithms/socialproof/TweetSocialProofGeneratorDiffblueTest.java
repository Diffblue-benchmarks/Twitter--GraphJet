package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class TweetSocialProofGeneratorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    TweetSocialProofGenerator actualTweetSocialProofGenerator = new TweetSocialProofGenerator(
        new LeftIndexedPowerLawMultiSegmentBipartiteGraph(3, 3, 10, 1, 10.0, 10, edgeTypeMask,
            new NullStatsReceiver()));

    // Assert
    assertTrue(actualTweetSocialProofGenerator.idMask instanceof com.twitter.graphjet.algorithms.TweetIDMask);
    assertEquals(RecommendationType.TWEET, actualTweetSocialProofGenerator.recommendationType);
  }
}

