package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LeftRegularBipartiteGraphSegmentTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int leftDegree = 1;
    int expectedNumRightNodes = 1;
    int expectedMaxRightDegree = 1;
    double rightPowerLawExponent = 1.0;
    int maxNumEdges = 1;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("akaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new LeftRegularBipartiteGraphSegment(expectedNumLeftNodes, leftDegree, expectedNumRightNodes,
        expectedMaxRightDegree, rightPowerLawExponent, maxNumEdges, edgeTypeMask, statsReceiver);
  }
}
