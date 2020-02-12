package com.twitter.graphjet.bipartite.segment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask
 *
 * @author Diffblue JCover
 */

public class IdentityEdgeTypeMaskDiffblueTest {

    @Test(timeout=10000)
    public void edgeTypeNodeIsOneReturnsZero() {
        assertThat(new IdentityEdgeTypeMask().edgeType(1), is((byte)0));
    }

    @Test(timeout=10000)
    public void encode() {
        assertThat(new IdentityEdgeTypeMask().encode(1, (byte)1), is(1));
        assertThat(new IdentityEdgeTypeMask().encode(0, (byte)1), is(0));
    }

    @Test(timeout=10000)
    public void restore() {
        assertThat(new IdentityEdgeTypeMask().restore(1), is(1));
        assertThat(new IdentityEdgeTypeMask().restore(0), is(0));
    }
}
