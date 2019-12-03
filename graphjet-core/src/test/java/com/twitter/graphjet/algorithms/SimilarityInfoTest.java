package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SimilarityInfoTest {
  @Test
  public void compareToTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);
    SimilarityInfo otherSimilarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    int actual = similarityInfo.compareTo(otherSimilarityInfo);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    long similarNode = 1L;
    double weight = 1.0;
    int cooccurrence = 0;
    int degree = 0;

    // Act
    SimilarityInfo similarityInfo = new SimilarityInfo(similarNode, weight, cooccurrence, degree);

    // Assert
    int degree1 = similarityInfo.getDegree();
    double weight1 = similarityInfo.getWeight();
    int cooccurrence1 = similarityInfo.getCooccurrence();
    assertEquals(0, degree1);
    assertEquals(1L, similarityInfo.getSimilarNode());
    assertEquals(0, cooccurrence1);
    assertEquals(1.0, weight1, 0.0);
  }

  @Test
  public void equalsTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);
    String obj = "aaaaa";

    // Act
    boolean actual = similarityInfo.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getCooccurrenceTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    int actual = similarityInfo.getCooccurrence();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getDegreeTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    int actual = similarityInfo.getDegree();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getSimilarNodeTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    long actual = similarityInfo.getSimilarNode();

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void getWeightTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    double actual = similarityInfo.getWeight();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    int actual = similarityInfo.hashCode();

    // Assert
    assertEquals(67013600, actual);
  }

  @Test
  public void toStringTest() {
    // Arrange
    SimilarityInfo similarityInfo = new SimilarityInfo(1L, 1.0, 0, 0);

    // Act
    String actual = similarityInfo.toString();

    // Assert
    assertEquals("SimilarityInfo{similarNode=1, weight=1.0, coocurrence=0, degree=0}", actual);
  }
}








