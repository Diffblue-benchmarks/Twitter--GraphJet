package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LeftIndexedReaderAccessibleInfoProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange and Act
    new LeftIndexedReaderAccessibleInfoProvider();
  }

  @Test
  public void constructorTest2() {
    // Arrange
    int expectedNumLeftNodes = -1;
    int expectedNumRightNodes = -1;
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, -1, new DefaultStatsReceiver("left"));
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("left");

    // Act
    LeftIndexedReaderAccessibleInfoProvider leftIndexedReaderAccessibleInfoProvider = new LeftIndexedReaderAccessibleInfoProvider(
        expectedNumLeftNodes, expectedNumRightNodes, optimizedEdgePool, statsReceiver);

    // Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = leftIndexedReaderAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    EdgePool leftNodeEdgePool = leftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = leftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap();
    assertSame(optimizedEdgePool, leftNodeEdgePool);
    assertTrue(leftIndexedReaderAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
  }

  @Test
  public void getLeftIndexedReaderAccessibleInfoTest() {
    // Arrange
    LeftIndexedReaderAccessibleInfoProvider leftIndexedReaderAccessibleInfoProvider = new LeftIndexedReaderAccessibleInfoProvider();

    // Act
    LeftIndexedReaderAccessibleInfo actual = leftIndexedReaderAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();

    // Assert
    assertNull(actual);
  }

  @Test
  public void updateReaderAccessibleInfoLeftNodeEdgePoolTest() {
    // Arrange
    LeftIndexedReaderAccessibleInfoProvider leftIndexedReaderAccessibleInfoProvider = new LeftIndexedReaderAccessibleInfoProvider();
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    OptimizedEdgePool newLeftNodeEdgePool = new OptimizedEdgePool(intArray, -1, new DefaultStatsReceiver("left"));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    leftIndexedReaderAccessibleInfoProvider.updateReaderAccessibleInfoLeftNodeEdgePool(newLeftNodeEdgePool);
  }
}



