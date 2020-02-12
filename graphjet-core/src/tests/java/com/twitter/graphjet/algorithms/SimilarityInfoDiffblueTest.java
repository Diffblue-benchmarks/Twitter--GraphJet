package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SimilarityInfoDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new SimilarityInfo(1L, 10.0, 1, 1)).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SimilarityInfo actualSimilarityInfo = new SimilarityInfo(1L, 10.0, 1, 1);

    // Assert
    int actualDegree = actualSimilarityInfo.getDegree();
    double actualWeight = actualSimilarityInfo.getWeight();
    int actualCooccurrence = actualSimilarityInfo.getCooccurrence();
    assertEquals(1, actualDegree);
    assertEquals(1L, actualSimilarityInfo.getSimilarNode());
    assertEquals(1, actualCooccurrence);
    assertEquals(10.0, actualWeight, 0.0);
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-952988672, (new SimilarityInfo(1L, 10.0, 1, 1)).hashCode());
  }

  @Test(timeout=10000)
  public void getSimilarNodeTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new SimilarityInfo(1L, 10.0, 1, 1)).getSimilarNode());
  }

  @Test(timeout=10000)
  public void getCooccurrenceTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimilarityInfo(1L, 10.0, 1, 1)).getCooccurrence());
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new SimilarityInfo(1L, 10.0, 1, 1)).getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 10.0, 1, 1);

    // Act and Assert
    assertEquals(0, similarityInfo.compareTo(new SimilarityInfo(1L, 10.0, 1, 1)));
  }

  @Test(timeout=10000)
  public void getDegreeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimilarityInfo(1L, 10.0, 1, 1)).getDegree());
  }
}

