package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NeighborInfoTest {
  @Test
  public void compareToTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);
    NeighborInfo otherNeighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    int actual = neighborInfo.compareTo(otherNeighborInfo);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    long neighborNode = 1L;
    double score = 1.0;
    int degree = 0;

    // Act
    NeighborInfo neighborInfo = new NeighborInfo(neighborNode, score, degree);

    // Assert
    int degree1 = neighborInfo.getDegree();
    double score1 = neighborInfo.getScore();
    assertEquals(0, degree1);
    assertEquals(1L, neighborInfo.getNeighborNode());
    assertEquals(1.0, score1, 0.0);
  }

  @Test
  public void equalsTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);
    String obj = "aaaaa";

    // Act
    boolean actual = neighborInfo.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getDegreeTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    int actual = neighborInfo.getDegree();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNeighborNodeTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    long actual = neighborInfo.getNeighborNode();

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void getScoreTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    double actual = neighborInfo.getScore();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    int actual = neighborInfo.hashCode();

    // Assert
    assertEquals(-1106216928, actual);
  }

  @Test
  public void toStringTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 1.0, 0);

    // Act
    String actual = neighborInfo.toString();

    // Assert
    assertEquals("NeighborInfo{neighbor=1, score=1.0, degree=0}", actual);
  }
}







