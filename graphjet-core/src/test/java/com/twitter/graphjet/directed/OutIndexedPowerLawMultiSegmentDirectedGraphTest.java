package com.twitter.graphjet.directed;

import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OutIndexedPowerLawMultiSegmentDirectedGraphTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int maxNumSegments = 1;
    int maxNumEdgesPerSegment = 1;
    int expectedNumNodes = 1;
    int expectedMaxDegree = 1;
    double powerLawExponent = 1.0;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new OutIndexedPowerLawMultiSegmentDirectedGraph(maxNumSegments, maxNumEdgesPerSegment, expectedNumNodes,
        expectedMaxDegree, powerLawExponent, edgeTypeMask, defaultStatsReceiver);
  }
}
