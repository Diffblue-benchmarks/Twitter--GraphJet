package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.algorithms.RecommendationType;
import org.junit.Test;

public class TweetRecommendationInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TweetRecommendationInfo actualTweetRecommendationInfo = new TweetRecommendationInfo(1L, 10.0, null);

    // Assert
    long actualRecommendation = actualTweetRecommendationInfo.getRecommendation();
    RecommendationType actualRecommendationType = actualTweetRecommendationInfo.getRecommendationType();
    double actualWeight = actualTweetRecommendationInfo.getWeight();
    assertEquals(1L, actualRecommendation);
    assertNull(actualTweetRecommendationInfo.getSocialProof());
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(RecommendationType.TWEET, actualRecommendationType);
  }
}

