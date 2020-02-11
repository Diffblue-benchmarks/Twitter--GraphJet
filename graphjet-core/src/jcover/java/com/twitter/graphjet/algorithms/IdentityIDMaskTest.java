package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.IdentityIDMask
 *
 * @author Diffblue JCover
 */

public class IdentityIDMaskTest {

    @Test(timeout=10000)
    public void restore() {
        assertThat(new IdentityIDMask().restore(1L), is(1L));
        assertThat(new IdentityIDMask().restore(0L), is(0L));
    }
}
