package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimilarityRequestDiffblueTest {
  @Test(timeout=10000)
  public void getQueryNodeTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new SimilarityRequest(1L, 3)).getQueryNode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SimilarityRequest actualSimilarityRequest = new SimilarityRequest(1L, 3);

    // Assert
    int actualMaxNumResults = actualSimilarityRequest.getMaxNumResults();
    assertEquals(3, actualMaxNumResults);
    assertEquals(1L, actualSimilarityRequest.getQueryNode());
  }

  @Test(timeout=10000)
  public void getMaxNumResultsTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new SimilarityRequest(1L, 3)).getMaxNumResults());
  }
}

