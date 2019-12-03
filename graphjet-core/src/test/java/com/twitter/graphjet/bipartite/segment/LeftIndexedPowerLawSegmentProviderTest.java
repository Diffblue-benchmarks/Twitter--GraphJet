package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LeftIndexedPowerLawSegmentProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("segment_");

    // Act
    new LeftIndexedPowerLawSegmentProvider(expectedNumLeftNodes, expectedMaxLeftDegree, leftPowerLawExponent,
        expectedNumRightNodes, edgeTypeMask, statsReceiver);
  }
  @Test
  public void generateNewSegmentTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    LeftIndexedPowerLawSegmentProvider leftIndexedPowerLawSegmentProvider = new LeftIndexedPowerLawSegmentProvider(1, 1,
        1.0, 1, identityEdgeTypeMask, new DefaultStatsReceiver("segment_"));
    int segmentId = 167772161;
    int maxNumEdges = 1;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    leftIndexedPowerLawSegmentProvider.generateNewSegment(segmentId, maxNumEdges);
  }
}

