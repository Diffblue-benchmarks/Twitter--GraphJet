package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.NodeInfoHelper
 */

public class NodeInfoHelperTest {

    @Test
    public void nodeInfoHasValidSocialProofsReturnsFalse() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        assertFalse(NodeInfoHelper.nodeInfoHasValidSocialProofs(nodeInfo));
    }

    @Test
    public void removeUnfavoritedSocialProofsReturnsFalse() {
        NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 1);
        assertFalse(NodeInfoHelper.removeUnfavoritedSocialProofs(nodeInfo));
    }
}
