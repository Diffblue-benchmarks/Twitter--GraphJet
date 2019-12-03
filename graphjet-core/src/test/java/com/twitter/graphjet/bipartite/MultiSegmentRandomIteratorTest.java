package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.api.ReusableNodeRandomIntIterator;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiSegmentRandomIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph multiSegmentBipartiteGraph = null;
    Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<LeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap, 0, 0);
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableNodeRandomIntIterator>();
    Integer.getInteger("aaaaa");
    LeftSegmentRandomEdgeAccessor<LeftIndexedBipartiteGraphSegment> segmentEdgeRandomAccessor = new LeftSegmentRandomEdgeAccessor<LeftIndexedBipartiteGraphSegment>(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableInternalIdToLongIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new MultiSegmentRandomIterator<LeftIndexedBipartiteGraphSegment>(
        (LeftIndexedMultiSegmentBipartiteGraph<LeftIndexedBipartiteGraphSegment>) multiSegmentBipartiteGraph,
        segmentEdgeRandomAccessor);
  }
}
