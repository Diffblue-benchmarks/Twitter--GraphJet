package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptimizedEdgeRandomIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgePool optimizedDegreeEdgePool = new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aakaa"));

    // Act
    new OptimizedEdgeRandomIterator(optimizedDegreeEdgePool);
  }

  @Test
  public void hasNextTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeRandomIterator optimizedEdgeRandomIterator = new OptimizedEdgeRandomIterator(
        new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act
    boolean actual = optimizedEdgeRandomIterator.hasNext();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void nextIntTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeRandomIterator optimizedEdgeRandomIterator = new OptimizedEdgeRandomIterator(
        new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    optimizedEdgeRandomIterator.nextInt();
  }

  @Test
  public void resetForNodeTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeRandomIterator optimizedEdgeRandomIterator = new OptimizedEdgeRandomIterator(
        new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aaaaaaaaaaaaaaa")));
    int node = 1;
    int numSamplesToGet = 1;
    Random randomGen = new Random();

    // Act
    OptimizedEdgeRandomIterator actual = optimizedEdgeRandomIterator.resetForNode(node, numSamplesToGet, randomGen);

    // Assert
    Integer nextResult = actual.next();
    assertEquals(Integer.valueOf(0), nextResult);
    assertFalse(actual.hasNext());
  }
}



