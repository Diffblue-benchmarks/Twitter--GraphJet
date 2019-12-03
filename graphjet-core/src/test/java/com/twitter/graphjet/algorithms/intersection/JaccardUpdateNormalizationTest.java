package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JaccardUpdateNormalizationTest {
  @Test
  public void computeLeftNeighborContributionTest() {
    // Arrange
    JaccardUpdateNormalization jaccardUpdateNormalization = new JaccardUpdateNormalization();
    int leftNodeDegree = 1;

    // Act
    double actual = jaccardUpdateNormalization.computeLeftNeighborContribution(leftNodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void computeScoreNormalizationTest() {
    // Arrange
    JaccardUpdateNormalization jaccardUpdateNormalization = new JaccardUpdateNormalization();
    double cooccurrence = 1.0;
    int similarNodeDegree = 1;
    int nodeDegree = 1;

    // Act
    double actual = jaccardUpdateNormalization.computeScoreNormalization(cooccurrence, similarNodeDegree, nodeDegree);

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new JaccardUpdateNormalization();
  }
}


