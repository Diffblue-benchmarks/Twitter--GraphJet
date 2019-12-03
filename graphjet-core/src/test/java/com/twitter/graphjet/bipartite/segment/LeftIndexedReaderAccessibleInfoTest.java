package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.LeftIndexedReaderAccessibleInfo
 */

public class LeftIndexedReaderAccessibleInfoTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorLeftNodeEdgePoolIsNullAndLeftNodesToIndexBiMapIsNullAndRightNodesToIndexBiMapIsNull() {
        LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(null, null, null);
        assertNull(leftIndexedReaderAccessibleInfo.getLeftNodeEdgePool());
        assertNull(leftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap());
        assertNull(leftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap());
    }

    @Test
    public void addLeftNodeNodeIsOneThrows() {
        LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(null, null, null);
        thrown.expect(NullPointerException.class);
        leftIndexedReaderAccessibleInfo.addLeftNode(1L);
    }

    @Test
    public void addRightNodeNodeIsOneThrows() {
        LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(null, null, null);
        thrown.expect(NullPointerException.class);
        leftIndexedReaderAccessibleInfo.addRightNode(1L);
    }

    @Test
    public void getIndexForLeftNodeNodeIsOneThrows() {
        LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(null, null, null);
        thrown.expect(NullPointerException.class);
        leftIndexedReaderAccessibleInfo.getIndexForLeftNode(1L);
    }

    @Test
    public void getIndexForRightNodeNodeIsOneThrows() {
        LeftIndexedReaderAccessibleInfo leftIndexedReaderAccessibleInfo = new LeftIndexedReaderAccessibleInfo(null, null, null);
        thrown.expect(NullPointerException.class);
        leftIndexedReaderAccessibleInfo.getIndexForRightNode(1L);
    }
}
