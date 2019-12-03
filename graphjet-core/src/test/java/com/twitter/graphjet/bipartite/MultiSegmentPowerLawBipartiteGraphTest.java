package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiSegmentPowerLawBipartiteGraphTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int maxNumSegments = 1;
    int maxNumEdgesPerSegment = 1;
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    int expectedMaxRightDegree = 1;
    double rightPowerLawExponent = 1.0;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new MultiSegmentPowerLawBipartiteGraph(maxNumSegments, maxNumEdgesPerSegment, expectedNumLeftNodes,
        expectedMaxLeftDegree, leftPowerLawExponent, expectedNumRightNodes, expectedMaxRightDegree,
        rightPowerLawExponent, edgeTypeMask, statsReceiver);
  }
}
