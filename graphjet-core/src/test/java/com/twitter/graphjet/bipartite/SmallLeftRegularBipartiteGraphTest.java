package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SmallLeftRegularBipartiteGraphTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int maxNumLeftNodes = 1;
    int leftDegree = 1;
    int maxNumRightNodes = 1;
    int maxRightDegree = 1;
    double rightPowerLawExponent = 1.0;
    int maxNumEdges = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new SmallLeftRegularBipartiteGraph(maxNumLeftNodes, leftDegree, maxNumRightNodes, maxRightDegree,
        rightPowerLawExponent, maxNumEdges, statsReceiver);
  }
}
