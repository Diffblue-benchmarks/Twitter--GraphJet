package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TweetFeatureTest {
  @Test
  public void atTest() {
    // Arrange
    int index = 0;

    // Act
    TweetFeature actual = TweetFeature.at(index);

    // Assert
    assertEquals(TweetFeature.TWEET_FEATURE, actual);
  }

  @Test
  public void getValueTest() {
    // Arrange
    TweetFeature tweetFeature = TweetFeature.TWEET_FEATURE;

    // Act
    int actual = tweetFeature.getValue();

    // Assert
    assertEquals(0, actual);
  }
}

