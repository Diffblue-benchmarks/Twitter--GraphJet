package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.NodeInfo
 *
 * @author Diffblue JCover
 */

public class NodeInfoTest {

    @Test(timeout=10000)
    public void addToSocialProofEdgeMetadataIsOneAndEdgeTypeIsZeroAndSocialProofIdIsZeroAndSocialProofWeightIsOneReturnsTrue() {
        NodeInfo nodeInfo = new NodeInfo(-1L, 1.0, 1);
        assertThat(nodeInfo.addToSocialProof(0L, (byte)0, 1L, 1.0), is(true));
        // pojo com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap
    }

    @Test(timeout=10000)
    public void addToWeightIncrementIsOne() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        nodeInfo.addToWeight(1.0);
        assertThat(nodeInfo.getNumVisits(), is(2));
        assertEquals(2.0, nodeInfo.getWeight(), 0);
    }

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new NodeInfo(0L, Double.NaN, 0).compareTo(new NodeInfo(1L, 1.0, 1)), is(1));
        assertThat(new NodeInfo(0L, 1.0, 0).compareTo(new NodeInfo(1L, 1.0, 1)), is(0));
    }

    @Test(timeout=10000)
    public void getNodeId() {
        assertThat(new NodeInfo(1L, 1.0, 1).getNodeId(), is(1L));
        assertThat(new NodeInfo(0L, 1.0, 1).getNodeId(), is(0L));
    }

    @Test(timeout=10000)
    public void getNodeMetadataNodeMetadataTypeIsZeroReturnsZero() {
        assertArrayEquals(new int[] { 0 }, new NodeInfo(1L, 1.0, 1).getNodeMetadata(0));
    }

    @Test(timeout=10000)
    public void getNumVisitsReturnsOne() {
        assertThat(new NodeInfo(1L, 1.0, 1).getNumVisits(), is(1));
    }

    @Test(timeout=10000)
    public void getSocialProofsReturnsNull() {
        assertThat(new NodeInfo(1L, 1.0, 1).getSocialProofs()[0], is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWeightReturnsOne() {
        assertEquals(1.0, new NodeInfo(1L, 1.0, 1).getWeight(), 0);
    }

    @Test(timeout=10000)
    public void setWeightToOne() {
        new NodeInfo(1L, 1.0, 1).setWeight(1.0);
    }

    @Test(timeout=10000)
    public void testequals1() {
        int[] element = new int[] { 0 };
        int[][] nodeMetadata = new int[][] { element };
        assertThat(new NodeInfo(1L, nodeMetadata, 1.0, 1).equals(new Object()), is(false));
    }

    @Test(timeout=10000)
    public void testequals2() {
        assertThat(new NodeInfo(1L, 1.0, 1).equals("foo"), is(false));
        assertThat(new NodeInfo(1L, 1.0, 1).equals(null), is(false));
    }
}
