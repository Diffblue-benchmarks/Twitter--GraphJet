package com.twitter.graphjet.math;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class IntArrayAliasTableDiffblueTest {
  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(1, IntArrayAliasTable.getWeight(intArray, 1));
  }

  @Test(timeout=10000)
  public void getAliasTableSizeTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(1, IntArrayAliasTable.getAliasTableSize(intArray));
  }

  @Test(timeout=10000)
  public void generateAliasTableArrayTest() {
    // Arrange and Act
    int[] actualGenerateAliasTableArrayResult = IntArrayAliasTable.generateAliasTableArray(10);

    // Assert
    assertEquals(32, actualGenerateAliasTableArrayResult.length);
    assertEquals(0, actualGenerateAliasTableArrayResult[0]);
    assertEquals(0, actualGenerateAliasTableArrayResult[1]);
    assertEquals(0, actualGenerateAliasTableArrayResult[2]);
    assertEquals(0, actualGenerateAliasTableArrayResult[3]);
    assertEquals(0, actualGenerateAliasTableArrayResult[4]);
    assertEquals(0, actualGenerateAliasTableArrayResult[5]);
    assertEquals(0, actualGenerateAliasTableArrayResult[26]);
    assertEquals(0, actualGenerateAliasTableArrayResult[27]);
    assertEquals(0, actualGenerateAliasTableArrayResult[28]);
    assertEquals(0, actualGenerateAliasTableArrayResult[29]);
    assertEquals(0, actualGenerateAliasTableArrayResult[30]);
    assertEquals(0, actualGenerateAliasTableArrayResult[31]);
  }

  @Test(timeout=10000)
  public void getNextEntryTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(1, IntArrayAliasTable.getNextEntry(intArray, 1));
  }

  @Test(timeout=10000)
  public void getEntryTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(1, IntArrayAliasTable.getEntry(intArray, 1));
  }

  @Test(timeout=10000)
  public void getAliasTableAverageWeightTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertEquals(1, IntArrayAliasTable.getAliasTableAverageWeight(intArray));
  }
}

