package com.twitter.graphjet.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.math.IntArrayAliasTable
 *
 * @author Diffblue JCover
 */

public class IntArrayAliasTableTest {

    @Test(timeout=10000)
    public void clearAliasTableArrayAliasTableArrayIsOne() {
        int[] aliasTableArray = new int[] { 1 };
        IntArrayAliasTable.clearAliasTableArray(aliasTableArray);
        assertArrayEquals(new int[] { 0 }, aliasTableArray);
    }

    @Test(timeout=10000)
    public void generateAliasTableArrayNumEntriesIsOneReturnsAllZero() {
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, IntArrayAliasTable.generateAliasTableArray(1));
    }

    @Test(timeout=10000)
    public void getAliasTableSizeAliasTableArrayIsOneReturnsOne() {
        int[] aliasTableArray = new int[] { 1 };
        assertThat(IntArrayAliasTable.getAliasTableSize(aliasTableArray), is(1));
    }

    @Test(timeout=10000)
    public void getAliasTableSizeAliasTableArrayIsZeroReturnsZero() {
        int[] aliasTableArray = new int[] { 0 };
        assertThat(IntArrayAliasTable.getAliasTableSize(aliasTableArray), is(0));
    }

    @Test(timeout=10000)
    public void getWeightAliasTableArrayIsOneReturnsOne() {
        int[] aliasTableArray = new int[] { 1 };
        assertThat(IntArrayAliasTable.getWeight(aliasTableArray, -1), is(1));
    }

    @Test(timeout=10000)
    public void getWeightAliasTableArrayIsZeroReturnsZero() {
        int[] aliasTableArray = new int[] { 0 };
        assertThat(IntArrayAliasTable.getWeight(aliasTableArray, -1), is(0));
    }

    @Test(timeout=10000)
    public void setAliasTableSizeAliasTableArrayIsOneAndSizeIsOne() {
        int[] aliasTableArray = new int[] { 1 };
        IntArrayAliasTable.setAliasTableSize(aliasTableArray, 1);
    }

    @Test(timeout=10000)
    public void setWeightAliasTableArrayIsOneAndIndexIsMinusOneAndWeightIsOne() {
        int[] aliasTableArray = new int[] { 1 };
        IntArrayAliasTable.setWeight(aliasTableArray, -1, 1);
    }
}
