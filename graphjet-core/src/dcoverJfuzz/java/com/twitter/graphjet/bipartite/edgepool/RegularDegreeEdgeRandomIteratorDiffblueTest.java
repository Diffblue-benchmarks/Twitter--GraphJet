package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RegularDegreeEdgeRandomIteratorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new RegularDegreeEdgeRandomIterator(new RegularDegreeEdgePool(10, 3,
        new NullStatsReceiver()))).regularDegreeEdgePool instanceof RegularDegreeEdgePool);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange, Act and Assert
    assertFalse(
        (new RegularDegreeEdgeRandomIterator(new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).hasNext());
  }

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange
    RegularDegreeEdgeRandomIterator regularDegreeEdgeRandomIterator = new RegularDegreeEdgeRandomIterator(
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()));

    // Act
    RegularDegreeEdgeRandomIterator actualResetForNodeResult = regularDegreeEdgeRandomIterator.resetForNode(1, 10,
        null);

    // Assert
    assertSame(regularDegreeEdgeRandomIterator, actualResetForNodeResult);
    assertTrue(actualResetForNodeResult.hasNext());
    assertEquals(0, actualResetForNodeResult.currentEdge);
    assertEquals(0, actualResetForNodeResult.degree);
  }
}

