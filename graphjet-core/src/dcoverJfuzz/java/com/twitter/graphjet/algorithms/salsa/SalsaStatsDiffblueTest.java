package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SalsaStatsDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new SalsaStats()).equals("foo"));
  }

  @Test(timeout=10000)
  public void resetTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    salsaStats.reset();

    // Assert
    int actualNumSeedNodes = salsaStats.getNumSeedNodes();
    int actualNumRightNodesFiltered = salsaStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = salsaStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = salsaStats.getNumDirectNeighbors();
    int actualNumRHSVisits = salsaStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = salsaStats.getMaxVisitsPerRightNode();
    assertEquals(0, actualNumSeedNodes);
    assertEquals(0, salsaStats.getNumRightNodesReached());
    assertEquals(0, actualMaxVisitsPerRightNode);
    assertEquals(0, actualNumRHSVisits);
    assertEquals(0, actualNumDirectNeighbors);
    assertEquals(2147483647, actualMinVisitsPerRightNode);
    assertEquals(0, actualNumRightNodesFiltered);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    SalsaStats actualSalsaStats = new SalsaStats(10, 10, 10, 10, 1, 3, 10);

    // Assert
    int actualNumSeedNodes = actualSalsaStats.getNumSeedNodes();
    int actualNumRightNodesFiltered = actualSalsaStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = actualSalsaStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = actualSalsaStats.getNumDirectNeighbors();
    int actualNumRHSVisits = actualSalsaStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = actualSalsaStats.getMaxVisitsPerRightNode();
    assertEquals(10, actualNumSeedNodes);
    assertEquals(10, actualSalsaStats.getNumRightNodesReached());
    assertEquals(3, actualMaxVisitsPerRightNode);
    assertEquals(10, actualNumRHSVisits);
    assertEquals(10, actualNumDirectNeighbors);
    assertEquals(1, actualMinVisitsPerRightNode);
    assertEquals(10, actualNumRightNodesFiltered);
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-404674274, (new SalsaStats()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SalsaStats actualSalsaStats = new SalsaStats();

    // Assert
    int actualNumSeedNodes = actualSalsaStats.getNumSeedNodes();
    int actualNumRightNodesFiltered = actualSalsaStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = actualSalsaStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = actualSalsaStats.getNumDirectNeighbors();
    int actualNumRHSVisits = actualSalsaStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = actualSalsaStats.getMaxVisitsPerRightNode();
    assertEquals(0, actualNumSeedNodes);
    assertEquals(0, actualSalsaStats.getNumRightNodesReached());
    assertEquals(0, actualMaxVisitsPerRightNode);
    assertEquals(0, actualNumRHSVisits);
    assertEquals(0, actualNumDirectNeighbors);
    assertEquals(2147483647, actualMinVisitsPerRightNode);
    assertEquals(0, actualNumRightNodesFiltered);
  }

  @Test(timeout=10000)
  public void setNumSeedNodesTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    salsaStats.setNumSeedNodes(10);

    // Assert
    assertEquals(10, salsaStats.getNumSeedNodes());
  }

  @Test(timeout=10000)
  public void getNumSeedNodesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SalsaStats()).getNumSeedNodes());
  }
}

