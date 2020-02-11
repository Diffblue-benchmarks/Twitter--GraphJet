package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class IntersectionSimilarityRequestDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act
    IntersectionSimilarityRequest actualIntersectionSimilarityRequest = new IntersectionSimilarityRequest(1L, 3,
        longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true);

    // Assert
    int actualMinNeighborDegree = actualIntersectionSimilarityRequest.getMinNeighborDegree();
    int actualMinQueryDegree = actualIntersectionSimilarityRequest.getMinQueryDegree();
    int actualMaxNumResults = actualIntersectionSimilarityRequest.getMaxNumResults();
    LongSet actualSeedSet = actualIntersectionSimilarityRequest.getSeedSet();
    int actualMinCooccurrence = actualIntersectionSimilarityRequest.getMinCooccurrence();
    int actualMaxNumSamplesPerNeighbor = actualIntersectionSimilarityRequest.getMaxNumSamplesPerNeighbor();
    boolean actualPopulateTweetFeatures = actualIntersectionSimilarityRequest.getPopulateTweetFeatures();
    double actualMaxLowerMultiplicativeDeviation = actualIntersectionSimilarityRequest
        .getMaxLowerMultiplicativeDeviation();
    int actualMaxNumNeighbors = actualIntersectionSimilarityRequest.getMaxNumNeighbors();
    double actualMaxUpperMultiplicativeDeviation = actualIntersectionSimilarityRequest
        .getMaxUpperMultiplicativeDeviation();
    assertEquals(1, actualMinNeighborDegree);
    assertEquals(1L, actualIntersectionSimilarityRequest.getQueryNode());
    assertEquals(10.0, actualMaxUpperMultiplicativeDeviation, 0.0);
    assertEquals(3, actualMaxNumNeighbors);
    assertEquals(10.0, actualMaxLowerMultiplicativeDeviation, 0.0);
    assertTrue(actualPopulateTweetFeatures);
    assertEquals(3, actualMaxNumSamplesPerNeighbor);
    assertEquals(1, actualMinCooccurrence);
    assertSame(longAVLTreeSet, actualSeedSet);
    assertEquals(3, actualMaxNumResults);
    assertEquals(1, actualMinQueryDegree);
  }

  @Test(timeout=10000)
  public void getMaxUpperMultiplicativeDeviationTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(10.0, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMaxUpperMultiplicativeDeviation(), 0.0);
  }

  @Test(timeout=10000)
  public void getMaxNumNeighborsTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(3, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMaxNumNeighbors());
  }

  @Test(timeout=10000)
  public void getMaxLowerMultiplicativeDeviationTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(10.0, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMaxLowerMultiplicativeDeviation(), 0.0);
  }

  @Test(timeout=10000)
  public void getPopulateTweetFeaturesTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertTrue((new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getPopulateTweetFeatures());
  }

  @Test(timeout=10000)
  public void getMaxNumSamplesPerNeighborTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(3, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMaxNumSamplesPerNeighbor());
  }

  @Test(timeout=10000)
  public void getMinCooccurrenceTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(1, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMinCooccurrence());
  }

  @Test(timeout=10000)
  public void getSeedSetTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act
    LongSet actualSeedSet = (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getSeedSet();

    // Assert
    assertSame(longAVLTreeSet, actualSeedSet);
    assertEquals(1, actualSeedSet.size());
  }

  @Test(timeout=10000)
  public void getMinQueryDegreeTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(1, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMinQueryDegree());
  }

  @Test(timeout=10000)
  public void getMinNeighborDegreeTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(1, (new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true))
        .getMinNeighborDegree());
  }
}

