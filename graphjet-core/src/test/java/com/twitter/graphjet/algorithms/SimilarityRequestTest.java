package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimilarityRequestTest {
  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;
    int maxNumResults = 1;

    // Act
    SimilarityRequest similarityRequest = new SimilarityRequest(queryNode, maxNumResults);

    // Assert
    int maxNumResults1 = similarityRequest.getMaxNumResults();
    assertEquals(1, maxNumResults1);
    assertEquals(1L, similarityRequest.getQueryNode());
  }

  @Test
  public void getMaxNumResultsTest() {
    // Arrange
    SimilarityRequest similarityRequest = new SimilarityRequest(1L, 1);

    // Act
    int actual = similarityRequest.getMaxNumResults();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getQueryNodeTest() {
    // Arrange
    SimilarityRequest similarityRequest = new SimilarityRequest(1L, 1);

    // Act
    long actual = similarityRequest.getQueryNode();

    // Assert
    assertEquals(1L, actual);
  }
}


