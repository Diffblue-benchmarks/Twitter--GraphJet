package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightNodeMetadataLeftIndexedPowerLawBipartiteGraphSegmentTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    int maxNumEdges = 1;
    int numRightNodeMetadataTypes = 1;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("NodeMetadataPowerLaw");
    defaultStatsReceiver.counter("NodeMetadataPowerLaw");
    defaultStatsReceiver.counter("NodeMetadataPowerLaw");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new RightNodeMetadataLeftIndexedPowerLawBipartiteGraphSegment(expectedNumLeftNodes, expectedMaxLeftDegree,
        leftPowerLawExponent, expectedNumRightNodes, maxNumEdges, numRightNodeMetadataTypes, edgeTypeMask,
        defaultStatsReceiver);
  }
}