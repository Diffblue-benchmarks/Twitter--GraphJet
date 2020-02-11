package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.BigIntArray;
import com.twitter.graphjet.hashing.BigLongArray;
import com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap;
import com.twitter.graphjet.hashing.IntToIntPairHashMap;
import com.twitter.graphjet.hashing.ShardedBigIntArray;
import com.twitter.graphjet.hashing.ShardedBigLongArray;
import com.twitter.graphjet.stats.NullStatsReceiver;
import com.twitter.graphjet.stats.StatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class WithEdgeMetadataOptimizedEdgePoolDiffblueTest {
  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        edges, metadata, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Act and Assert
    assertSame(withEdgeMetadataReaderAccessibleInfo.metadata, withEdgeMetadataReaderAccessibleInfo.getMetadata());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());

    // Act
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo actualWithEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        edges, metadata, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Assert
    BigLongArray expectedMetadata = actualWithEdgeMetadataReaderAccessibleInfo.metadata;
    IntToIntPairHashMap expectedNodeInfo = actualWithEdgeMetadataReaderAccessibleInfo.nodeInfo;
    BigIntArray expectedEdges = actualWithEdgeMetadataReaderAccessibleInfo.edges;
    BigIntArray actualEdges = actualWithEdgeMetadataReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap actualNodeInfo = actualWithEdgeMetadataReaderAccessibleInfo.getNodeInfo();
    assertSame(expectedEdges, actualEdges);
    assertSame(expectedMetadata, actualWithEdgeMetadataReaderAccessibleInfo.getMetadata());
    assertSame(expectedNodeInfo, actualNodeInfo);
  }

  @Test(timeout=10000)
  public void getNodeInfoTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(10, 42,
        new NullStatsReceiver());

    // Act and Assert
    assertSame(intToIntPairArrayIndexBasedMap,
        (new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(edges, metadata,
            intToIntPairArrayIndexBasedMap)).getNodeInfo());
  }

  @Test(timeout=10000)
  public void getEdgesTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        edges, metadata, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Act and Assert
    assertSame(withEdgeMetadataReaderAccessibleInfo.edges, withEdgeMetadataReaderAccessibleInfo.getEdges());
  }

  @Test(timeout=10000)
  public void addEdgesTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    WithEdgeMetadataOptimizedEdgePool withEdgeMetadataOptimizedEdgePool = new WithEdgeMetadataOptimizedEdgePool(
        intArray, 3, new NullStatsReceiver());
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act
    withEdgeMetadataOptimizedEdgePool.addEdges(2, 2, intArray, longArray, 2, 3);

    // Assert
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = withEdgeMetadataOptimizedEdgePool.readerAccessibleInfo;
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    BigLongArray metadata = edgePoolReaderAccessibleInfo.getMetadata();
    double actualFillPercentage = edges.getFillPercentage();
    assertEquals(0.002288818359375, actualFillPercentage, 0.0);
    assertEquals(0.002288818359375, metadata.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getEdgeMetadataTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(0L,
        (new WithEdgeMetadataOptimizedEdgePool(intArray, 3, new NullStatsReceiver())).getEdgeMetadata(1, 10));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    WithEdgeMetadataOptimizedEdgePool actualWithEdgeMetadataOptimizedEdgePool = new WithEdgeMetadataOptimizedEdgePool(
        intArray, 3, nullStatsReceiver);

    // Assert
    StatsReceiver actualStatsReceiver = actualWithEdgeMetadataOptimizedEdgePool.scopedStatsReceiver;
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = actualWithEdgeMetadataOptimizedEdgePool.readerAccessibleInfo;
    IntToIntPairHashMap intToIntPairHashMap = actualWithEdgeMetadataOptimizedEdgePool.intToIntPairHashMap;
    assertEquals(3, actualWithEdgeMetadataOptimizedEdgePool.maxNumEdges);
    assertTrue(intToIntPairHashMap instanceof IntToIntPairArrayIndexBasedMap);
    assertEquals(0, actualWithEdgeMetadataOptimizedEdgePool.currentNumEdgesStored);
    BigIntArray bigIntArray = ((IntToIntPairArrayIndexBasedMap) intToIntPairHashMap).array;
    assertEquals(1, actualWithEdgeMetadataOptimizedEdgePool.maxDegree);
    assertTrue(
        edgePoolReaderAccessibleInfo instanceof WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo);
    assertEquals(8, actualWithEdgeMetadataOptimizedEdgePool.numOfNodes);
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap actualNodeInfo = edgePoolReaderAccessibleInfo.getNodeInfo();
    BigLongArray metadata = edgePoolReaderAccessibleInfo.getMetadata();
    assertSame(nullStatsReceiver, actualStatsReceiver);
    assertTrue(bigIntArray instanceof com.twitter.graphjet.hashing.ShardedBigIntArray);
    assertSame(intToIntPairHashMap, actualNodeInfo);
    double actualFillPercentage = bigIntArray.getFillPercentage();
    assertTrue(edges instanceof com.twitter.graphjet.hashing.ShardedBigIntArray);
    assertTrue(metadata instanceof com.twitter.graphjet.hashing.ShardedBigLongArray);
    double actualFillPercentage1 = edges.getFillPercentage();
    assertEquals(0.0, actualFillPercentage1, 0.0);
    assertEquals(0.0, metadata.getFillPercentage(), 0.0);
    assertEquals(0.01220703125, actualFillPercentage, 0.0);
  }
}

