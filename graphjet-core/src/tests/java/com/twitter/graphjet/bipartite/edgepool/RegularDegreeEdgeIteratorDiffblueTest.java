package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RegularDegreeEdgeIteratorDiffblueTest {
  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(0, regularDegreeEdgeIterator.nextInt());
    assertEquals(1, regularDegreeEdgeIterator.currentEdge);
  }

  @Test(timeout=10000)
  public void skipTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RegularDegreeEdgeIterator(new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).skip(1));
  }

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()));

    // Act
    RegularDegreeEdgeIterator actualResetForNodeResult = regularDegreeEdgeIterator.resetForNode(1);

    // Assert
    assertSame(regularDegreeEdgeIterator, actualResetForNodeResult);
    assertEquals(0, actualResetForNodeResult.currentEdge);
    assertEquals(0, actualResetForNodeResult.degree);
  }

  @Test(timeout=10000)
  public void nextTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(Integer.valueOf(0), regularDegreeEdgeIterator.next());
    assertEquals(1, regularDegreeEdgeIterator.currentEdge);
  }

  @Test(timeout=10000)
  public void currentMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new RegularDegreeEdgeIterator(new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).currentMetadata());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act and Assert
    assertSame(regularDegreeEdgePool, (new RegularDegreeEdgeIterator(regularDegreeEdgePool)).regularDegreeEdgePool);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange, Act and Assert
    assertFalse((new RegularDegreeEdgeIterator(new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).hasNext());
  }
}

