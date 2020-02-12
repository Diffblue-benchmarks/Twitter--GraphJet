package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RecommendationStatsDiffblueTest {
  @Test(timeout=10000)
  public void setMinVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setMinVisitsPerRightNode(1);

    // Assert
    assertEquals(1, recommendationStats.getMinVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void getNumRightNodesReachedTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RecommendationStats()).getNumRightNodesReached());
  }

  @Test(timeout=10000)
  public void getNumRHSVisitsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RecommendationStats()).getNumRHSVisits());
  }

  @Test(timeout=10000)
  public void setNumRightNodesFilteredTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setNumRightNodesFiltered(10);

    // Assert
    assertEquals(10, recommendationStats.getNumRightNodesFiltered());
  }

  @Test(timeout=10000)
  public void getNumDirectNeighborsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RecommendationStats()).getNumDirectNeighbors());
  }

  @Test(timeout=10000)
  public void getMinVisitsPerRightNodeTest() {
    // Arrange, Act and Assert
    assertEquals(2147483647, (new RecommendationStats()).getMinVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void setNumRHSVisitsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setNumRHSVisits(10);

    // Assert
    assertEquals(10, recommendationStats.getNumRHSVisits());
  }

  @Test(timeout=10000)
  public void addToNumRHSVisitsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.addToNumRHSVisits(10);

    // Assert
    assertEquals(10, recommendationStats.getNumRHSVisits());
  }

  @Test(timeout=10000)
  public void setMaxVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setMaxVisitsPerRightNode(3);

    // Assert
    assertEquals(3, recommendationStats.getMaxVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void setNumRightNodesReachedTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setNumRightNodesReached(10);

    // Assert
    assertEquals(10, recommendationStats.getNumRightNodesReached());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RecommendationStats()).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    RecommendationStats actualRecommendationStats = new RecommendationStats(10, 10, 10, 1, 3, 10);

    // Assert
    int actualNumRightNodesFiltered = actualRecommendationStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = actualRecommendationStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = actualRecommendationStats.getNumDirectNeighbors();
    int actualNumRHSVisits = actualRecommendationStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = actualRecommendationStats.getMaxVisitsPerRightNode();
    assertEquals(10, actualNumRightNodesFiltered);
    assertEquals(10, actualRecommendationStats.getNumRightNodesReached());
    assertEquals(3, actualMaxVisitsPerRightNode);
    assertEquals(10, actualNumRHSVisits);
    assertEquals(10, actualNumDirectNeighbors);
    assertEquals(1, actualMinVisitsPerRightNode);
  }

  @Test(timeout=10000)
  public void updateVisitStatsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.updateVisitStatsPerRightNode(10);

    // Assert
    int actualMinVisitsPerRightNode = recommendationStats.getMinVisitsPerRightNode();
    assertEquals(10, recommendationStats.getMaxVisitsPerRightNode());
    assertEquals(10, actualMinVisitsPerRightNode);
  }

  @Test(timeout=10000)
  public void getMaxVisitsPerRightNodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RecommendationStats()).getMaxVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void updateMinVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.updateMinVisitsPerRightNode(10);

    // Assert
    assertEquals(10, recommendationStats.getMinVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void resetTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.reset();

    // Assert
    int actualNumRightNodesFiltered = recommendationStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = recommendationStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = recommendationStats.getNumDirectNeighbors();
    int actualNumRHSVisits = recommendationStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = recommendationStats.getMaxVisitsPerRightNode();
    assertEquals(0, actualNumRightNodesFiltered);
    assertEquals(0, recommendationStats.getNumRightNodesReached());
    assertEquals(0, actualMaxVisitsPerRightNode);
    assertEquals(0, actualNumRHSVisits);
    assertEquals(0, actualNumDirectNeighbors);
    assertEquals(2147483647, actualMinVisitsPerRightNode);
  }

  @Test(timeout=10000)
  public void updateMaxVisitsPerRightNodeTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.updateMaxVisitsPerRightNode(10);

    // Assert
    assertEquals(10, recommendationStats.getMaxVisitsPerRightNode());
  }

  @Test(timeout=10000)
  public void setNumDirectNeighborsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    recommendationStats.setNumDirectNeighbors(10);

    // Assert
    assertEquals(10, recommendationStats.getNumDirectNeighbors());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1259980928, (new RecommendationStats()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    RecommendationStats actualRecommendationStats = new RecommendationStats();

    // Assert
    int actualNumRightNodesFiltered = actualRecommendationStats.getNumRightNodesFiltered();
    int actualMinVisitsPerRightNode = actualRecommendationStats.getMinVisitsPerRightNode();
    int actualNumDirectNeighbors = actualRecommendationStats.getNumDirectNeighbors();
    int actualNumRHSVisits = actualRecommendationStats.getNumRHSVisits();
    int actualMaxVisitsPerRightNode = actualRecommendationStats.getMaxVisitsPerRightNode();
    assertEquals(0, actualNumRightNodesFiltered);
    assertEquals(0, actualRecommendationStats.getNumRightNodesReached());
    assertEquals(0, actualMaxVisitsPerRightNode);
    assertEquals(0, actualNumRHSVisits);
    assertEquals(0, actualNumDirectNeighbors);
    assertEquals(2147483647, actualMinVisitsPerRightNode);
  }

  @Test(timeout=10000)
  public void getNumRightNodesFilteredTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RecommendationStats()).getNumRightNodesFiltered());
  }
}

