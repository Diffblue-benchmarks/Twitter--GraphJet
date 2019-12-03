package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask
 */

public class IdentityEdgeTypeMaskTest {

    @Test
    public void edgeTypeNodeIsOneReturnsZero() {
        IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
        assertEquals(0, identityEdgeTypeMask.edgeType(1));
    }

    @Test
    public void encodeEdgeTypeIsOneAndNodeIsOneReturnsOne() {
        IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
        assertEquals(1, identityEdgeTypeMask.encode(1, (byte)1));
    }

    @Test
    public void restoreNodeIsOneReturnsOne() {
        IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
        assertEquals(1, identityEdgeTypeMask.restore(1));
    }
}
