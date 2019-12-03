package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class IntersectionSimilarityRequestTest {
  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;
    int maxNumResults = 1;
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    int maxNumNeighbors = 1;
    int minNeighborDegree = 1;
    int maxNumSamplesPerNeighbor = 1;
    int minCooccurrence = 2561;
    int minQueryDegree = 1;
    double maxLowerMultiplicativeDeviation = 1.0;
    double maxUpperMultiplicativeDeviation = 1.0;
    boolean populateTweetFeatures = true;

    // Act
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(queryNode,
        maxNumResults, longAVLTreeSet, maxNumNeighbors, minNeighborDegree, maxNumSamplesPerNeighbor, minCooccurrence,
        minQueryDegree, maxLowerMultiplicativeDeviation, maxUpperMultiplicativeDeviation, populateTweetFeatures);

    // Assert
    int minNeighborDegree1 = intersectionSimilarityRequest.getMinNeighborDegree();
    int minQueryDegree1 = intersectionSimilarityRequest.getMinQueryDegree();
    int maxNumResults1 = intersectionSimilarityRequest.getMaxNumResults();
    LongSet seedSet = intersectionSimilarityRequest.getSeedSet();
    int minCooccurrence1 = intersectionSimilarityRequest.getMinCooccurrence();
    int maxNumSamplesPerNeighbor1 = intersectionSimilarityRequest.getMaxNumSamplesPerNeighbor();
    boolean populateTweetFeatures1 = intersectionSimilarityRequest.getPopulateTweetFeatures();
    double maxLowerMultiplicativeDeviation1 = intersectionSimilarityRequest.getMaxLowerMultiplicativeDeviation();
    int maxNumNeighbors1 = intersectionSimilarityRequest.getMaxNumNeighbors();
    double maxUpperMultiplicativeDeviation1 = intersectionSimilarityRequest.getMaxUpperMultiplicativeDeviation();
    assertEquals(1, minNeighborDegree1);
    assertEquals(1L, intersectionSimilarityRequest.getQueryNode());
    assertEquals(1.0, maxUpperMultiplicativeDeviation1, 0.0);
    assertEquals(1, maxNumNeighbors1);
    assertEquals(1.0, maxLowerMultiplicativeDeviation1, 0.0);
    assertTrue(populateTweetFeatures1);
    assertEquals(1, maxNumSamplesPerNeighbor1);
    assertEquals(2561, minCooccurrence1);
    assertSame(longAVLTreeSet, seedSet);
    assertEquals(1, maxNumResults1);
    assertEquals(1, minQueryDegree1);
  }

  @Test
  public void getMaxLowerMultiplicativeDeviationTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    double actual = intersectionSimilarityRequest.getMaxLowerMultiplicativeDeviation();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void getMaxNumNeighborsTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    int actual = intersectionSimilarityRequest.getMaxNumNeighbors();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxNumSamplesPerNeighborTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    int actual = intersectionSimilarityRequest.getMaxNumSamplesPerNeighbor();

    // Assert
    assertEquals(655361, actual);
  }

  @Test
  public void getMaxUpperMultiplicativeDeviationTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    double actual = intersectionSimilarityRequest.getMaxUpperMultiplicativeDeviation();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void getMinCooccurrenceTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    int actual = intersectionSimilarityRequest.getMinCooccurrence();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMinNeighborDegreeTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    int actual = intersectionSimilarityRequest.getMinNeighborDegree();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMinQueryDegreeTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    int actual = intersectionSimilarityRequest.getMinQueryDegree();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getPopulateTweetFeaturesTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    boolean actual = intersectionSimilarityRequest.getPopulateTweetFeatures();

    // Assert
    assertTrue(actual);
  }

  @Test
  public void getSeedSetTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    IntersectionSimilarityRequest intersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 1,
        longAVLTreeSet, 1, 1, 655361, 1, 1, 1.0, 1.0, true);

    // Act
    LongSet actual = intersectionSimilarityRequest.getSeedSet();

    // Assert
    assertEquals(0, actual.size());
  }
}









