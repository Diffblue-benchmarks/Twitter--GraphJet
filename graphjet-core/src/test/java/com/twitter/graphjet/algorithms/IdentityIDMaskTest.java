package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.IdentityIDMask
 */

public class IdentityIDMaskTest {

    @Test
    public void restoreNodeIsOneReturnsOne() {
        IdentityIDMask identityIDMask = new IdentityIDMask();
        assertEquals(1L, identityIDMask.restore(1L));
    }
}
