package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class AbstractPowerLawDegreeEdgePoolTest {
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"));
    AbstractRegularDegreeEdgePool[] edgePools = new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool,
        regularDegreeEdgePool, new RegularDegreeEdgePool(11, 1, new DefaultStatsReceiver("aaaaa"))};
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[2] = 2561;
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[1] = 167772161;

    // Act
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        edgePools, intArray, intArray1);

    // Assert
    AbstractRegularDegreeEdgePool[] edgePools1 = readerAccessibleInfo.getEdgePools();
    int[] nodeDegrees = readerAccessibleInfo.getNodeDegrees();
    assertEquals(3, edgePools1.length);
    assertEquals(8, readerAccessibleInfo.getPoolDegrees().length);
    assertEquals(8, nodeDegrees.length);
  }

  @Test
  public void ReaderAccessibleInfoGetEdgePoolsTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"));
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 655361;
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[1] = 11;
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool,
            new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"))},
        intArray, intArray1);

    // Act
    AbstractRegularDegreeEdgePool[] actual = readerAccessibleInfo.getEdgePools();

    // Assert
    assertEquals(3, actual.length);
  }

  @Test
  public void ReaderAccessibleInfoGetNodeDegreesTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"));
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 655361;
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[1] = 11;
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool,
            new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"))},
        intArray, intArray1);

    // Act
    int[] actual = readerAccessibleInfo.getNodeDegrees();

    // Assert
    assertEquals(8, actual.length);
  }

  @Test
  public void ReaderAccessibleInfoGetPoolDegreesTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"));
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 655361;
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[1] = 11;
    AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo readerAccessibleInfo = new AbstractPowerLawDegreeEdgePool.ReaderAccessibleInfo(
        new AbstractRegularDegreeEdgePool[]{regularDegreeEdgePool, regularDegreeEdgePool,
            new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"))},
        intArray, intArray1);

    // Act
    int[] actual = readerAccessibleInfo.getPoolDegrees();

    // Assert
    assertEquals(8, actual.length);
  }
}



