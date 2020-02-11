package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SimilarityResponseDiffblueTest {
  @Test(timeout=10000)
  public void getRankedSimilarNodesTest() {
    // Arrange, Act and Assert
    assertNull((new SimilarityResponse(null, 1)).getRankedSimilarNodes());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SimilarityResponse actualSimilarityResponse = new SimilarityResponse(null, 1);

    // Assert
    int actualDegree = actualSimilarityResponse.getDegree();
    assertEquals(1, actualDegree);
    assertNull(actualSimilarityResponse.getRankedSimilarNodes());
  }

  @Test(timeout=10000)
  public void getDegreeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimilarityResponse(null, 1)).getDegree());
  }
}

