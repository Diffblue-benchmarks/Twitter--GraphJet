package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import org.junit.Test;

public class RandomMultiGraphNeighborsRequestDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));

    // Act
    RandomMultiGraphNeighborsRequest actualRandomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(
        long2DoubleAVLTreeMap, 3, 3);

    // Assert
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualRandomMultiGraphNeighborsRequest.getLeftSeedNodesWithWeight();
    int actualMaxNumResults = actualRandomMultiGraphNeighborsRequest.getMaxNumResults();
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(3, actualRandomMultiGraphNeighborsRequest.getMaxNumSamples());
    assertEquals(3, actualMaxNumResults);
  }

  @Test(timeout=10000)
  public void getMaxNumSamplesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));

    // Act and Assert
    assertEquals(3, (new RandomMultiGraphNeighborsRequest(long2DoubleAVLTreeMap, 3, 3)).getMaxNumSamples());
  }

  @Test(timeout=10000)
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));

    // Act and Assert
    assertEquals(3, (new RandomMultiGraphNeighborsRequest(long2DoubleAVLTreeMap, 3, 3)).getMaxNumResults());
  }

  @Test(timeout=10000)
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));

    // Act
    Long2DoubleMap actualLeftSeedNodesWithWeight = (new RandomMultiGraphNeighborsRequest(long2DoubleAVLTreeMap, 3, 3))
        .getLeftSeedNodesWithWeight();

    // Assert
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(1, actualLeftSeedNodesWithWeight.size());
    assertEquals(Double.valueOf(10.0), actualLeftSeedNodesWithWeight.get(Long.valueOf(1L)));
  }
}

