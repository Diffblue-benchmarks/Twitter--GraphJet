package com.twitter.graphjet.bipartite;

import java.util.Random;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.RightSegmentRandomEdgeAccessor
 */

public class RightSegmentRandomEdgeAccessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorSegmentInternalIdToLongIteratorMapIsNullAndSegmentNodeRandomIntIteratorMapIsNull() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(readerAccessibleInfo, null, null);
        // pojo RightSegmentRandomEdgeAccessor
    }

    @Test
    public void getNodeEdgesNodeIsOneAndSegmentIdIsOneReturnsNull() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(readerAccessibleInfo, null, null);
        assertNull(rightSegmentRandomEdgeAccessor.getNodeEdges(1, 1L));
    }

    @Test
    public void getDegreeInSegmentNodeIsOneAndSegmentIdIsOneThrows() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(readerAccessibleInfo, null, null);
        thrown.expect(NullPointerException.class);
        rightSegmentRandomEdgeAccessor.getDegreeInSegment(1L, 1);
    }

    @Test
    public void getRandomNodeEdgesNodeIsOneAndNumSamplesIsOneAndSegmentIdIsOneThrows() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(readerAccessibleInfo, null, null);
        Random random = new Random();
        thrown.expect(NullPointerException.class);
        rightSegmentRandomEdgeAccessor.getRandomNodeEdges(1, 1L, 1, random);
    }

    @Test
    public void rebuildIteratorsLiveSegmentIdIsOneAndOldestSegmentIdIsOneThrows() {
        MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.BipartiteGraphSegment>(null, 1, 1);
        RightSegmentRandomEdgeAccessor rightSegmentRandomEdgeAccessor = new RightSegmentRandomEdgeAccessor(readerAccessibleInfo, null, null);
        thrown.expect(NullPointerException.class);
        rightSegmentRandomEdgeAccessor.rebuildIterators(1, 1);
    }
}
