package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LeftIndexedPowerLawMultiSegmentBipartiteGraphDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void optimizeTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedPowerLawMultiSegmentBipartiteGraph = new LeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, edgeTypeMask, new NullStatsReceiver());

    // Act and Assert
    thrown.expect(ClassCastException.class);
    leftIndexedPowerLawMultiSegmentBipartiteGraph
        .optimize(new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3, new NullStatsReceiver()));
  }
}

