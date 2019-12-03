package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SalsaStatsTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    SalsaStats salsaStats = new SalsaStats();

    // Assert
    int numSeedNodes = salsaStats.getNumSeedNodes();
    int numRightNodesFiltered = salsaStats.getNumRightNodesFiltered();
    int minVisitsPerRightNode = salsaStats.getMinVisitsPerRightNode();
    int numDirectNeighbors = salsaStats.getNumDirectNeighbors();
    int numRHSVisits = salsaStats.getNumRHSVisits();
    int maxVisitsPerRightNode = salsaStats.getMaxVisitsPerRightNode();
    assertEquals(0, numSeedNodes);
    assertEquals(0, salsaStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode);
    assertEquals(0, numRHSVisits);
    assertEquals(0, numDirectNeighbors);
    assertEquals(2147483647, minVisitsPerRightNode);
    assertEquals(0, numRightNodesFiltered);
  }

  @Test
  public void constructorTest2() {
    // Arrange
    int numSeedNodes = 0;
    int numDirectNeighbors = 0;
    int numRightNodesReached = 0;
    int numRHSVisits = 0;
    int minVisitsPerRightNode = 0;
    int maxVisitsPerRightNode = 0;
    int numRightNodesFiltered = 0;

    // Act
    SalsaStats salsaStats = new SalsaStats(numSeedNodes, numDirectNeighbors, numRightNodesReached, numRHSVisits,
        minVisitsPerRightNode, maxVisitsPerRightNode, numRightNodesFiltered);

    // Assert
    int numSeedNodes1 = salsaStats.getNumSeedNodes();
    int numRightNodesFiltered1 = salsaStats.getNumRightNodesFiltered();
    int minVisitsPerRightNode1 = salsaStats.getMinVisitsPerRightNode();
    int numDirectNeighbors1 = salsaStats.getNumDirectNeighbors();
    int numRHSVisits1 = salsaStats.getNumRHSVisits();
    int maxVisitsPerRightNode1 = salsaStats.getMaxVisitsPerRightNode();
    assertEquals(0, numSeedNodes1);
    assertEquals(0, salsaStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode1);
    assertEquals(0, numRHSVisits1);
    assertEquals(0, numDirectNeighbors1);
    assertEquals(0, minVisitsPerRightNode1);
    assertEquals(0, numRightNodesFiltered1);
  }

  @Test
  public void equalsTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();
    String obj = "aaaaa";

    // Act
    boolean actual = salsaStats.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getNumSeedNodesTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    int actual = salsaStats.getNumSeedNodes();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    int actual = salsaStats.hashCode();

    // Assert
    assertEquals(-404674274, actual);
  }

  @Test
  public void resetTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    salsaStats.reset();

    // Assert
    int numSeedNodes = salsaStats.getNumSeedNodes();
    int numRightNodesFiltered = salsaStats.getNumRightNodesFiltered();
    int minVisitsPerRightNode = salsaStats.getMinVisitsPerRightNode();
    int numDirectNeighbors = salsaStats.getNumDirectNeighbors();
    int numRHSVisits = salsaStats.getNumRHSVisits();
    int maxVisitsPerRightNode = salsaStats.getMaxVisitsPerRightNode();
    assertEquals(0, numSeedNodes);
    assertEquals(0, salsaStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode);
    assertEquals(0, numRHSVisits);
    assertEquals(0, numDirectNeighbors);
    assertEquals(2147483647, minVisitsPerRightNode);
    assertEquals(0, numRightNodesFiltered);
  }

  @Test
  public void setNumSeedNodesTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();
    int numSeedNodes = 0;

    // Act
    salsaStats.setNumSeedNodes(numSeedNodes);

    // Assert
    assertEquals(0, salsaStats.getNumSeedNodes());
  }

  @Test
  public void toStringTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    String actual = salsaStats.toString();

    // Assert
    assertEquals(
        "SalsaStats{numSeedNodes=0, numDirectNeighbors=0, numRightNodesReached=0, numRHSVisits=0, minVisitsPerRightNode=2147483647, maxVisitsPerRightNode=0, numRightNodesFiltered=0}",
        actual);
  }
}







