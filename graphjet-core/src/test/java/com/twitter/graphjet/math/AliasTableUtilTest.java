package com.twitter.graphjet.math;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.math.AliasTableUtil
 */

public class AliasTableUtilTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getRandomSampleFromAliasTableAliasTableArrayIsNullReturnsMinusOne() {
        Random random = new Random();
        assertEquals(-1, AliasTableUtil.getRandomSampleFromAliasTable(null, random));
    }

    @Test
    public void constructAliasTableAliasTableArrayIsEmptyThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 0 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        AliasTableUtil.constructAliasTable(aliasTableArray);
    }

    @Test
    public void getRandomSampleFromAliasTableAliasTableArrayIsEmptyThrows() {
        int[] aliasTableArray = new int[] { };
        Random random = new Random();
        // Index 0 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        AliasTableUtil.getRandomSampleFromAliasTable(aliasTableArray, random);
    }
}
