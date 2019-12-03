package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import org.junit.Test;

public class RandomMultiGraphNeighborsRequestTest {
  @Test
  public void constructorTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    int maxNumSamples = 1;
    int maxResults = 1;

    // Act
    RandomMultiGraphNeighborsRequest randomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(
        long2DoubleAVLTreeMap, maxNumSamples, maxResults);

    // Assert
    Long2DoubleMap leftSeedNodesWithWeight = randomMultiGraphNeighborsRequest.getLeftSeedNodesWithWeight();
    int maxNumResults = randomMultiGraphNeighborsRequest.getMaxNumResults();
    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
    assertEquals(1, randomMultiGraphNeighborsRequest.getMaxNumSamples());
    assertEquals(1, maxNumResults);
  }

  @Test
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    RandomMultiGraphNeighborsRequest randomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(
        long2DoubleAVLTreeMap, 1, 1);

    // Act
    Long2DoubleMap actual = randomMultiGraphNeighborsRequest.getLeftSeedNodesWithWeight();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    RandomMultiGraphNeighborsRequest randomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(
        long2DoubleAVLTreeMap, 1, 1);

    // Act
    int actual = randomMultiGraphNeighborsRequest.getMaxNumResults();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxNumSamplesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    RandomMultiGraphNeighborsRequest randomMultiGraphNeighborsRequest = new RandomMultiGraphNeighborsRequest(
        long2DoubleAVLTreeMap, 1, 1);

    // Act
    int actual = randomMultiGraphNeighborsRequest.getMaxNumSamples();

    // Assert
    assertEquals(1, actual);
  }
}



