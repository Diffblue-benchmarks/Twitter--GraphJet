package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import com.twitter.graphjet.bipartite.segment.RightNodeMetadataLeftIndexedBipartiteGraphSegment;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RightNodeMetadataMultiSegmentIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph multiSegmentBipartiteGraph = null;
    Int2ObjectOpenHashMap<RightNodeMetadataLeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<RightNodeMetadataLeftIndexedBipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<RightNodeMetadataLeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<RightNodeMetadataLeftIndexedBipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<RightNodeMetadataLeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap,
        -1, -1);
    Int2ObjectOpenHashMap<ReusableNodeIntIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    LeftSegmentEdgeAccessor<RightNodeMetadataLeftIndexedBipartiteGraphSegment> segmentEdgeAccessor = new LeftSegmentEdgeAccessor<RightNodeMetadataLeftIndexedBipartiteGraphSegment>(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new RightNodeMetadataMultiSegmentIterator(
        (LeftIndexedMultiSegmentBipartiteGraph<RightNodeMetadataLeftIndexedBipartiteGraphSegment>) multiSegmentBipartiteGraph,
        segmentEdgeAccessor);
  }
}
