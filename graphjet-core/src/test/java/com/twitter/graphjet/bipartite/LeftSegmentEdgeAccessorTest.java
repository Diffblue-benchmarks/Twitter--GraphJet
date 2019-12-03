package com.twitter.graphjet.bipartite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.LeftSegmentEdgeAccessor
 */

public class LeftSegmentEdgeAccessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

//failed_compile @Test
//    public void constructorSegmentInternalIdToLongIteratorMapIsNullAndSegmentNodeIntIteratorMapIsNull() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentEdgeAccessor<String> leftSegmentEdgeAccessor = new LeftSegmentEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        // pojo LeftSegmentEdgeAccessor<String>
//    }

//failed_compile @Test
//    public void getNodeEdgesNodeIsOneAndSegmentIdIsOneThrows() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentEdgeAccessor<String> leftSegmentEdgeAccessor = new LeftSegmentEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        thrown.expect(NullPointerException.class);
//        leftSegmentEdgeAccessor.getNodeEdges(1, 1L);
//    }

//failed_compile @Test
//    public void rebuildIteratorsLiveSegmentIdIsOneAndOldestSegmentIdIsOneThrows() {
//        MultiSegmentReaderAccessibleInfo<String> readerAccessibleInfo = new MultiSegmentReaderAccessibleInfo<String>(null, 1, 1);
//        LeftSegmentEdgeAccessor<String> leftSegmentEdgeAccessor = new LeftSegmentEdgeAccessor<String>(readerAccessibleInfo, null, null);
//        thrown.expect(NullPointerException.class);
//        leftSegmentEdgeAccessor.rebuildIterators(1, 1);
//    }
}
