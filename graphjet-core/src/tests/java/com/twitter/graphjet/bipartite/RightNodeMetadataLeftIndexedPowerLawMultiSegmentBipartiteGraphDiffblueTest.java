package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraphDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void initializeLeftNodeEdgesRandomLongIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask,
        new NullStatsReceiver())).initializeLeftNodeEdgesRandomLongIterator();
  }
}

