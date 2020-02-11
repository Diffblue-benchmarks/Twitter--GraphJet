package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class NodeMetadataSocialProofGeneratorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new NodeMetadataSocialProofGenerator(
        new NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask,
            new NullStatsReceiver()))).idMask instanceof com.twitter.graphjet.algorithms.TweetIDMask);
  }
}

