package com.twitter.graphjet.algorithms.counting.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.algorithms.RecommendationType;
import org.junit.Test;

public class UserRecommendationInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    UserRecommendationInfo actualUserRecommendationInfo = new UserRecommendationInfo(1L, 10.0, null);

    // Assert
    long actualRecommendation = actualUserRecommendationInfo.getRecommendation();
    RecommendationType actualRecommendationType = actualUserRecommendationInfo.getRecommendationType();
    double actualWeight = actualUserRecommendationInfo.getWeight();
    assertEquals(1L, actualRecommendation);
    assertNull(actualUserRecommendationInfo.getSocialProof());
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(RecommendationType.USER, actualRecommendationType);
  }
}

