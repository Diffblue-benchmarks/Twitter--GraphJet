package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class OptimizedEdgeIteratorDiffblueTest {
  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(0, optimizedEdgeIterator.nextInt());
    assertEquals(1, optimizedEdgeIterator.currentEdge);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 3, new NullStatsReceiver());

    // Act and Assert
    assertSame(optimizedEdgePool, (new OptimizedEdgeIterator(optimizedEdgePool)).optimizedDegreeEdgePool);
  }

  @Test(timeout=10000)
  public void skipTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(0, (new OptimizedEdgeIterator(new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()))).skip(1));
  }

  @Test(timeout=10000)
  public void nextTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(Integer.valueOf(0), optimizedEdgeIterator.next());
    assertEquals(1, optimizedEdgeIterator.currentEdge);
  }

  @Test(timeout=10000)
  public void currentMetadataTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(0L,
        (new OptimizedEdgeIterator(new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()))).currentMetadata());
  }

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()));

    // Act
    OptimizedEdgeIterator actualResetForNodeResult = optimizedEdgeIterator.resetForNode(1);

    // Assert
    assertSame(optimizedEdgeIterator, actualResetForNodeResult);
    assertEquals(1, actualResetForNodeResult.position);
    assertEquals(0, actualResetForNodeResult.currentEdge);
    assertEquals(1, actualResetForNodeResult.degree);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertFalse((new OptimizedEdgeIterator(new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()))).hasNext());
  }
}

