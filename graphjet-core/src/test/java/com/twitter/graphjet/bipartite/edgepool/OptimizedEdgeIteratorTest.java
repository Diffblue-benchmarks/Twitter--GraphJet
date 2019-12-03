package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class OptimizedEdgeIteratorTest {
  @Test
  public void constructorTest() {
    // Arrange
    OptimizedEdgePool optimizedDegreeEdgePool = new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aakaa"));

    // Act
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(optimizedDegreeEdgePool);

    // Assert
    assertEquals(Integer.valueOf(0), optimizedEdgeIterator.next());
  }

  @Test
  public void currentMetadataTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act
    long actual = optimizedEdgeIterator.currentMetadata();

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void hasNextTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act
    boolean actual = optimizedEdgeIterator.hasNext();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void nextIntTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act
    int actual = optimizedEdgeIterator.nextInt();

    // Assert
    assertEquals(0, actual);
    assertFalse(optimizedEdgeIterator.hasNext());
  }

  @Test
  public void nextTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act
    Integer actual = optimizedEdgeIterator.next();

    // Assert
    assertEquals(Integer.valueOf(0), actual);
    assertFalse(optimizedEdgeIterator.hasNext());
  }

  @Test
  public void resetForNodeTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));
    int node = 0;

    // Act
    OptimizedEdgeIterator actual = optimizedEdgeIterator.resetForNode(node);

    // Assert
    assertFalse(actual.hasNext());
  }

  @Test
  public void skipTest() {
    // Arrange
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));
    int i = 0;

    // Act
    int actual = optimizedEdgeIterator.skip(i);

    // Assert
    assertEquals(0, actual);
  }
}






