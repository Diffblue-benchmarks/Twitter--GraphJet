package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CosineUpdateNormalizationTest {
  @Test
  public void computeLeftNeighborContributionTest() {
    // Arrange
    CosineUpdateNormalization cosineUpdateNormalization = new CosineUpdateNormalization();
    int leftNodeDegree = 1;

    // Act
    double actual = cosineUpdateNormalization.computeLeftNeighborContribution(leftNodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void computeScoreNormalizationTest() {
    // Arrange
    CosineUpdateNormalization cosineUpdateNormalization = new CosineUpdateNormalization();
    double cooccurrence = 1.0;
    int similarNodeDegree = 1;
    int nodeDegree = 1;

    // Act
    double actual = cosineUpdateNormalization.computeScoreNormalization(cooccurrence, similarNodeDegree, nodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new CosineUpdateNormalization();
  }
}


