package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightNodeMetadataLeftIndexedPowerLawSegmentProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    int numRightNodeMetadataTypes = 1;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("segment_");

    // Act
    new RightNodeMetadataLeftIndexedPowerLawSegmentProvider(expectedNumLeftNodes, expectedMaxLeftDegree,
        leftPowerLawExponent, expectedNumRightNodes, numRightNodeMetadataTypes, edgeTypeMask, statsReceiver);
  }
  @Test
  public void generateNewSegmentTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    RightNodeMetadataLeftIndexedPowerLawSegmentProvider rightNodeMetadataLeftIndexedPowerLawSegmentProvider = new RightNodeMetadataLeftIndexedPowerLawSegmentProvider(
        1, 1, 1.0, 1, 1, identityEdgeTypeMask, new DefaultStatsReceiver("segment_"));
    int segmentId = 1;
    int maxNumEdges = 1;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    rightNodeMetadataLeftIndexedPowerLawSegmentProvider.generateNewSegment(segmentId, maxNumEdges);
  }
}

