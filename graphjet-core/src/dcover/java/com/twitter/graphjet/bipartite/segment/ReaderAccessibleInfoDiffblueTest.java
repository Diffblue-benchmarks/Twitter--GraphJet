package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class ReaderAccessibleInfoDiffblueTest {
  @Test(timeout=10000)
  public void getRightNodeEdgePoolTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    ArrayBasedLongToInternalIntBiMap leftNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        nullStatsReceiver);
    ArrayBasedLongToInternalIntBiMap rightNodesToIndexBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());
    RegularDegreeEdgePool leftNodeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, nullStatsReceiver);

    // Act and Assert
    assertSame(regularDegreeEdgePool, (new ReaderAccessibleInfo(leftNodesToIndexBiMap, rightNodesToIndexBiMap,
        leftNodeEdgePool, regularDegreeEdgePool)).getRightNodeEdgePool());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, nullStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(10, 10.0,
        42, 42L, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, nullStatsReceiver);

    // Act
    ReaderAccessibleInfo actualReaderAccessibleInfo = new ReaderAccessibleInfo(arrayBasedLongToInternalIntBiMap,
        arrayBasedLongToInternalIntBiMap1, regularDegreeEdgePool, regularDegreeEdgePool1);

    // Assert
    EdgePool actualRightNodeEdgePool = actualReaderAccessibleInfo.getRightNodeEdgePool();
    EdgePool actualLeftNodeEdgePool = actualReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap actualRightNodesToIndexBiMap = actualReaderAccessibleInfo.getRightNodesToIndexBiMap();
    assertSame(regularDegreeEdgePool1, actualRightNodeEdgePool);
    assertSame(arrayBasedLongToInternalIntBiMap, actualReaderAccessibleInfo.getLeftNodesToIndexBiMap());
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
    assertSame(arrayBasedLongToInternalIntBiMap1, actualRightNodesToIndexBiMap);
  }
}

