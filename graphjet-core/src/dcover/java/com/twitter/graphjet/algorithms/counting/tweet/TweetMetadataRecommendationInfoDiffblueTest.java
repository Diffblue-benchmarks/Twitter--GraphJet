package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.algorithms.RecommendationType;
import org.junit.Test;

public class TweetMetadataRecommendationInfoDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)).equals("foo"));
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(3,
        RecommendationType.HASHTAG, 10.0, null);

    // Act and Assert
    assertEquals(0, tweetMetadataRecommendationInfo
        .compareTo(new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)));
  }

  @Test(timeout=10000)
  public void getSocialProofTest() {
    // Arrange, Act and Assert
    assertNull((new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)).getSocialProof());
  }

  @Test(timeout=10000)
  public void addToWeightTest() {
    // Arrange
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(3,
        RecommendationType.HASHTAG, 10.0, null);

    // Act
    tweetMetadataRecommendationInfo.addToWeight(0.5);

    // Assert
    assertEquals(10.5, tweetMetadataRecommendationInfo.getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TweetMetadataRecommendationInfo actualTweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(3,
        RecommendationType.HASHTAG, 10.0, null);

    // Assert
    int actualRecommendation = actualTweetMetadataRecommendationInfo.getRecommendation();
    RecommendationType actualRecommendationType = actualTweetMetadataRecommendationInfo.getRecommendationType();
    double actualWeight = actualTweetMetadataRecommendationInfo.getWeight();
    assertEquals(3, actualRecommendation);
    assertNull(actualTweetMetadataRecommendationInfo.getSocialProof());
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(RecommendationType.HASHTAG, actualRecommendationType);
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)).getWeight(),
        0.0);
  }

  @Test(timeout=10000)
  public void getRecommendationTypeTest() {
    // Arrange, Act and Assert
    assertEquals(RecommendationType.HASHTAG,
        (new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)).getRecommendationType());
  }

  @Test(timeout=10000)
  public void getRecommendationTest() {
    // Arrange, Act and Assert
    assertEquals(3,
        (new TweetMetadataRecommendationInfo(3, RecommendationType.HASHTAG, 10.0, null)).getRecommendation());
  }
}

