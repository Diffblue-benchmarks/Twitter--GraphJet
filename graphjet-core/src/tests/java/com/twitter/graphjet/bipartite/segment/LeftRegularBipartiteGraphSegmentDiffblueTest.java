package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class LeftRegularBipartiteGraphSegmentDiffblueTest {
  @Test(timeout=10000)
  public void initializeLeftInternalIdToLongIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeLeftInternalIdToLongIterator() instanceof InternalIdToLongIterator);
  }

  @Test(timeout=10000)
  public void initializeLeftNodeEdgesRandomIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeLeftNodeEdgesRandomIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgeRandomIterator);
  }

  @Test(timeout=10000)
  public void initializeRightInternalIdToLongIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeRightInternalIdToLongIterator() instanceof InternalIdToLongIterator);
  }

  @Test(timeout=10000)
  public void initializeRightNodeEdgesIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeRightNodeEdgesIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.PowerLawDegreeEdgeIterator);
  }

  @Test(timeout=10000)
  public void initializeRightNodeEdgesRandomIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeRightNodeEdgesRandomIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.PowerLawDegreeEdgeRandomIterator);
  }

  @Test(timeout=10000)
  public void initializeLeftNodeEdgesIntIteratorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertTrue((new LeftRegularBipartiteGraphSegment(10, 1, 10, 1, 10.0, 3, edgeTypeMask, new NullStatsReceiver()))
        .initializeLeftNodeEdgesIntIterator() instanceof com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgeIterator);
  }
}
