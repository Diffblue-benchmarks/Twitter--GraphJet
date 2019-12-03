package com.twitter.graphjet.math;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.math.IntArrayAliasTable
 */

public class IntArrayAliasTableTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void clearAliasTableArrayAliasTableArrayIsEmpty() {
        int[] aliasTableArray = new int[] { };
        IntArrayAliasTable.clearAliasTableArray(aliasTableArray);
    }

    @Test
    public void generateAliasTableArrayNumEntriesIsOneReturnsAllZero() {
        int[] result = IntArrayAliasTable.generateAliasTableArray(1);
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, result);
    }

    @Test
    public void getAliasTableAverageWeightAliasTableArrayIsEmptyThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 1 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.getAliasTableAverageWeight(aliasTableArray);
    }

    @Test
    public void getAliasTableSizeAliasTableArrayIsEmptyThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 0 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.getAliasTableSize(aliasTableArray);
    }

    @Test
    public void getEntryAliasTableArrayIsEmptyAndIndexIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 5 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.getEntry(aliasTableArray, 1);
    }

    @Test
    public void getNextEntryAliasTableArrayIsEmptyAndIndexIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 7 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.getNextEntry(aliasTableArray, 1);
    }

    @Test
    public void getWeightAliasTableArrayIsEmptyAndIndexIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 6 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.getWeight(aliasTableArray, 1);
    }

    @Test
    public void setAliasTableAverageWeightAliasTableArrayIsEmptyAndAverageWeightIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 1 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.setAliasTableAverageWeight(aliasTableArray, 1);
    }

    @Test
    public void setAliasTableSizeAliasTableArrayIsEmptyAndSizeIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 0 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.setAliasTableSize(aliasTableArray, 1);
    }

    @Test
    public void setEntryAliasTableArrayIsEmptyAndEntryIsOneAndIndexIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 5 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.setEntry(aliasTableArray, 1, 1);
    }

    @Test
    public void setNextEntryAliasTableArrayIsEmptyAndIndexIsOneAndNextEntryIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 7 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.setNextEntry(aliasTableArray, 1, 1);
    }

    @Test
    public void setWeightAliasTableArrayIsEmptyAndIndexIsOneAndWeightIsOneThrows() {
        int[] aliasTableArray = new int[] { };
        // Index 6 out of bounds for length 0
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        IntArrayAliasTable.setWeight(aliasTableArray, 1, 1);
    }
}
