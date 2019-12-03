package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.hashing.BigIntArray;
import com.twitter.graphjet.hashing.BigLongArray;
import com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap;
import com.twitter.graphjet.hashing.IntToIntPairHashMap;
import com.twitter.graphjet.hashing.ShardedBigIntArray;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptimizedEdgePoolTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray edges = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(11, 1,
        defaultStatsReceiver);

    // Act
    OptimizedEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(edges,
        intToIntPairArrayIndexBasedMap);

    // Assert
    assertSame(intToIntPairArrayIndexBasedMap, readerAccessibleInfo.getNodeInfo());
  }

  @Test
  public void ReaderAccessibleInfoGetEdgesTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    OptimizedEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(
        shardedBigIntArray, new IntToIntPairArrayIndexBasedMap(1, 1, defaultStatsReceiver));

    // Act
    BigIntArray actual = readerAccessibleInfo.getEdges();

    // Assert
    assertSame(shardedBigIntArray, actual);
  }

  @Test
  public void ReaderAccessibleInfoGetMetadataTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    OptimizedEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(
        shardedBigIntArray, new IntToIntPairArrayIndexBasedMap(1, 1, defaultStatsReceiver));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    readerAccessibleInfo.getMetadata();
  }

  @Test
  public void ReaderAccessibleInfoGetNodeInfoTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        defaultStatsReceiver);
    OptimizedEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new OptimizedEdgePool.ReaderAccessibleInfo(
        shardedBigIntArray, intToIntPairArrayIndexBasedMap);

    // Act
    IntToIntPairHashMap actual = readerAccessibleInfo.getNodeInfo();

    // Assert
    assertSame(intToIntPairArrayIndexBasedMap, actual);
  }

  @Test
  public void addEdgesTest() {
    // Arrange
    int[] intArray = new int[8];
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 0, new DefaultStatsReceiver("aaaka"));
    int node = 0;
    int pool = 0;
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);
    longArray[5] = 2561L;
    int srcPos = 0;
    int length = 0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    optimizedEdgePool.addEdges(node, pool, intArray, longArray, srcPos, length);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int[] nodeDegrees = new int[8];
    int maxNumEdges = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(nodeDegrees, maxNumEdges, statsReceiver);

    // Assert
    assertEquals(Double.NaN, optimizedEdgePool.getFillPercentage(), 0.0);
  }

  @Test
  public void getEdgeMetadataTest() {
    // Arrange
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(new int[8], 0, new DefaultStatsReceiver("aaaka"));
    int position = 0;
    int edgeNumber = 0;

    // Act
    long actual = optimizedEdgePool.getEdgeMetadata(position, edgeNumber);

    // Assert
    assertEquals(0L, actual);
  }
}






