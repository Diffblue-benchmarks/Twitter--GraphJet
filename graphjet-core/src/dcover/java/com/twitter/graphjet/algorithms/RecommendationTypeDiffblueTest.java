package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecommendationTypeDiffblueTest {
  @Test(timeout=10000)
  public void atTest() {
    // Arrange, Act and Assert
    assertEquals(RecommendationType.URL, RecommendationType.at(1));
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, RecommendationType.HASHTAG.getValue());
  }
}

