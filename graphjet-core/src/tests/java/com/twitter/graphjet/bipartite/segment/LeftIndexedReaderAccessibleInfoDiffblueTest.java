package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class LeftIndexedReaderAccessibleInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act
    LeftIndexedReaderAccessibleInfo actualLeftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1, regularDegreeEdgePool);

    // Assert
    EdgePool actualLeftNodeEdgePool = actualLeftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap actualRightNodesToIndexBiMap = actualLeftIndexedReaderAccessibleInfo
        .getRightNodesToIndexBiMap();
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
    assertSame(arrayBasedLongToInternalIntBiMap, actualLeftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap());
    assertSame(arrayBasedLongToInternalIntBiMap1, actualRightNodesToIndexBiMap);
  }

  @Test(timeout=10000)
  public void getLeftNodesToIndexBiMapTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertSame(arrayBasedLongToInternalIntBiMap, (new LeftIndexedReaderAccessibleInfo(arrayBasedLongToInternalIntBiMap,
        rightNodesToIndexBiMap, new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).getLeftNodesToIndexBiMap());
  }

  @Test(timeout=10000)
  public void addRightNodeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals(14, (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).addRightNode(1L));
  }

  @Test(timeout=10000)
  public void getIndexForLeftNodeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals(42, (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).getIndexForLeftNode(1L));
  }

  @Test(timeout=10000)
  public void getRightNodesToIndexBiMapTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());

    // Act and Assert
    assertSame(arrayBasedLongToInternalIntBiMap,
        (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, arrayBasedLongToInternalIntBiMap,
            new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).getRightNodesToIndexBiMap());
  }

  @Test(timeout=10000)
  public void getLeftNodeEdgePoolTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act and Assert
    assertSame(regularDegreeEdgePool,
        (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap, regularDegreeEdgePool))
            .getLeftNodeEdgePool());
  }

  @Test(timeout=10000)
  public void addLeftNodeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals(14, (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).addLeftNode(1L));
  }

  @Test(timeout=10000)
  public void getIndexForRightNodeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals(42, (new LeftIndexedReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()))).getIndexForRightNode(1L));
  }
}

