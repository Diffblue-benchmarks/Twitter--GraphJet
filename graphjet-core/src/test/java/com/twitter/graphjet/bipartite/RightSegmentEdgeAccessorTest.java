package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.api.EdgeIterator;
import com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator;
import com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightSegmentEdgeAccessorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableNodeIntIterator> segmentNodeIntIteratorMap = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
    Integer.getInteger("kaaaa");
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> segmentInternalIdToLongIteratorMap = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("kaaaa");

    // Act
    new RightSegmentEdgeAccessor(readerAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) segmentNodeIntIteratorMap,
        segmentInternalIdToLongIteratorMap);
  }

  @Test
  public void getNodeEdgesTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableNodeIntIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    RightSegmentEdgeAccessor rightSegmentEdgeAccessor = new RightSegmentEdgeAccessor(multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    int segmentId = 1;
    long node = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    rightSegmentEdgeAccessor.getNodeEdges(segmentId, node);
  }

  @Test
  public void rebuildIteratorsTest() {
    // Arrange
    Int2ObjectOpenHashMap<BipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<BipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<BipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<BipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableNodeIntIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    RightSegmentEdgeAccessor rightSegmentEdgeAccessor = new RightSegmentEdgeAccessor(multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);
    int oldestSegmentId = 1;
    int liveSegmentId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    rightSegmentEdgeAccessor.rebuildIterators(oldestSegmentId, liveSegmentId);
  }
}

