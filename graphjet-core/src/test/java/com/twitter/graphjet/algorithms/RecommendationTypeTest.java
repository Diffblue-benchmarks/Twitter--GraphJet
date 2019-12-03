package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecommendationTypeTest {
  @Test
  public void atTest() {
    // Arrange
    int index = 0;

    // Act
    RecommendationType actual = RecommendationType.at(index);

    // Assert
    assertEquals(RecommendationType.HASHTAG, actual);
  }

  @Test
  public void getValueTest() {
    // Arrange
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act
    int actual = recommendationType.getValue();

    // Assert
    assertEquals(0, actual);
  }
}

