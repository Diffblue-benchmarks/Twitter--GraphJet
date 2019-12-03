package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.hashing.BigIntArray;
import com.twitter.graphjet.hashing.BigLongArray;
import com.twitter.graphjet.hashing.IntToIntPairArrayIndexBasedMap;
import com.twitter.graphjet.hashing.IntToIntPairHashMap;
import com.twitter.graphjet.hashing.ShardedBigIntArray;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegularDegreeEdgePoolTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(11, 1,
        defaultStatsReceiver);

    // Act
    RegularDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new RegularDegreeEdgePool.ReaderAccessibleInfo(
        shardedBigIntArray, intToIntPairArrayIndexBasedMap);

    // Assert
    BigIntArray edges = readerAccessibleInfo.getEdges();
    assertSame(shardedBigIntArray, edges);
    assertSame(intToIntPairArrayIndexBasedMap, readerAccessibleInfo.getNodeInfo());
  }

  @Test
  public void ReaderAccessibleInfoGetEdgesTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    RegularDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new RegularDegreeEdgePool.ReaderAccessibleInfo(
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
    RegularDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new RegularDegreeEdgePool.ReaderAccessibleInfo(
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
    RegularDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new RegularDegreeEdgePool.ReaderAccessibleInfo(
        shardedBigIntArray, intToIntPairArrayIndexBasedMap);

    // Act
    IntToIntPairHashMap actual = readerAccessibleInfo.getNodeInfo();

    // Assert
    assertSame(intToIntPairArrayIndexBasedMap, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumNodes = -1;
    int maxDegree = -1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new RegularDegreeEdgePool(expectedNumNodes, maxDegree, statsReceiver);
  }
}




