package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ReaderAccessibleInfoProviderTest {
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = -1;
    int expectedNumRightNodes = -1;
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("left");
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, -1, defaultStatsReceiver);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, -1);
    OptimizedEdgePool optimizedEdgePool1 = new OptimizedEdgePool(intArray1, -1, new DefaultStatsReceiver("left"));

    // Act
    ReaderAccessibleInfoProvider readerAccessibleInfoProvider = new ReaderAccessibleInfoProvider(expectedNumLeftNodes,
        expectedNumRightNodes, optimizedEdgePool, optimizedEdgePool1, defaultStatsReceiver);

    // Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = readerAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    ReaderAccessibleInfo readerAccessibleInfo = readerAccessibleInfoProvider.getReaderAccessibleInfo();
    assertTrue(leftIndexedReaderAccessibleInfo instanceof ReaderAccessibleInfo);
    EdgePool rightNodeEdgePool = readerAccessibleInfo.getRightNodeEdgePool();
    EdgePool leftNodeEdgePool = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    assertTrue(readerAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertSame(optimizedEdgePool, leftNodeEdgePool);
    assertSame(optimizedEdgePool1, rightNodeEdgePool);
  }

  @Test
  public void getLeftIndexedReaderAccessibleInfoTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("left");
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, -1, defaultStatsReceiver);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, -1);
    ReaderAccessibleInfoProvider readerAccessibleInfoProvider = new ReaderAccessibleInfoProvider(-1, -1,
        optimizedEdgePool, new OptimizedEdgePool(intArray1, -1, new DefaultStatsReceiver("left")),
        defaultStatsReceiver);

    // Act
    LeftIndexedReaderAccessibleInfo actual = readerAccessibleInfoProvider.getLeftIndexedReaderAccessibleInfo();

    // Assert
    assertTrue(actual instanceof ReaderAccessibleInfo);
  }

  @Test
  public void getReaderAccessibleInfoTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("left");
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, -1, defaultStatsReceiver);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, -1);
    ReaderAccessibleInfoProvider readerAccessibleInfoProvider = new ReaderAccessibleInfoProvider(-1, -1,
        optimizedEdgePool, new OptimizedEdgePool(intArray1, -1, new DefaultStatsReceiver("left")),
        defaultStatsReceiver);

    // Act
    readerAccessibleInfoProvider.getReaderAccessibleInfo();
  }

  @Test
  public void updateReaderAccessibleInfoEdgePoolTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("left");
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, -1, defaultStatsReceiver);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, -1);
    OptimizedEdgePool optimizedEdgePool1 = new OptimizedEdgePool(intArray1, -1, new DefaultStatsReceiver("left"));
    ReaderAccessibleInfoProvider readerAccessibleInfoProvider = new ReaderAccessibleInfoProvider(-1, -1,
        optimizedEdgePool, optimizedEdgePool1, defaultStatsReceiver);

    // Act
    readerAccessibleInfoProvider.updateReaderAccessibleInfoEdgePool(optimizedEdgePool, optimizedEdgePool1);

    // Assert
    LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = readerAccessibleInfoProvider
        .getLeftIndexedReaderAccessibleInfo();
    ReaderAccessibleInfo readerAccessibleInfo = readerAccessibleInfoProvider.getReaderAccessibleInfo();
    assertTrue(leftIndexedReaderAccessibleInfo instanceof ReaderAccessibleInfo);
    EdgePool rightNodeEdgePool = readerAccessibleInfo.getRightNodeEdgePool();
    EdgePool leftNodeEdgePool = readerAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = readerAccessibleInfo.getRightNodesToIndexBiMap();
    assertTrue(readerAccessibleInfo
        .getLeftNodesToIndexBiMap() instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertTrue(rightNodesToIndexBiMap instanceof com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap);
    assertSame(optimizedEdgePool, leftNodeEdgePool);
    assertSame(optimizedEdgePool1, rightNodeEdgePool);
  }
}



