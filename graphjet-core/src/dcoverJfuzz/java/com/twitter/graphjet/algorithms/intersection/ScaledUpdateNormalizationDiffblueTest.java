package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScaledUpdateNormalizationDiffblueTest {
  @Test(timeout=10000)
  public void computeScoreNormalizationTest() {
    // Arrange, Act and Assert
    assertEquals(0.5773502691896258, (new ScaledUpdateNormalization()).computeScoreNormalization(10.0, 3, 3), 0.0);
  }

  @Test(timeout=10000)
  public void computeLeftNeighborContributionTest() {
    // Arrange, Act and Assert
    assertEquals(Double.POSITIVE_INFINITY, (new ScaledUpdateNormalization()).computeLeftNeighborContribution(1), 0.0);
  }
}

