package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class ReaderAccessibleInfoProviderDiffblueTest {
  @Test(timeout=10000)
  public void getLeftIndexedReaderAccessibleInfoTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    RegularDegreeEdgePool leftNodeEdgePool = new RegularDegreeEdgePool(10, 3, nullStatsReceiver);

    // Act and Assert
    assertTrue((new ReaderAccessibleInfoProvider(10, 10, leftNodeEdgePool,
        new RegularDegreeEdgePool(10, 3, new NullStatsReceiver()), nullStatsReceiver))
            .getLeftIndexedReaderAccessibleInfo() instanceof ReaderAccessibleInfo);
  }

  @Test(timeout=10000)
  public void updateReaderAccessibleInfoEdgePoolTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, nullStatsReceiver);
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    ReaderAccessibleInfoProvider readerAccessibleInfoProvider = new ReaderAccessibleInfoProvider(10, 10,
        regularDegreeEdgePool, regularDegreeEdgePool1, nullStatsReceiver);

    // Act
    readerAccessibleInfoProvider.updateReaderAccessibleInfoEdgePool(regularDegreeEdgePool, regularDegreeEdgePool1);

    // Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = readerAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    ReaderAccessibleInfo readerAccessibleInfo = readerAccessibleInfoProvider.getReaderAccessibleInfo();
    assertTrue(leftIndexedReaderAccessibleInfo instanceof ReaderAccessibleInfo);
    EdgePool actualRightNodeEdgePool = readerAccessibleInfo.getRightNodeEdgePool();
    EdgePool actualLeftNodeEdgePool = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    assertTrue(readerAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
    assertSame(regularDegreeEdgePool1, actualRightNodeEdgePool);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, nullStatsReceiver);
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act
    ReaderAccessibleInfoProvider actualReaderAccessibleInfoProvider = new ReaderAccessibleInfoProvider(10, 10,
        regularDegreeEdgePool, regularDegreeEdgePool1, nullStatsReceiver);

    // Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = actualReaderAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    ReaderAccessibleInfo readerAccessibleInfo = actualReaderAccessibleInfoProvider.getReaderAccessibleInfo();
    assertTrue(leftIndexedReaderAccessibleInfo instanceof ReaderAccessibleInfo);
    EdgePool actualRightNodeEdgePool = readerAccessibleInfo.getRightNodeEdgePool();
    EdgePool actualLeftNodeEdgePool = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    assertTrue(readerAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
    assertSame(regularDegreeEdgePool1, actualRightNodeEdgePool);
  }
}

