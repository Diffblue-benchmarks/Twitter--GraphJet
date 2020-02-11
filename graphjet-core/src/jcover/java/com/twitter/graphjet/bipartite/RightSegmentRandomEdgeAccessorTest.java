package com.twitter.graphjet.bipartite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.RightSegmentRandomEdgeAccessor
 *
 * @author Diffblue JCover
 */

public class RightSegmentRandomEdgeAccessorTest {

    @Test(timeout=10000)
    public void getNodeEdgesNodeIsOneAndSegmentIdIsOneReturnsNull() {
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> segments = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator> segmentInternalIdToLongIteratorMap = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.api.ReusableNodeRandomIntIterator> segmentNodeRandomIntIteratorMap = mock(Int2ObjectMap.class);
        assertThat(new RightSegmentRandomEdgeAccessor(new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(segments, 1, 1), segmentInternalIdToLongIteratorMap, segmentNodeRandomIntIteratorMap).getNodeEdges(1, 1L), is(nullValue()));
    }

    @Test(timeout=10000)
    public void rebuildIteratorsLiveSegmentIdIsZeroAndOldestSegmentIdIsOne() {
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> segments = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.ReusableInternalIdToLongIterator> segmentInternalIdToLongIteratorMap = mock(Int2ObjectMap.class);
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.api.ReusableNodeRandomIntIterator> segmentNodeRandomIntIteratorMap = mock(Int2ObjectMap.class);
        new RightSegmentRandomEdgeAccessor(new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(segments, 1, 1), segmentInternalIdToLongIteratorMap, segmentNodeRandomIntIteratorMap).rebuildIterators(1, 0);
    }
}
