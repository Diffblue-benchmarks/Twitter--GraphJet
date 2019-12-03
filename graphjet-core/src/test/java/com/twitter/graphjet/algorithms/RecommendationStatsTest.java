package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RecommendationStatsTest {
  @Test
  public void addToNumRHSVisitsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numVisits = 0;

    // Act
    recommendationStats.addToNumRHSVisits(numVisits);

    // Assert
    assertEquals(0, recommendationStats.getNumRHSVisits());
  }

  @Test
  public void constructorTest() {
    // Arrange
    int numDirectNeighbors = 0;
    int numRightNodesReached = 0;
    int numRHSVisits = 0;
    int minVisitsPerRightNode = 0;
    int maxVisitsPerRightNode = 0;
    int numRightNodesFiltered = 0;

    // Act
    RecommendationStats recommendationStats = new RecommendationStats(numDirectNeighbors, numRightNodesReached,
        numRHSVisits, minVisitsPerRightNode, maxVisitsPerRightNode, numRightNodesFiltered);

    // Assert
    String toStringResult = recommendationStats.toString();
    int minVisitsPerRightNode1 = recommendationStats.getMinVisitsPerRightNode();
    int numDirectNeighbors1 = recommendationStats.getNumDirectNeighbors();
    int numRHSVisits1 = recommendationStats.getNumRHSVisits();
    int maxVisitsPerRightNode1 = recommendationStats.getMaxVisitsPerRightNode();
    assertEquals(
        "RecommendationStats{numDirectNeighbors=0, numRightNodesReached=0, numRHSVisits=0, minVisitsPerRightNode=0, maxVisitsPerRightNode=0, numRightNodesFiltered=0}",
        toStringResult);
    assertEquals(0, recommendationStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode1);
    assertEquals(0, numRHSVisits1);
    assertEquals(0, numDirectNeighbors1);
    assertEquals(0, minVisitsPerRightNode1);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    RecommendationStats recommendationStats = new RecommendationStats();

    // Assert
    int numRightNodesFiltered = recommendationStats.getNumRightNodesFiltered();
    int minVisitsPerRightNode = recommendationStats.getMinVisitsPerRightNode();
    int numDirectNeighbors = recommendationStats.getNumDirectNeighbors();
    int numRHSVisits = recommendationStats.getNumRHSVisits();
    int maxVisitsPerRightNode = recommendationStats.getMaxVisitsPerRightNode();
    assertEquals(0, numRightNodesFiltered);
    assertEquals(0, recommendationStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode);
    assertEquals(0, numRHSVisits);
    assertEquals(0, numDirectNeighbors);
    assertEquals(2147483647, minVisitsPerRightNode);
  }

  @Test
  public void equalsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    String obj = "aaaaa";

    // Act
    boolean actual = recommendationStats.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getMaxVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getMaxVisitsPerRightNode();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getMinVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getMinVisitsPerRightNode();

    // Assert
    assertEquals(2147483647, actual);
  }

  @Test
  public void getNumDirectNeighborsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getNumDirectNeighbors();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNumRHSVisitsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getNumRHSVisits();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNumRightNodesFilteredTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getNumRightNodesFiltered();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNumRightNodesReachedTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.getNumRightNodesReached();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    int actual = recommendationStats.hashCode();

    // Assert
    assertEquals(-1259980928, actual);
  }

  @Test
  public void resetTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.reset();

    // Assert
    int numRightNodesFiltered = recommendationStats.getNumRightNodesFiltered();
    int minVisitsPerRightNode = recommendationStats.getMinVisitsPerRightNode();
    int numDirectNeighbors = recommendationStats.getNumDirectNeighbors();
    int numRHSVisits = recommendationStats.getNumRHSVisits();
    int maxVisitsPerRightNode = recommendationStats.getMaxVisitsPerRightNode();
    assertEquals(0, numRightNodesFiltered);
    assertEquals(0, recommendationStats.getNumRightNodesReached());
    assertEquals(0, maxVisitsPerRightNode);
    assertEquals(0, numRHSVisits);
    assertEquals(0, numDirectNeighbors);
    assertEquals(2147483647, minVisitsPerRightNode);
  }

  @Test
  public void setMaxVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int maxVisitsPerRightNode = 0;

    // Act
    recommendationStats.setMaxVisitsPerRightNode(maxVisitsPerRightNode);

    // Assert
    assertEquals(0, recommendationStats.getMaxVisitsPerRightNode());
  }

  @Test
  public void setMinVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int minVisitsPerRightNode = 0;

    // Act
    recommendationStats.setMinVisitsPerRightNode(minVisitsPerRightNode);

    // Assert
    assertEquals(0, recommendationStats.getMinVisitsPerRightNode());
  }

  @Test
  public void setNumDirectNeighborsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numDirectNeighbors = 0;

    // Act
    recommendationStats.setNumDirectNeighbors(numDirectNeighbors);

    // Assert
    assertEquals(0, recommendationStats.getNumDirectNeighbors());
  }

  @Test
  public void setNumRHSVisitsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numRHSVisits = 0;

    // Act
    recommendationStats.setNumRHSVisits(numRHSVisits);

    // Assert
    assertEquals(0, recommendationStats.getNumRHSVisits());
  }

  @Test
  public void setNumRightNodesFilteredTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numRightNodesFiltered = 0;

    // Act
    recommendationStats.setNumRightNodesFiltered(numRightNodesFiltered);

    // Assert
    assertEquals(0, recommendationStats.getNumRightNodesFiltered());
  }

  @Test
  public void setNumRightNodesReachedTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numRightNodesReached = 0;

    // Act
    recommendationStats.setNumRightNodesReached(numRightNodesReached);

    // Assert
    assertEquals(0, recommendationStats.getNumRightNodesReached());
  }

  @Test
  public void toStringTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    String actual = recommendationStats.toString();

    // Assert
    assertEquals(
        "RecommendationStats{numDirectNeighbors=0, numRightNodesReached=0, numRHSVisits=0, minVisitsPerRightNode=2147483647, maxVisitsPerRightNode=0, numRightNodesFiltered=0}",
        actual);
  }

  @Test
  public void updateMaxVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numVisits = 0;

    // Act
    recommendationStats.updateMaxVisitsPerRightNode(numVisits);

    // Assert
    assertEquals(0, recommendationStats.getMaxVisitsPerRightNode());
  }

  @Test
  public void updateMinVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numVisits = 0;

    // Act
    recommendationStats.updateMinVisitsPerRightNode(numVisits);

    // Assert
    assertEquals(0, recommendationStats.getMinVisitsPerRightNode());
  }

  @Test
  public void updateVisitStatsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();
    int numVisits = 0;

    // Act
    recommendationStats.updateVisitStatsPerRightNode(numVisits);

    // Assert
    int minVisitsPerRightNode = recommendationStats.getMinVisitsPerRightNode();
    assertEquals(0, recommendationStats.getMaxVisitsPerRightNode());
    assertEquals(0, minVisitsPerRightNode);
  }
}





















