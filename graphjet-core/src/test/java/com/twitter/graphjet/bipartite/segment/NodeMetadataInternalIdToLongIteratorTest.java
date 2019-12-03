package com.twitter.graphjet.bipartite.segment;

import java.util.ArrayList;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.NodeMetadataInternalIdToLongIterator
 */

public class NodeMetadataInternalIdToLongIteratorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndMetadataMapIsEmptyAndNodesIndexMapIsNull() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        // pojo NodeMetadataInternalIdToLongIterator
    }

    @Test
    public void resetWithIntIteratorInputIntIteratorIsNull() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        com.twitter.graphjet.bipartite.api.EdgeIterator result = nodeMetadataInternalIdToLongIterator.resetWithIntIterator(null);
        assertTrue(result instanceof NodeMetadataInternalIdToLongIterator);
        assertSame(nodeMetadataInternalIdToLongIterator, ((NodeMetadataInternalIdToLongIterator)result));
    }

    @Test
    public void currentEdgeTypeThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.currentEdgeType();
    }

    @Test
    public void currentMetadataThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.currentMetadata();
    }

    @Test
    public void getLeftNodeMetadataNodeMetadataTypeIsOneThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        // The getLeftNodeMetadata operation is currently not supported
        thrown.expect(UnsupportedOperationException.class);
        nodeMetadataInternalIdToLongIterator.getLeftNodeMetadata((byte)1);
    }

    @Test
    public void getRightNodeMetadataNodeMetadataTypeIsOneThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        // Index 1 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        nodeMetadataInternalIdToLongIterator.getRightNodeMetadata((byte)1);
    }

    @Test
    public void hasNextThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.hasNext();
    }

    @Test
    public void nextThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.next();
    }

    @Test
    public void removeThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.remove();
    }

    @Test
    public void skipIIsOneThrows() {
        ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap> metadataMap = new ArrayList<com.twitter.graphjet.hashing.IntToIntArrayMap>();
        NodeMetadataInternalIdToLongIterator nodeMetadataInternalIdToLongIterator = new NodeMetadataInternalIdToLongIterator(null, metadataMap, null);
        thrown.expect(NullPointerException.class);
        nodeMetadataInternalIdToLongIterator.skip(1);
    }
}
