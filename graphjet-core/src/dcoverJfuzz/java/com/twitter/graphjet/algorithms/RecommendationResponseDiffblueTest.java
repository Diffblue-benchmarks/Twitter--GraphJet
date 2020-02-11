package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RecommendationResponseDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new RecommendationResponse(null)).getRankedRecommendations());
  }

  @Test(timeout=10000)
  public void getRankedRecommendationsTest() {
    // Arrange, Act and Assert
    assertNull((new RecommendationResponse(null)).getRankedRecommendations());
  }
}

