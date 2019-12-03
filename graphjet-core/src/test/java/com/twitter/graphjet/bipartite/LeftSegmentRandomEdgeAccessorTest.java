package com.twitter.graphjet.bipartite;

import java.util.Random;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.LeftSegmentRandomEdgeAccessor
 */

public class LeftSegmentRandomEdgeAccessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

//failed_compile @Test
//    public void constructorSegmentInternalIdToLongIteratorMapIsNullAndSegmentNodeRandomIntIteratorMapIsNull() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentRandomEdgeAccessor<String> leftSegmentRandomEdgeAccessor = new LeftSegmentRandomEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        // pojo LeftSegmentRandomEdgeAccessor<String>
//    }

//failed_compile @Test
//    public void getNodeEdgesNodeIsOneAndSegmentIdIsOneReturnsNull() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentRandomEdgeAccessor<String> leftSegmentRandomEdgeAccessor = new LeftSegmentRandomEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        assertNull(leftSegmentRandomEdgeAccessor.getNodeEdges(1, 1L));
//    }

//failed_compile @Test
//    public void getDegreeInSegmentNodeIsOneAndSegmentIdIsOneThrows() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentRandomEdgeAccessor<String> leftSegmentRandomEdgeAccessor = new LeftSegmentRandomEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        thrown.expect(NullPointerException.class);
//        leftSegmentRandomEdgeAccessor.getDegreeInSegment(1L, 1);
//    }

//failed_compile @Test
//    public void getRandomNodeEdgesNodeIsOneAndNumSamplesIsOneAndSegmentIdIsOneThrows() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentRandomEdgeAccessor<String> leftSegmentRandomEdgeAccessor = new LeftSegmentRandomEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        Random random = new Random();
//        thrown.expect(NullPointerException.class);
//        leftSegmentRandomEdgeAccessor.getRandomNodeEdges(1, 1L, 1, random);
//    }

//failed_compile @Test
//    public void rebuildIteratorsLiveSegmentIdIsOneAndOldestSegmentIdIsOneThrows() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentRandomEdgeAccessor<String> leftSegmentRandomEdgeAccessor = new LeftSegmentRandomEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        thrown.expect(NullPointerException.class);
//        leftSegmentRandomEdgeAccessor.rebuildIterators(1, 1);
//    }
}
