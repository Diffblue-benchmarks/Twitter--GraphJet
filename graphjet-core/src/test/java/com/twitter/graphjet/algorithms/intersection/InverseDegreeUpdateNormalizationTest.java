package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InverseDegreeUpdateNormalizationTest {
  @Test
  public void computeLeftNeighborContributionTest() {
    // Arrange
    InverseDegreeUpdateNormalization inverseDegreeUpdateNormalization = new InverseDegreeUpdateNormalization();
    int leftNodeDegree = 1;

    // Act
    double actual = inverseDegreeUpdateNormalization.computeLeftNeighborContribution(leftNodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void computeScoreNormalizationTest() {
    // Arrange
    InverseDegreeUpdateNormalization inverseDegreeUpdateNormalization = new InverseDegreeUpdateNormalization();
    double cooccurrence = 1.0;
    int similarNodeDegree = 1;
    int nodeDegree = 1;

    // Act
    double actual = inverseDegreeUpdateNormalization.computeScoreNormalization(cooccurrence, similarNodeDegree,
        nodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new InverseDegreeUpdateNormalization();
  }
}


