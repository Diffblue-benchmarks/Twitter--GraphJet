package com.twitter.graphjet.bipartite;

import static org.junit.Assert.assertNull;
import com.twitter.graphjet.bipartite.api.EdgeIterator;
import com.twitter.graphjet.bipartite.api.ReusableNodeRandomIntIterator;
import com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightSegmentRandomEdgeAccessorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> segmentInternalIdToLongIteratorMap = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("kaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> segmentNodeRandomIntIteratorMap = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaaa");

    // Act
    new RightSegmentRandomEdgeAccessor(readerAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) segmentInternalIdToLongIteratorMap,
        segmentNodeRandomIntIteratorMap);
  }

  @Test
  public void getDegreeInSegmentTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaak");
    RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    long node = 1L;
    int segmentId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    rightSegmentRandomEdgeAccessor.getDegreeInSegment(node, segmentId);
  }

  @Test
  public void getNodeEdgesTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaak");
    RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    int segmentId = 1;
    long node = 1L;

    // Act
    EdgeIterator actual = rightSegmentRandomEdgeAccessor.getNodeEdges(segmentId, node);

    // Assert
    assertNull(actual);
  }

  @Test
  public void getRandomNodeEdgesTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaak");
    RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    int segmentId = 1;
    long node = 1L;
    int numSamples = 1;
    Random random = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    rightSegmentRandomEdgeAccessor.getRandomNodeEdges(segmentId, node, numSamples, random);
  }

  @Test
  public void rebuildIteratorsTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaak");
    RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    int oldestSegmentId = 1;
    int liveSegmentId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    rightSegmentRandomEdgeAccessor.rebuildIterators(oldestSegmentId, liveSegmentId);
  }
}




