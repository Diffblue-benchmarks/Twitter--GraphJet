package com.twitter.graphjet.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Random;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.math.AliasTableUtil
 *
 * @author Diffblue JCover
 */

public class AliasTableUtilTest {

    @Test(timeout=10000)
    public void getRandomSampleFromAliasTableAliasTableArrayIsNullReturnsMinusOne() {
        assertThat(AliasTableUtil.getRandomSampleFromAliasTable(null, new Random(1L)), is(-1));
    }
}
