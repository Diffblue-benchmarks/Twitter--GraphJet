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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WithEdgeMetadataRegularDegreeEdgePoolDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        edges, metadata, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Act and Assert
    assertSame(withEdgeMetadataReaderAccessibleInfo.metadata, withEdgeMetadataReaderAccessibleInfo.getMetadata());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(10, 42,
        new NullStatsReceiver());

    // Act
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo actualWithEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray, intToIntPairArrayIndexBasedMap);

    // Assert
    BigIntArray actualEdges = actualWithEdgeMetadataReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap actualNodeInfo = actualWithEdgeMetadataReaderAccessibleInfo.getNodeInfo();
    assertSame(shardedBigIntArray, actualEdges);
    assertSame(shardedBigLongArray, actualWithEdgeMetadataReaderAccessibleInfo.getMetadata());
    assertSame(intToIntPairArrayIndexBasedMap, actualNodeInfo);
  }

  @Test(timeout=10000)
  public void getNodeInfoTest() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        edges, metadata, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Act and Assert
    assertSame(withEdgeMetadataReaderAccessibleInfo.nodeInfo, withEdgeMetadataReaderAccessibleInfo.getNodeInfo());
  }

  @Test(timeout=10000)
  public void getEdgesTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    ShardedBigLongArray metadata = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());

    // Act and Assert
    assertSame(shardedBigIntArray,
        (new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(shardedBigIntArray, metadata,
            new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()))).getEdges());
  }

  @Test(timeout=10000)
  public void addEdgeTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new WithEdgeMetadataRegularDegreeEdgePool(10, 3, new NullStatsReceiver())).addEdge(2, 2);
  }

  @Test(timeout=10000)
  public void getMetadataShardTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new WithEdgeMetadataRegularDegreeEdgePool(10, 3, new NullStatsReceiver())).getMetadataShard(1);
  }

  @Test(timeout=10000)
  public void addEdgeTest() {
    // Arrange
    WithEdgeMetadataRegularDegreeEdgePool withEdgeMetadataRegularDegreeEdgePool = new WithEdgeMetadataRegularDegreeEdgePool(
        10, 3, new NullStatsReceiver());

    // Act
    withEdgeMetadataRegularDegreeEdgePool.addEdge(2, 2, 1L);

    // Assert
    int actualResultInt = withEdgeMetadataRegularDegreeEdgePool.currentPositionOffset;
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = withEdgeMetadataRegularDegreeEdgePool.readerAccessibleInfo;
    assertEquals(1, withEdgeMetadataRegularDegreeEdgePool.currentNumNodes);
    assertEquals(1, withEdgeMetadataRegularDegreeEdgePool.currentNumEdgesStored);
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    assertEquals(3, actualResultInt);
    double actualFillPercentage = edgePoolReaderAccessibleInfo.getMetadata().getFillPercentage();
    assertEquals(7.62939453125E-4, actualFillPercentage, 0.0);
    assertEquals(7.62939453125E-4, edges.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getNumberedEdgeMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new WithEdgeMetadataRegularDegreeEdgePool(10, 3, new NullStatsReceiver())).getNumberedEdgeMetadata(1, 10));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    WithEdgeMetadataRegularDegreeEdgePool actualWithEdgeMetadataRegularDegreeEdgePool = new WithEdgeMetadataRegularDegreeEdgePool(
        10, 3, nullStatsReceiver);

    // Assert
    double actualFillPercentage = actualWithEdgeMetadataRegularDegreeEdgePool.getFillPercentage();
    StatsReceiver actualStatsReceiver = actualWithEdgeMetadataRegularDegreeEdgePool.scopedStatsReceiver;
    int actualResultInt = actualWithEdgeMetadataRegularDegreeEdgePool.currentPositionOffset;
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = actualWithEdgeMetadataRegularDegreeEdgePool.readerAccessibleInfo;
    assertEquals(0, actualWithEdgeMetadataRegularDegreeEdgePool.currentShardId);
    assertEquals(0, actualWithEdgeMetadataRegularDegreeEdgePool.currentNumNodes);
    assertEquals(3, actualWithEdgeMetadataRegularDegreeEdgePool.maxDegree);
    assertSame(actualWithEdgeMetadataRegularDegreeEdgePool.numNodesCounter,
        actualWithEdgeMetadataRegularDegreeEdgePool.numEdgesCounter);
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap nodeInfo = edgePoolReaderAccessibleInfo.getNodeInfo();
    BigLongArray metadata = edgePoolReaderAccessibleInfo.getMetadata();
    assertEquals(0, actualResultInt);
    assertEquals(0.0, actualFillPercentage, 0.0);
    assertSame(nullStatsReceiver, actualStatsReceiver);
    assertTrue(metadata instanceof com.twitter.graphjet.hashing.ShardedBigLongArray);
    assertTrue(nodeInfo instanceof com.twitter.graphjet.hashing.IntToIntPairConcurrentHashMap);
    double actualFillPercentage1 = metadata.getFillPercentage();
    assertEquals(0.0, actualFillPercentage1, 0.0);
    assertEquals(0.0, edges.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    WithEdgeMetadataRegularDegreeEdgePool actualWithEdgeMetadataRegularDegreeEdgePool = new WithEdgeMetadataRegularDegreeEdgePool(
        10, 2, nullStatsReceiver);

    // Assert
    double actualFillPercentage = actualWithEdgeMetadataRegularDegreeEdgePool.getFillPercentage();
    StatsReceiver actualStatsReceiver = actualWithEdgeMetadataRegularDegreeEdgePool.scopedStatsReceiver;
    int actualResultInt = actualWithEdgeMetadataRegularDegreeEdgePool.currentPositionOffset;
    EdgePoolReaderAccessibleInfo edgePoolReaderAccessibleInfo = actualWithEdgeMetadataRegularDegreeEdgePool.readerAccessibleInfo;
    assertEquals(0, actualWithEdgeMetadataRegularDegreeEdgePool.currentShardId);
    assertEquals(0, actualWithEdgeMetadataRegularDegreeEdgePool.currentNumNodes);
    assertEquals(2, actualWithEdgeMetadataRegularDegreeEdgePool.maxDegree);
    assertSame(actualWithEdgeMetadataRegularDegreeEdgePool.numNodesCounter,
        actualWithEdgeMetadataRegularDegreeEdgePool.numEdgesCounter);
    BigIntArray edges = edgePoolReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap nodeInfo = edgePoolReaderAccessibleInfo.getNodeInfo();
    BigLongArray metadata = edgePoolReaderAccessibleInfo.getMetadata();
    assertEquals(0, actualResultInt);
    assertEquals(0.0, actualFillPercentage, 0.0);
    assertSame(nullStatsReceiver, actualStatsReceiver);
    assertTrue(metadata instanceof com.twitter.graphjet.hashing.ShardedBigLongArray);
    assertTrue(nodeInfo instanceof IntToIntPairArrayIndexBasedMap);
    double actualFillPercentage1 = metadata.getFillPercentage();
    BigIntArray bigIntArray = ((IntToIntPairArrayIndexBasedMap) nodeInfo).array;
    assertTrue(bigIntArray instanceof com.twitter.graphjet.hashing.ShardedBigIntArray);
    assertEquals(0.0, edges.getFillPercentage(), 0.0);
    assertEquals(0.0, actualFillPercentage1, 0.0);
    assertEquals(0.0, bigIntArray.getFillPercentage(), 0.0);
  }
}

