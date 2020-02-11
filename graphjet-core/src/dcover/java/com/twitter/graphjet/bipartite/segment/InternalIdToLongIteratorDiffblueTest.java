package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.api.EdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class InternalIdToLongIteratorDiffblueTest {
  @Test(timeout=10000)
  public void currentEdgeTypeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap nodesIndexMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        new NullStatsReceiver());

    // Act and Assert
    assertEquals((byte) 0, (new InternalIdToLongIterator(nodesIndexMap, new IdentityEdgeTypeMask())).currentEdgeType());
  }

  @Test(timeout=10000)
  public void resetWithIntIteratorTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    ArrayBasedLongToInternalIntBiMap nodesIndexMap = new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L,
        nullStatsReceiver);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(nodesIndexMap,
        new IdentityEdgeTypeMask());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    EdgeIterator actualResetWithIntIteratorResult = internalIdToLongIterator
        .resetWithIntIterator(new OptimizedEdgeIterator(new OptimizedEdgePool(intArray, 3, nullStatsReceiver)));

    // Assert
    assertSame(internalIdToLongIterator, actualResetWithIntIteratorResult);
    assertFalse(actualResetWithIntIteratorResult.hasNext());
  }
}

