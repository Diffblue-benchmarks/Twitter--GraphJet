package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class RandomMultiGraphNeighborsResponseTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<NeighborInfo> arrayList = new ArrayList<NeighborInfo>();
    ((ArrayList<NeighborInfo>) arrayList).add(new NeighborInfo(1L, 1.0, 1));

    // Act
    RandomMultiGraphNeighborsResponse randomMultiGraphNeighborsResponse = new RandomMultiGraphNeighborsResponse(
        (Iterable<NeighborInfo>) arrayList);

    // Assert
    assertSame(arrayList, randomMultiGraphNeighborsResponse.getNeighborNodes());
  }

  @Test
  public void getNeighborNodesTest() {
    // Arrange
    ArrayList<NeighborInfo> arrayList = new ArrayList<NeighborInfo>();
    ((ArrayList<NeighborInfo>) arrayList).add(new NeighborInfo(1L, 1.0, 1));
    RandomMultiGraphNeighborsResponse randomMultiGraphNeighborsResponse = new RandomMultiGraphNeighborsResponse(
        (Iterable<NeighborInfo>) arrayList);

    // Act
    Iterable<NeighborInfo> actual = randomMultiGraphNeighborsResponse.getNeighborNodes();

    // Assert
    assertEquals(1, ((ArrayList<NeighborInfo>) actual).size());
  }
}

