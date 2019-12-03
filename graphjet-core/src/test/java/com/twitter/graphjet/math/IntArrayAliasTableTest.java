package com.twitter.graphjet.math;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntArrayAliasTableTest {
  @Test
  public void clearAliasTableArrayTest() {
    // Arrange
    int[] aliasTableArray = new int[8];

    // Act
    IntArrayAliasTable.clearAliasTableArray(aliasTableArray);
  }

  @Test
  public void generateAliasTableArrayTest() {
    // Arrange
    int numEntries = 0;

    // Act
    int[] actual = IntArrayAliasTable.generateAliasTableArray(numEntries);

    // Assert
    assertEquals(2, actual.length);
  }

  @Test
  public void getAliasTableAverageWeightTest() {
    // Arrange
    int[] aliasTableArray = new int[8];

    // Act
    int actual = IntArrayAliasTable.getAliasTableAverageWeight(aliasTableArray);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getAliasTableSizeTest() {
    // Arrange
    int[] aliasTableArray = new int[8];

    // Act
    int actual = IntArrayAliasTable.getAliasTableSize(aliasTableArray);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getEntryTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;

    // Act
    int actual = IntArrayAliasTable.getEntry(aliasTableArray, index);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNextEntryTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;

    // Act
    int actual = IntArrayAliasTable.getNextEntry(aliasTableArray, index);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getWeightTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;

    // Act
    int actual = IntArrayAliasTable.getWeight(aliasTableArray, index);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void setAliasTableAverageWeightTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int averageWeight = 0;

    // Act
    IntArrayAliasTable.setAliasTableAverageWeight(aliasTableArray, averageWeight);
  }

  @Test
  public void setAliasTableSizeTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int size = 0;

    // Act
    IntArrayAliasTable.setAliasTableSize(aliasTableArray, size);
  }

  @Test
  public void setEntryTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;
    int entry = 0;

    // Act
    IntArrayAliasTable.setEntry(aliasTableArray, index, entry);
  }

  @Test
  public void setNextEntryTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;
    int nextEntry = 0;

    // Act
    IntArrayAliasTable.setNextEntry(aliasTableArray, index, nextEntry);
  }

  @Test
  public void setWeightTest() {
    // Arrange
    int[] aliasTableArray = new int[8];
    int index = 0;
    int weight = 0;

    // Act
    IntArrayAliasTable.setWeight(aliasTableArray, index, weight);
  }
}











