package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.NodeInfoHelper
 *
 * @author Diffblue JCover
 */

public class NodeInfoHelperTest {

    @Test(timeout=10000)
    public void nodeInfoHasValidSocialProofsReturnsFalse() {
        assertThat(NodeInfoHelper.nodeInfoHasValidSocialProofs(new NodeInfo(1L, 1.0, 1)), is(false));
    }

    @Test(timeout=10000)
    public void removeUnfavoritedSocialProofs() {
        assertThat(NodeInfoHelper.removeUnfavoritedSocialProofs(new NodeInfo(1L, 1.0, 1)), is(false));
        assertThat(NodeInfoHelper.removeUnfavoritedSocialProofs(new NodeInfo(1L, 1.0, 9)), is(false));
    }
}
