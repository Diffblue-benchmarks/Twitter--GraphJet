package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RecyclePoolMemoryDiffblueTest {
  @Test(timeout=10000)
  public void recycleRegularDegreeEdgePoolTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());

    // Act
    RecyclePoolMemory.recycleRegularDegreeEdgePool(regularDegreeEdgePool);

    // Assert
    int actualResultInt = regularDegreeEdgePool.currentPositionOffset;
    assertEquals(0, regularDegreeEdgePool.currentShardId);
    assertEquals(0, regularDegreeEdgePool.currentNumNodes);
    assertEquals(0, regularDegreeEdgePool.currentNumEdgesStored);
    assertEquals(0, actualResultInt);
    assertEquals(0.0, regularDegreeEdgePool.readerAccessibleInfo.getEdges().getFillPercentage(), 0.0);
  }
}

