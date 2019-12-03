package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.bipartite.api.EdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InternalIdToLongIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap nodesIndexMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0, 1L,
        new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    new InternalIdToLongIterator(nodesIndexMap, edgeTypeMask);
  }
  @Test
  public void currentEdgeTypeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act
    byte actual = internalIdToLongIterator.currentEdgeType();

    // Assert
    assertEquals((byte) 0, actual);
  }
  @Test
  public void currentMetadataTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.currentMetadata();
  }
  @Test
  public void hasNextTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.hasNext();
  }
  @Test
  public void nextLongTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.nextLong();
  }
  @Test
  public void nextTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.next();
  }
  @Test
  public void removeTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("aaaaa"));
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.remove();
  }
  @Test
  public void resetWithIntIteratorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, defaultStatsReceiver);
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);
    OptimizedEdgeIterator inputIntIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(new int[8], 0, defaultStatsReceiver));

    // Act
    EdgeIterator actual = internalIdToLongIterator.resetWithIntIterator(inputIntIterator);

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
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    identityEdgeTypeMask.edgeType(0);
    identityEdgeTypeMask.edgeType(0);
    InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(arrayBasedLongToInternalIntBiMap,
        identityEdgeTypeMask);
    int i = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    internalIdToLongIterator.skip(i);
  }
}








