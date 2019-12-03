package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ReaderAccessibleInfoTest {
  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    OptimizedEdgePool leftNodeEdgePool = null;
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[6] = 2561;
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 1, defaultStatsReceiver);

    // Act
    ReaderAccessibleInfo readerAccessibleInfo = new ReaderAccessibleInfo(arrayBasedLongToInternalIntBiMap,
        arrayBasedLongToInternalIntBiMap, leftNodeEdgePool, optimizedEdgePool);

    // Assert
    EdgePool rightNodeEdgePool = readerAccessibleInfo.getRightNodeEdgePool();
    EdgePool leftNodeEdgePool1 = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    LongToInternalIntBiMap leftNodesToIndexBiMap = readerAccessibleInfo.getLeftNodesToIndexBiMap();
    assertSame(optimizedEdgePool, rightNodeEdgePool);
    assertSame(arrayBasedLongToInternalIntBiMap, leftNodesToIndexBiMap);
    assertNull(leftNodeEdgePool1);
    assertSame(leftNodesToIndexBiMap, rightNodesToIndexBiMap);
  }

  @Test
  public void getRightNodeEdgePoolTest() {
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
    ReaderAccessibleInfo readerAccessibleInfo = new ReaderAccessibleInfo(arrayBasedLongToInternalIntBiMap,
        arrayBasedLongToInternalIntBiMap1, optimizedEdgePool, optimizedEdgePool);

    // Act
    EdgePool actual = readerAccessibleInfo.getRightNodeEdgePool();

    // Assert
    assertSame(optimizedEdgePool, actual);
  }
}

