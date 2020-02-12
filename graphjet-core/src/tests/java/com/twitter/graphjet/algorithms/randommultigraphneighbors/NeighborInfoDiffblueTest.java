package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NeighborInfoDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new NeighborInfo(1L, 10.0, 1)).equals("foo"));
  }

  @Test(timeout=10000)
  public void getNeighborNodeTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new NeighborInfo(1L, 10.0, 1)).getNeighborNode());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1000572895, (new NeighborInfo(1L, 10.0, 1)).hashCode());
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    NeighborInfo neighborInfo = new NeighborInfo(1L, 10.0, 1);

    // Act and Assert
    assertEquals(0, neighborInfo.compareTo(new NeighborInfo(1L, 10.0, 1)));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NeighborInfo actualNeighborInfo = new NeighborInfo(1L, 10.0, 1);

    // Assert
    int actualDegree = actualNeighborInfo.getDegree();
    double actualScore = actualNeighborInfo.getScore();
    assertEquals(1, actualDegree);
    assertEquals(1L, actualNeighborInfo.getNeighborNode());
    assertEquals(10.0, actualScore, 0.0);
  }

  @Test(timeout=10000)
  public void getScoreTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new NeighborInfo(1L, 10.0, 1)).getScore(), 0.0);
  }

  @Test(timeout=10000)
  public void getDegreeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NeighborInfo(1L, 10.0, 1)).getDegree());
  }
}

