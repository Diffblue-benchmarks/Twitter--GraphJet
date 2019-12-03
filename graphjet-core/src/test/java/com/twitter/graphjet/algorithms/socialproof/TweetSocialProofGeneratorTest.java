package com.twitter.graphjet.algorithms.socialproof;

import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import org.junit.Test;

public class TweetSocialProofGeneratorTest {
  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;

    // Act
    new TweetSocialProofGenerator(leftIndexedBipartiteGraph);
  }
}
