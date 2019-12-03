package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OverlapUpdateNormalizationTest {
  @Test
  public void computeLeftNeighborContributionTest() {
    // Arrange
    OverlapUpdateNormalization overlapUpdateNormalization = new OverlapUpdateNormalization();
    int leftNodeDegree = 1;

    // Act
    double actual = overlapUpdateNormalization.computeLeftNeighborContribution(leftNodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void computeScoreNormalizationTest() {
    // Arrange
    OverlapUpdateNormalization overlapUpdateNormalization = new OverlapUpdateNormalization();
    double cooccurrence = 1.0;
    int similarNodeDegree = 1;
    int nodeDegree = 1;

    // Act
    double actual = overlapUpdateNormalization.computeScoreNormalization(cooccurrence, similarNodeDegree, nodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new OverlapUpdateNormalization();
  }
}


