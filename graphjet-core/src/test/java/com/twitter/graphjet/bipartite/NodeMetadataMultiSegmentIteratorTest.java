package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator;
import com.twitter.graphjet.bipartite.segment.NodeMetadataLeftIndexedBipartiteGraphSegment;
import com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator;
import com.twitter.graphjet.hashing.ArrayBasedLongToInternalIntBiMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeMetadataMultiSegmentIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
//failed_compile @Test
//  public void constructorTest() {
//    // Arrange
//    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
//    RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph multiSegmentBipartiteGraph = null;
//    Int2ObjectOpenHashMap<NodeMetadataLeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<NodeMetadataLeftIndexedBipartiteGraphSegment>();
//    Integer.getInteger("aaaaa");
//    MultiSegmentReaderAccessibleInfo<NodeMetadataLeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<NodeMetadataLeftIndexedBipartiteGraphSegment>(
//        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<NodeMetadataLeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap,
//        1, 1);
//    Int2ObjectOpenHashMap<ReusableNodeIntIterator> int2ObjectOpenHashMap1 = new Int2ObjectOpenHashMap<ReusableNodeIntIterator>();
//    Integer.getInteger("aaaaaaaaaaaaaaa");
//    Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator> int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap<ReusableInternalIdToLongIterator>();
//    Integer.getInteger("aaaaa");
//    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(1, 1.0, 1,
//        1L, defaultStatsReceiver);
//    arrayBasedLongToInternalIntBiMap.put(1L);
//    arrayBasedLongToInternalIntBiMap.put(1L);
//    LeftSegmentEdgeAccessor<NodeMetadataLeftIndexedBipartiteGraphSegment> segmentEdgeAccessor = new LeftSegmentEdgeAccessor<NodeMetadataLeftIndexedBipartiteGraphSegment>(
//        multiSegmentReaderAccessibleInfo,
//        (it.unimi.dsi.fastutil.ints.Int2ObjectMap<ReusableNodeIntIterator>) int2ObjectOpenHashMap1,
//        int2ObjectOpenHashMap2);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    new NodeMetadataMultiSegmentIterator(
//        (LeftIndexedMultiSegmentBipartiteGraph<NodeMetadataLeftIndexedBipartiteGraphSegment>) multiSegmentBipartiteGraph,
//        segmentEdgeAccessor);
//  }
}
