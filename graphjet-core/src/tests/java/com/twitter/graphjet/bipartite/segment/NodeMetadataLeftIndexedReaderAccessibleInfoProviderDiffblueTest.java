package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class NodeMetadataLeftIndexedReaderAccessibleInfoProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act
    NodeMetadataLeftIndexedReaderAccessibleInfoProvider actualNodeMetadataLeftIndexedReaderAccessibleInfoProvider = new NodeMetadataLeftIndexedReaderAccessibleInfoProvider(
        10, 10, 10, regularDegreeEdgePool, new NullStatsReceiver());

    // Assert
    NodeMetadataLeftIndexedReaderAccessibleInfo readerAccessibleInfo = actualNodeMetadataLeftIndexedReaderAccessibleInfoProvider
        .getReaderAccessibleInfo();
    LeftIndexedReaderAccessibleInfo actualLeftIndexedReaderAccessibleInfo = actualNodeMetadataLeftIndexedReaderAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    EdgePool actualLeftNodeEdgePool = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    assertSame(readerAccessibleInfo, actualLeftIndexedReaderAccessibleInfo);
    assertTrue(readerAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
  }

  @Test(timeout=10000)
  public void getLeftIndexedReaderAccessibleInfoTest() {
    // Arrange
    RegularDegreeEdgePool leftNodeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act and Assert
    assertTrue(
        (new NodeMetadataLeftIndexedReaderAccessibleInfoProvider(10, 10, 10, leftNodeEdgePool, new NullStatsReceiver()))
            .getLeftIndexedReaderAccessibleInfo() instanceof NodeMetadataLeftIndexedReaderAccessibleInfo);
  }
}

