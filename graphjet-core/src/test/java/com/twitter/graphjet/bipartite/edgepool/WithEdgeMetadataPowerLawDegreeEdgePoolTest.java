package com.twitter.graphjet.bipartite.edgepool;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WithEdgeMetadataPowerLawDegreeEdgePoolTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumNodes = 0;
    int expectedMaxDegree = 0;
    double powerLawExponent = 1.0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("poolNumber_");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new WithEdgeMetadataPowerLawDegreeEdgePool(expectedNumNodes, expectedMaxDegree, powerLawExponent, statsReceiver);
  }
}
