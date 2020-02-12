package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.RegularDegreeEdgePool;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class LeftIndexedReaderAccessibleInfoProviderDiffblueTest {
  @Test(timeout=10000)
  public void getLeftIndexedReaderAccessibleInfoTest() {
    // Arrange, Act and Assert
    assertNull((new LeftIndexedReaderAccessibleInfoProvider()).getLeftIndexedReaderAccessibleInfo());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertNull((new LeftIndexedReaderAccessibleInfoProvider()).getLeftIndexedReaderAccessibleInfo());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act and Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = (new LeftIndexedReaderAccessibleInfoProvider(10,
        10, regularDegreeEdgePool, new NullStatsReceiver())).getLeftIndexedReaderAccessibleInfo();
    EdgePool actualLeftNodeEdgePool = leftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = leftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap();
    assertSame(regularDegreeEdgePool, actualLeftNodeEdgePool);
    assertTrue(leftIndexedReaderAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
  }
}

