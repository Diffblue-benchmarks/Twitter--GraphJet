package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.NodeInfo
 */

public class NodeInfoTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addToWeightIncrementIsOne() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        nodeInfo.addToWeight(1.0);
        assertEquals(2, nodeInfo.getNumVisits());
        assertEquals(2.0, nodeInfo.getWeight(), 0);
    }

    @Test
    public void compareToReturnsZero() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        NodeInfo otherNodeInfo = new NodeInfo(1L, 1.0, 1);
        assertEquals(0, nodeInfo.compareTo(otherNodeInfo));
    }

    @Test
    public void constructor() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        assertEquals(1L, nodeInfo.getNodeId());
        assertEquals(1, nodeInfo.getNumVisits());
        assertNull(nodeInfo.getSocialProofs()[0]);
        assertEquals(1.0, nodeInfo.getWeight(), 0);
    }

    @Test
    public void constructorNodeMetadataIsEmpty() {
        int[][] nodeMetadata = new int[][] { };
        NodeInfo nodeInfo = new NodeInfo(1L, nodeMetadata, 1.0, 1);
        assertEquals(1L, nodeInfo.getNodeId());
        assertEquals(1, nodeInfo.getNumVisits());
        assertNull(nodeInfo.getSocialProofs()[0]);
        assertEquals(1.0, nodeInfo.getWeight(), 0);
    }

    @Test
    public void equalsObjIsEmpty() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        int[][] obj = new int[][] { };
        assertFalse(nodeInfo.equals(obj));
    }

    @Test
    public void equalsObjIsNull() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        assertFalse(nodeInfo.equals(null));
    }

    @Test
    public void getNodeMetadataReturnsEmpty() {
        int[] e0 = new int[] { };
        int[] e1 = new int[] { };
        int[][] nodeMetadata = new int[][] { e0, e1 };
        NodeInfo nodeInfo = new NodeInfo(1L, nodeMetadata, 1.0, 1);
        int[] result = nodeInfo.getNodeMetadata(1);
        assertArrayEquals(new int[] { }, result);
    }

    @Test
    public void setWeightToOne() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        nodeInfo.setWeight(1.0);
    }

    @Test
    public void testhashCode() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        assertEquals(1_072_694_240, nodeInfo.hashCode());
    }

    @Test
    public void addToSocialProofEdgeMetadataIsOneAndEdgeTypeIsOneAndSocialProofIdIsOneAndSocialProofWeightIsOneThrows() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        // Index 1 out of bounds for length 1
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        nodeInfo.addToSocialProof(1L, (byte)1, 1L, 1.0);
    }

    @Test
    public void getNodeMetadataThrows() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        // Index 1 out of bounds for length 1
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        nodeInfo.getNodeMetadata(1);
    }
}
