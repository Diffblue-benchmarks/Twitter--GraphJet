package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class LeftIndexedReaderAccessibleInfoTest {
  @Test
  public void addLeftNodeTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));
    long node = 2561L;

    // Act
    int actual = leftIndexedReaderAccessibleInfo.addLeftNode(node);

    // Assert
    assertEquals(8, actual);
  }

  @Test
  public void addRightNodeTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));
    long node = 2561L;

    // Act
    int actual = leftIndexedReaderAccessibleInfo.addRightNode(node);

    // Assert
    assertEquals(8, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, new DefaultStatsReceiver("aaaaa"));
    OptimizedEdgePool leftNodeEdgePool = null;

    // Act
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap, leftNodeEdgePool);

    // Assert
    EdgePool leftNodeEdgePool1 = leftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = leftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap();
    assertNull(leftNodeEdgePool1);
    assertSame(arrayBasedLongToInternalIntBiMap, leftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap());
    assertSame(arrayBasedLongToInternalIntBiMap, rightNodesToIndexBiMap);
  }

  @Test
  public void getIndexForLeftNodeTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));
    long node = 2561L;

    // Act
    int actual = leftIndexedReaderAccessibleInfo.getIndexForLeftNode(node);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getIndexForRightNodeTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));
    long node = 2561L;

    // Act
    int actual = leftIndexedReaderAccessibleInfo.getIndexForRightNode(node);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getLeftNodeEdgePoolTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 1, defaultStatsReceiver);
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1, optimizedEdgePool);

    // Act
    EdgePool actual = leftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();

    // Assert
    assertSame(optimizedEdgePool, actual);
  }

  @Test
  public void getLeftNodesToIndexBiMapTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));

    // Act
    LongToInternalIntBiMap actual = leftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap();

    // Assert
    assertSame(arrayBasedLongToInternalIntBiMap, actual);
  }

  @Test
  public void getRightNodesToIndexBiMapTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1,
        new OptimizedEdgePool(intArray, 1, defaultStatsReceiver));

    // Act
    LongToInternalIntBiMap actual = leftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap();

    // Assert
    assertSame(arrayBasedLongToInternalIntBiMap1, actual);
  }
}







