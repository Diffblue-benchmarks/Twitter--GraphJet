package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.hashing.BigIntArray;
import com.twitter.graphjet.hashing.BigLongArray;
import com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap;
import com.twitter.graphjet.hashing.IntToIntPairHashMap;
import com.twitter.graphjet.hashing.ShardedBigIntArray;
import com.twitter.graphjet.hashing.ShardedBigLongArray;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WithEdgeMetadataOptimizedEdgePoolTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void WithEdgeMetadataReaderAccessibleInfoConstructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(11, 1, 1L, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("aaaaa"));

    // Act
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray, intToIntPairArrayIndexBasedMap);

    // Assert
    BigIntArray edges = withEdgeMetadataReaderAccessibleInfo.getEdges();
    IntToIntPairHashMap nodeInfo = withEdgeMetadataReaderAccessibleInfo.getNodeInfo();
    assertSame(shardedBigIntArray, edges);
    assertSame(shardedBigLongArray, withEdgeMetadataReaderAccessibleInfo.getMetadata());
    assertSame(intToIntPairArrayIndexBasedMap, nodeInfo);
  }

  @Test
  public void WithEdgeMetadataReaderAccessibleInfoGetEdgesTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(1, 1, 1L, defaultStatsReceiver);
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray,
        new IntToIntPairArrayIndexBasedMap(1, 1, new DefaultStatsReceiver("aaaaa")));

    // Act
    BigIntArray actual = withEdgeMetadataReaderAccessibleInfo.getEdges();

    // Assert
    assertSame(shardedBigIntArray, actual);
  }

  @Test
  public void WithEdgeMetadataReaderAccessibleInfoGetMetadataTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(1, 1, 1L, defaultStatsReceiver);
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray,
        new IntToIntPairArrayIndexBasedMap(1, 1, new DefaultStatsReceiver("aaaaa")));

    // Act
    BigLongArray actual = withEdgeMetadataReaderAccessibleInfo.getMetadata();

    // Assert
    assertSame(shardedBigLongArray, actual);
  }

  @Test
  public void WithEdgeMetadataReaderAccessibleInfoGetNodeInfoTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(1, 1, 1L, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("aaaaa"));
    WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataOptimizedEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray, intToIntPairArrayIndexBasedMap);

    // Act
    IntToIntPairHashMap actual = withEdgeMetadataReaderAccessibleInfo.getNodeInfo();

    // Assert
    assertSame(intToIntPairArrayIndexBasedMap, actual);
  }

  @Test
  public void addEdgesTest() {
    // Arrange
    int[] intArray = new int[8];
    WithEdgeMetadataOptimizedEdgePool withEdgeMetadataOptimizedEdgePool = new WithEdgeMetadataOptimizedEdgePool(
        intArray, 0, new DefaultStatsReceiver("aaaka"));
    int node = 0;
    int pool = 0;
    long[] metadata = new long[8];
    int srcPos = 0;
    int length = 0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    withEdgeMetadataOptimizedEdgePool.addEdges(node, pool, intArray, metadata, srcPos, length);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int[] nodeDegrees = new int[8];
    int maxNumEdges = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    WithEdgeMetadataOptimizedEdgePool withEdgeMetadataOptimizedEdgePool = new WithEdgeMetadataOptimizedEdgePool(
        nodeDegrees, maxNumEdges, statsReceiver);

    // Assert
    assertEquals(Double.NaN, withEdgeMetadataOptimizedEdgePool.getFillPercentage(), 0.0);
  }

  @Test
  public void getEdgeMetadataTest() {
    // Arrange
    WithEdgeMetadataOptimizedEdgePool withEdgeMetadataOptimizedEdgePool = new WithEdgeMetadataOptimizedEdgePool(
        new int[8], 0, new DefaultStatsReceiver("aaaka"));
    int position = 0;
    int edgeNumber = 0;

    // Act
    long actual = withEdgeMetadataOptimizedEdgePool.getEdgeMetadata(position, edgeNumber);

    // Assert
    assertEquals(0L, actual);
  }
}






