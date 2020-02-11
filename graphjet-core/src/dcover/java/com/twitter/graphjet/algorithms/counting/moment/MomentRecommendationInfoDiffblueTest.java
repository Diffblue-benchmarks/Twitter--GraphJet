package com.twitter.graphjet.algorithms.counting.moment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.algorithms.RecommendationType;
import org.junit.Test;

public class MomentRecommendationInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    MomentRecommendationInfo actualMomentRecommendationInfo = new MomentRecommendationInfo(1L, 10.0, null);

    // Assert
    long actualRecommendation = actualMomentRecommendationInfo.getRecommendation();
    RecommendationType actualRecommendationType = actualMomentRecommendationInfo.getRecommendationType();
    double actualWeight = actualMomentRecommendationInfo.getWeight();
    assertEquals(1L, actualRecommendation);
    assertNull(actualMomentRecommendationInfo.getSocialProof());
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(RecommendationType.MOMENT, actualRecommendationType);
  }
}

