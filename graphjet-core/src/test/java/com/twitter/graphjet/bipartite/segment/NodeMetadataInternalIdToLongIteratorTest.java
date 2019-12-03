package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.bipartite.api.EdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedIntToIntArrayMap;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.hashing.IntToIntArrayMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeMetadataInternalIdToLongIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap nodesIndexMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0, 1L,
        new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    new NodeMetadataInternalIdToLongIterator(nodesIndexMap, (java.util.List<IntToIntArrayMap>) arrayList, edgeTypeMask);
  }

  @Test
  public void currentEdgeTypeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act
    byte actual = nodeMetadataInternalIdToLongIterator.currentEdgeType();

    // Assert
    assertEquals((byte) 0, actual);
  }

  @Test
  public void currentMetadataTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.currentMetadata();
  }

  @Test
  public void getLeftNodeMetadataTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());
    byte nodeMetadataType = (byte) 0;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    nodeMetadataInternalIdToLongIterator.getLeftNodeMetadata(nodeMetadataType);
  }

  @Test
  public void getRightNodeMetadataTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());
    byte nodeMetadataType = (byte) 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.getRightNodeMetadata(nodeMetadataType);
  }

  @Test
  public void hasNextTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.hasNext();
  }

  @Test
  public void nextLongTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.nextLong();
  }

  @Test
  public void nextTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.next();
  }

  @Test
  public void removeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.remove();
  }

  @Test
  public void resetWithIntIteratorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());
    OptimizedEdgeIterator inputIntIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, defaultStatsReceiver));

    // Act
    EdgeIterator actual = nodeMetadataInternalIdToLongIterator.resetWithIntIterator(inputIntIterator);

    // Assert
    Long nextResult = actual.next();
    assertEquals(Long.valueOf(1L), nextResult);
    assertFalse(actual.hasNext());
  }

  @Test
  public void skipTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    ArrayList<IntToIntArrayMap> arrayList = new ArrayList<IntToIntArrayMap>();
    ((ArrayList<IntToIntArrayMap>) arrayList).add(null);
    NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(
        arrayBasedLongToInternalIntBiMap, (java.util.List<IntToIntArrayMap>) arrayList, new IdentityEdgeTypeMask());
    int i = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeMetadataInternalIdToLongIterator.skip(i);
  }
}










