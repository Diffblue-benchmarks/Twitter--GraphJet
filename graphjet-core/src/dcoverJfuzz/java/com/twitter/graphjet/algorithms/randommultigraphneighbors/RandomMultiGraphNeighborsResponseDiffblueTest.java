package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RandomMultiGraphNeighborsResponseDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new RandomMultiGraphNeighborsResponse(null)).getNeighborNodes());
  }

  @Test(timeout=10000)
  public void getNeighborNodesTest() {
    // Arrange, Act and Assert
    assertNull((new RandomMultiGraphNeighborsResponse(null)).getNeighborNodes());
  }
}

