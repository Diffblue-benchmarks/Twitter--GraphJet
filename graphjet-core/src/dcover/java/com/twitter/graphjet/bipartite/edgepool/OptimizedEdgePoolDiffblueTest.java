package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.BigIntArray;
import com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap;
import com.twitter.graphjet.hashing.IntToIntPairHashMap;
import com.twitter.graphjet.hashing.ShardedBigIntArray;
import com.twitter.graphjet.stats.NullStatsReceiver;
import com.twitter.graphjet.stats.StatsReceiver;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptimizedEdgePoolDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new OptimizedEdgePool.ReaderAccessibleInfo(edges,
        new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()))).getMetadata();
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    OptimizedEdgePool.ReaderAccessibleInfo actualReaderAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(
        edges, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Assert
    IntToIntPairHashMap expectedNodeInfo = actualReaderAccessibleInfo.nodeInfo;
    BigIntArray expectedEdges = actualReaderAccessibleInfo.edges;
    BigIntArray actualEdges = actualReaderAccessibleInfo.getEdges();
    assertSame(expectedEdges, actualEdges);
    assertSame(expectedNodeInfo, actualReaderAccessibleInfo.getNodeInfo());
  }

  @Test(timeout=10000)
  public void getNodeInfoTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(10, 42,
        new NullStatsReceiver());

    // Act and Assert
    assertSame(intToIntPairArrayIndexBasedMap,
        (new OptimizedEdgePool.ReaderAccessibleInfo(edges, intToIntPairArrayIndexBasedMap)).getNodeInfo());
  }

  @Test(timeout=10000)
  public void getEdgesTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    OptimizedEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(edges,
        new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Act and Assert
    assertSame(readerAccessibleInfo.edges, readerAccessibleInfo.getEdges());
  }

  @Test(timeout=10000)
  public void addEdgesTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 3, new NullStatsReceiver());
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act
    optimizedEdgePool.addEdges(2, 2, intArray, longArray, 2, 3);

    // Assert
    assertEquals(0.002288818359375, optimizedEdgePool.readerAccessibleInfo.getEdges().getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getEdgeMetadataTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(0L, (new OptimizedEdgePool(intArray, 3, new NullStatsReceiver())).getEdgeMetadata(1, 10));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    OptimizedEdgePool actualOptimizedEdgePool = new OptimizedEdgePool(intArray, 3, nullStatsReceiver);

    // Assert
    StatsReceiver actualStatsReceiver = actualOptimizedEdgePool.scopedStatsReceiver;
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = actualOptimizedEdgePool.readerAccessibleInfo;
    IntToIntPairHashMap intToIntPairHashMap = actualOptimizedEdgePool.intToIntPairHashMap;
    assertEquals(3, actualOptimizedEdgePool.maxNumEdges);
    assertTrue(intToIntPairHashMap instanceof IntToIntPairArrayIndexBasedMap);
    assertEquals(0, actualOptimizedEdgePool.currentNumEdgesStored);
    BigIntArray bigIntArray = ((IntToIntPairArrayIndexBasedMap) intToIntPairHashMap).array;
    assertEquals(1, actualOptimizedEdgePool.maxDegree);
    assertTrue(edgePoolReaderAccessibleInfo instanceof OptimizedEdgePool.ReaderAccessibleInfo);
    assertEquals(8, actualOptimizedEdgePool.numOfNodes);
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap actualNodeInfo = edgePoolReaderAccessibleInfo.getNodeInfo();
    assertSame(nullStatsReceiver, actualStatsReceiver);
    assertTrue(bigIntArray instanceof com.twitter.graphjet.hashing.ShardedBigIntArray);
    assertTrue(edges instanceof com.twitter.graphjet.hashing.ShardedBigIntArray);
    double actualFillPercentage = bigIntArray.getFillPercentage();
    assertSame(intToIntPairHashMap, actualNodeInfo);
    assertEquals(0.0, edges.getFillPercentage(), 0.0);
    assertEquals(0.01220703125, actualFillPercentage, 0.0);
  }
}

