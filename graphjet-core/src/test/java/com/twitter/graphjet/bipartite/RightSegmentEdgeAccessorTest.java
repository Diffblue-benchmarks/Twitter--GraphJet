package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.RightSegmentEdgeAccessor
 */

public class RightSegmentEdgeAccessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorSegmentInternalIdToLongIteratorMapIsNullAndSegmentNodeIntIteratorMapIsNull() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentEdgeAccessor rightSegmentEdgeAccessor = new RightSegmentEdgeAccessor(readerAccessibleInfo, null, null);
        // pojo RightSegmentEdgeAccessor
    }

    @Test
    public void getNodeEdgesNodeIsOneAndSegmentIdIsOneThrows() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentEdgeAccessor rightSegmentEdgeAccessor = new RightSegmentEdgeAccessor(readerAccessibleInfo, null, null);
        thrown.expect(NullPointerException.class);
        rightSegmentEdgeAccessor.getNodeEdges(1, 1L);
    }

    @Test
    public void rebuildIteratorsLiveSegmentIdIsOneAndOldestSegmentIdIsOneThrows() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentEdgeAccessor rightSegmentEdgeAccessor = new RightSegmentEdgeAccessor(readerAccessibleInfo, null, null);
        thrown.expect(NullPointerException.class);
        rightSegmentEdgeAccessor.rebuildIterators(1, 1);
    }
}
