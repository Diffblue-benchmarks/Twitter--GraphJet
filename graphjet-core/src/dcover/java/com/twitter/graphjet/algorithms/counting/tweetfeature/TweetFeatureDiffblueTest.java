package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TweetFeatureDiffblueTest {
  @Test(timeout=10000)
  public void atTest() {
    // Arrange, Act and Assert
    assertEquals(TweetFeature.TWEET_FEATURE_SIZE, TweetFeature.at(1));
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, TweetFeature.TWEET_FEATURE.getValue());
  }
}

