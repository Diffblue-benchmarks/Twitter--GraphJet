package com.twitter.graphjet.bipartite.edgepool;

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

public class WithEdgeMetadataRegularDegreeEdgePoolTest {
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
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
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
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
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
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
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
    WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo withEdgeMetadataReaderAccessibleInfo = new WithEdgeMetadataRegularDegreeEdgePool.WithEdgeMetadataReaderAccessibleInfo(
        shardedBigIntArray, shardedBigLongArray, intToIntPairArrayIndexBasedMap);

    // Act
    IntToIntPairHashMap actual = withEdgeMetadataReaderAccessibleInfo.getNodeInfo();

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
    new WithEdgeMetadataRegularDegreeEdgePool(expectedNumNodes, maxDegree, statsReceiver);
  }
}




