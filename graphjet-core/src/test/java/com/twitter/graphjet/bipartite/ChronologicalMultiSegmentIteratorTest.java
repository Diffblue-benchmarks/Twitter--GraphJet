package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChronologicalMultiSegmentIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph multiSegmentBipartiteGraph = null;
    Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment>(
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<LeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);
    Int2ObjectOpenHashMap<ReusableNodeIntIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
    Integer.getInteger("aaaaa");
    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
    Integer.getInteger("aaaaa");
    LeftSegmentEdgeAccessor<LeftIndexedBipartiteGraphSegment> segmentEdgeAccessor = new LeftSegmentEdgeAccessor<LeftIndexedBipartiteGraphSegment>(
        multiSegmentReaderAccessibleInfo,
        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) int2ObjectOpenHashMap1,
        int2ObjectOpenHashMap2);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ChronologicalMultiSegmentIterator<LeftIndexedBipartiteGraphSegment>(
        (LeftIndexedMultiSegmentBipartiteGraph<LeftIndexedBipartiteGraphSegment>) multiSegmentBipartiteGraph,
        segmentEdgeAccessor);
  }
}
