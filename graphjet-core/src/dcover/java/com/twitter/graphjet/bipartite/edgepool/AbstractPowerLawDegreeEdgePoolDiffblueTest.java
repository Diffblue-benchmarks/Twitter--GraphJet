package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class AbstractPowerLawDegreeEdgePoolDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);

    // Act
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo actualReaderAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool1,
            new RegularDegreeEdgePool(10, 3, new NullStatsReceiver())},
        intArray, intArray1);

    // Assert
    AbstractRegularDegreeEdgePool[] edgePools = actualReaderAccessibleInfo.getEdgePools();
    int[] nodeDegrees = actualReaderAccessibleInfo.getNodeDegrees();
    assertEquals(3, edgePools.length);
    assertEquals(8, actualReaderAccessibleInfo.getPoolDegrees().length);
    assertEquals(8, nodeDegrees.length);
  }

  @Test(timeout=10000)
  public void getPoolDegreesTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool1,
            new RegularDegreeEdgePool(10, 3, new NullStatsReceiver())},
        intArray, intArray1);

    // Act
    int[] actualPoolDegrees = readerAccessibleInfo.getPoolDegrees();

    // Assert
    assertSame(readerAccessibleInfo.poolDegrees, actualPoolDegrees);
    assertEquals(8, actualPoolDegrees.length);
  }

  @Test(timeout=10000)
  public void getNodeDegreesTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool1,
            new RegularDegreeEdgePool(10, 3, new NullStatsReceiver())},
        intArray, intArray1);

    // Act
    int[] actualNodeDegrees = readerAccessibleInfo.getNodeDegrees();

    // Assert
    assertSame(readerAccessibleInfo.nodeDegrees, actualNodeDegrees);
    assertEquals(8, actualNodeDegrees.length);
  }

  @Test(timeout=10000)
  public void getEdgePoolsTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    RegularDegreeEdgePool regularDegreeEdgePool1 = new RegularDegreeEdgePool(10, 3, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool1,
            new RegularDegreeEdgePool(10, 3, new NullStatsReceiver())},
        intArray, intArray1);

    // Act
    AbstractRegularDegreeEdgePool[] actualEdgePools = readerAccessibleInfo.getEdgePools();

    // Assert
    assertSame(readerAccessibleInfo.edgePools, actualEdgePools);
    assertEquals(3, actualEdgePools.length);
  }
}

