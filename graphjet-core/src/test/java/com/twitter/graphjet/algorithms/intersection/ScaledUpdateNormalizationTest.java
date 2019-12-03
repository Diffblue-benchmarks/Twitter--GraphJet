package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScaledUpdateNormalizationTest {
  @Test
  public void computeLeftNeighborContributionTest() {
    // Arrange
    ScaledUpdateNormalization scaledUpdateNormalization = new ScaledUpdateNormalization();
    int leftNodeDegree = 1;

    // Act
    double actual = scaledUpdateNormalization.computeLeftNeighborContribution(leftNodeDegree);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actual, 0.0);
  }

  @Test
  public void computeScoreNormalizationTest() {
    // Arrange
    ScaledUpdateNormalization scaledUpdateNormalization = new ScaledUpdateNormalization();
    double cooccurrence = 2.0;
    int similarNodeDegree = 1;
    int nodeDegree = 1;

    // Act
    double actual = scaledUpdateNormalization.computeScoreNormalization(cooccurrence, similarNodeDegree, nodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new ScaledUpdateNormalization();
  }
}


