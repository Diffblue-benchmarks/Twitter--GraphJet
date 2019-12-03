package com.twitter.graphjet.math;

import java.util.Arrays;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AliasTableUtilTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructAliasTableTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);

    // Act and Assert
    thrown.expect(NegativeArraySizeException.class);
    AliasTableUtil.constructAliasTable(intArray);
  }
  @Test
  public void getRandomSampleFromAliasTableTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, -1);
    Random random = new Random();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    AliasTableUtil.getRandomSampleFromAliasTable(intArray, random);
  }
}

