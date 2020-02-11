package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.IntToIntArrayMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.List;
import org.junit.Test;

public class NodeMetadataLeftIndexedReaderAccessibleInfoDiffblueTest {
  @Test(timeout=10000)
  public void getRightNodesToMetadataMapTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertNull((new NodeMetadataLeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()), null)).getRightNodesToMetadataMap());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act
    NodeMetadataLeftIndexedReaderAccessibleInfo actualNodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1, regularDegreeEdgePool, null);

    // Assert
    List<IntToIntArrayMap> actualRightNodesToMetadataMap = actualNodeMetadataLeftIndexedReaderAccessibleInfo
        .getRightNodesToMetadataMap();
    EdgePool actualLeftNodeEdgePool = actualNodeMetadataLeftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap actualRightNodesToIndexBiMap = actualNodeMetadataLeftIndexedReaderAccessibleInfo
        .getRightNodesToIndexBiMap();
    assertNull(actualRightNodesToMetadataMap);
    assertSame(arrayBasedLongToInternalIntBiMap,
        actualNodeMetadataLeftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap());
    assertSame(arrayBasedLongToInternalIntBiMap1, actualRightNodesToIndexBiMap);
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
  }
}

