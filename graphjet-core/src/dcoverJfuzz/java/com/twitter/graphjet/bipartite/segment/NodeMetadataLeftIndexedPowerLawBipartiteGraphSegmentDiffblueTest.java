package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class NodeMetadataLeftIndexedPowerLawBipartiteGraphSegmentDiffblueTest {
  @Test(timeout=10000)
  public void initializeLeftInternalIdToLongIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new NodeMetadataLeftIndexedPowerLawBipartiteGraphSegment(10, 1, 10.0, 10, 3, 10, edgeTypeMask,
        new NullStatsReceiver()))
            .initializeLeftInternalIdToLongIterator() instanceof NodeMetadataInternalIdToLongIterator);
  }

  @Test(timeout=10000)
  public void initializeLeftNodeEdgesRandomIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new NodeMetadataLeftIndexedPowerLawBipartiteGraphSegment(10, 1, 10.0, 10, 3, 10, edgeTypeMask,
        new NullStatsReceiver()))
            .initializeLeftNodeEdgesRandomIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.PowerLawDegreeEdgeRandomIterator);
  }

  @Test(timeout=10000)
  public void initializeLeftNodeEdgesIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new NodeMetadataLeftIndexedPowerLawBipartiteGraphSegment(10, 1, 10.0, 10, 3, 10, edgeTypeMask,
        new NullStatsReceiver()))
            .initializeLeftNodeEdgesIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.PowerLawDegreeEdgeIterator);
  }
}

