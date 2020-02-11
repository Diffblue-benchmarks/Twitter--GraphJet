package com.twitter.graphjet.bipartite;

import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.RightSegmentEdgeAccessor
 *
 * @author Diffblue JCover
 */

public class RightSegmentEdgeAccessorTest {

    @Test(timeout=10000)
    public void rebuildIteratorsLiveSegmentIdIsZeroAndOldestSegmentIdIsOne() {
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> segments = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator> segmentNodeIntIteratorMap = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator> segmentInternalIdToLongIteratorMap = mock(Int2ObjectMap.class);
        new RightSegmentEdgeAccessor(new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(segments, 1, 1), segmentNodeIntIteratorMap, segmentInternalIdToLongIteratorMap).rebuildIterators(1, 0);
    }
}
