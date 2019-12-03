package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedIntToIntArrayMap;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.IntToIntArrayMap;
import com.twitter.graphjet.hashing.LongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeMetadataLeftIndexedReaderAccessibleInfoTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    OptimizedEdgePool leftNodeEdgePool = null;
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(new ArrayBasedIntToIntArrayMap(1, 1, defaultStatsReceiver));

    // Act
    NodeMetadataLeftIndexedReaderAccessibleInfo nodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap, leftNodeEdgePool,
        (List<IntToIntArrayMap>) arrayList);

    // Assert
    List<IntToIntArrayMap> rightNodesToMetadataMap = nodeMetadataLeftIndexedReaderAccessibleInfo
        .getRightNodesToMetadataMap();
    EdgePool leftNodeEdgePool1 = nodeMetadataLeftIndexedReaderAccessibleInfo.getLeftNodeEdgePool();
    LongToInternalIntBiMap rightNodesToIndexBiMap = nodeMetadataLeftIndexedReaderAccessibleInfo
        .getRightNodesToIndexBiMap();
    LongToInternalIntBiMap leftNodesToIndexBiMap = nodeMetadataLeftIndexedReaderAccessibleInfo
        .getLeftNodesToIndexBiMap();
    assertSame(arrayList, rightNodesToMetadataMap);
    assertSame(arrayBasedLongToInternalIntBiMap, leftNodesToIndexBiMap);
    assertNull(leftNodeEdgePool1);
    assertSame(leftNodesToIndexBiMap, rightNodesToIndexBiMap);
  }

  @Test
  public void getRightNodesToMetadataMapTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 1, defaultStatsReceiver);
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>(1);
    ((ArrayList<IntToIntArrayMap>) arrayList).add(new ArrayBasedIntToIntArrayMap(1, 1, defaultStatsReceiver));
    NodeMetadataLeftIndexedReaderAccessibleInfo nodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1, optimizedEdgePool,
        (List<IntToIntArrayMap>) arrayList);

    // Act
    List<IntToIntArrayMap> actual = nodeMetadataLeftIndexedReaderAccessibleInfo.getRightNodesToMetadataMap();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getRightNodesToMetadataMapTest2() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap1 = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
        1L, defaultStatsReceiver);
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[1] = 167772161;
    OptimizedEdgePool optimizedEdgePool = new OptimizedEdgePool(intArray, 1, defaultStatsReceiver);
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>(1);
    ((ArrayList<IntToIntArrayMap>) arrayList).add(new ArrayBasedIntToIntArrayMap(1, 1, defaultStatsReceiver));
    NodeMetadataLeftIndexedReaderAccessibleInfo nodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(
        arrayBasedLongToInternalIntBiMap, arrayBasedLongToInternalIntBiMap1, optimizedEdgePool,
        (java.util.List<IntToIntArrayMap>) arrayList);
    int nodeMetadataType = 1;

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    nodeMetadataLeftIndexedReaderAccessibleInfo.getRightNodesToMetadataMap(nodeMetadataType);
  }
}


