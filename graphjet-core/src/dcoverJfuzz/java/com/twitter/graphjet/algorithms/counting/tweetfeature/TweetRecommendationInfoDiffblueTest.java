package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.RecommendationType;
import java.util.Arrays;
import org.junit.Test;

public class TweetRecommendationInfoDiffblueTest {
  @Test(timeout=10000)
  public void getTweetFeatureTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    TweetRecommendationInfo tweetRecommendationInfo = new TweetRecommendationInfo(1L, 10.0, null, intArray);

    // Act
    int[] actualTweetFeature = tweetRecommendationInfo.getTweetFeature();

    // Assert
    assertSame(tweetRecommendationInfo.tweetFeature, actualTweetFeature);
    assertEquals(8, actualTweetFeature.length);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    TweetRecommendationInfo actualTweetRecommendationInfo = new TweetRecommendationInfo(1L, 10.0, null, intArray);

    // Assert
    long actualRecommendation = actualTweetRecommendationInfo.getRecommendation();
    RecommendationType actualRecommendationType = actualTweetRecommendationInfo.getRecommendationType();
    double actualWeight = actualTweetRecommendationInfo.getWeight();
    int[] tweetFeature = actualTweetRecommendationInfo.getTweetFeature();
    assertEquals(1L, actualRecommendation);
    assertNull(actualTweetRecommendationInfo.getSocialProof());
    assertEquals(8, tweetFeature.length);
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(RecommendationType.TWEET, actualRecommendationType);
  }
}

