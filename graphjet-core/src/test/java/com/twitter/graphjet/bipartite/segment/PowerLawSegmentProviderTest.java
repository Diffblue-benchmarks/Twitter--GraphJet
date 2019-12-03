package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawSegmentProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    int expectedMaxRightDegree = 1;
    double rightPowerLawExponent = 1.0;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("segment_");

    // Act
    new PowerLawSegmentProvider(expectedNumLeftNodes, expectedMaxLeftDegree, leftPowerLawExponent,
        expectedNumRightNodes, expectedMaxRightDegree, rightPowerLawExponent, edgeTypeMask, statsReceiver);
  }
  @Test
  public void generateNewSegmentTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("segment_");
    defaultStatsReceiver.counter("segment_");
    defaultStatsReceiver.counter("segment_");
    PowerLawSegmentProvider powerLawSegmentProvider = new PowerLawSegmentProvider(1, 1, 1.0, 1, 1, 1.0,
        identityEdgeTypeMask, defaultStatsReceiver);
    int segmentId = 1;
    int maxNumEdges = 1;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    powerLawSegmentProvider.generateNewSegment(segmentId, maxNumEdges);
  }
}

