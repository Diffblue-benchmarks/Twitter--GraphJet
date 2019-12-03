package com.twitter.graphjet.bipartite.segment;

import java.util.ArrayList;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.NodeMetadataLeftIndexedReaderAccessibleInfo
 */

public class NodeMetadataLeftIndexedReaderAccessibleInfoTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorLeftNodeEdgePoolIsNullAndLeftNodesToIndexBiMapIsNullAndRightNodesToIndexBiMapIsNullAndRightNodesToMetadataMapIsEmpty() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> rightNodesToMetadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataLeftIndexedReaderAccessibleInfo nodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(null, null, null, rightNodesToMetadataMap);
        assertSame(rightNodesToMetadataMap, (ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>)nodeMetadataLeftIndexedReaderAccessibleInfo.getRightNodesToMetadataMap());
        assertNull(nodeMetadataLeftIndexedReaderAccessibleInfo.getLeftNodeEdgePool());
        assertNull(nodeMetadataLeftIndexedReaderAccessibleInfo.getLeftNodesToIndexBiMap());
        assertNull(nodeMetadataLeftIndexedReaderAccessibleInfo.getRightNodesToIndexBiMap());
    }

    @Test
    public void getRightNodesToMetadataMapNodeMetadataTypeIsOneThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> rightNodesToMetadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataLeftIndexedReaderAccessibleInfo nodeMetadataLeftIndexedReaderAccessibleInfo = new NodeMetadataLeftIndexedReaderAccessibleInfo(null, null, null, rightNodesToMetadataMap);
        // Index 1 out of bounds for length 0
        thrown.expect(IndexOutOfBoundsException.class);
        nodeMetadataLeftIndexedReaderAccessibleInfo.getRightNodesToMetadataMap(1);
    }
}
