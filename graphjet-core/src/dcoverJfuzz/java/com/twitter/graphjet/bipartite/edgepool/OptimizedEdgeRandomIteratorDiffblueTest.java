package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class OptimizedEdgeRandomIteratorDiffblueTest {
  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeRandomIterator optimizedEdgeRandomIterator = new OptimizedEdgeRandomIterator(
        new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()));

    // Act
    OptimizedEdgeRandomIterator actualResetForNodeResult = optimizedEdgeRandomIterator.resetForNode(1, 10, null);

    // Assert
    assertSame(optimizedEdgeRandomIterator, actualResetForNodeResult);
    assertTrue(actualResetForNodeResult.hasNext());
    assertEquals(1, actualResetForNodeResult.position);
    assertEquals(0, actualResetForNodeResult.currentEdge);
    assertEquals(1, actualResetForNodeResult.degree);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertTrue((new OptimizedEdgeRandomIterator(new OptimizedEdgePool(intArray, 3,
        new NullStatsReceiver()))).optimizedDegreeEdgePool instanceof OptimizedEdgePool);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertFalse(
        (new OptimizedEdgeRandomIterator(new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()))).hasNext());
  }
}

