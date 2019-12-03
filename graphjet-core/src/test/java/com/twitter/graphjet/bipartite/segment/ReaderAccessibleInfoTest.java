package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.ReaderAccessibleInfo
 */

public class ReaderAccessibleInfoTest {

    @Test
    public void constructorLeftNodeEdgePoolIsNullAndLeftNodesToIndexBiMapIsNullAndRightNodeEdgePoolIsNullAndRightNodesToIndexBiMapIsNull() {
        ReaderAccessibleInfo readerAccessibleInfo = new ReaderAccessibleInfo(null, null, null, null);
        assertNull(readerAccessibleInfo.getRightNodeEdgePool());
        assertNull(readerAccessibleInfo.getLeftNodeEdgePool());
        assertNull(readerAccessibleInfo.getLeftNodesToIndexBiMap());
        assertNull(readerAccessibleInfo.getRightNodesToIndexBiMap());
    }
}
