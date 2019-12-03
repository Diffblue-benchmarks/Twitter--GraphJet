package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SmallArrayBasedLongToDoubleMapTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Assert
    long[] metadataResult = smallArrayBasedLongToDoubleMap.metadata();
    long[] keysResult = smallArrayBasedLongToDoubleMap.keys();
    assertEquals(4, metadataResult.length);
    assertEquals(0, smallArrayBasedLongToDoubleMap.size());
    assertEquals(4, keysResult.length);
  }

  @Test
  public void containsTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    long key = 1L;

    // Act
    boolean actual = smallArrayBasedLongToDoubleMap.contains(key);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void keysTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    long[] actual = smallArrayBasedLongToDoubleMap.keys();

    // Assert
    assertEquals(4, actual.length);
  }

  @Test
  public void metadataTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    long[] actual = smallArrayBasedLongToDoubleMap.metadata();

    // Assert
    assertEquals(4, actual.length);
  }

  @Test
  public void putTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    long key = 1L;
    double value = 1.0;
    long metadata = 1L;

    // Act
    boolean actual = smallArrayBasedLongToDoubleMap.put(key, value, metadata);

    // Assert
    assertTrue(actual);
    assertEquals(1, smallArrayBasedLongToDoubleMap.size());
  }

  @Test
  public void sizeTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    int actual = smallArrayBasedLongToDoubleMap.size();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void sortTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    smallArrayBasedLongToDoubleMap.sort();
  }

  @Test
  public void trimTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    int inputCapacity = 0;

    // Act
    boolean actual = smallArrayBasedLongToDoubleMap.trim(inputCapacity);

    // Assert
    assertTrue(actual);
    long[] metadataResult = smallArrayBasedLongToDoubleMap.metadata();
    long[] keysResult = smallArrayBasedLongToDoubleMap.keys();
    assertEquals(0, metadataResult.length);
    assertEquals(0, smallArrayBasedLongToDoubleMap.size());
    assertEquals(0, keysResult.length);
  }

  @Test
  public void uniqueKeysSizeTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    int actual = smallArrayBasedLongToDoubleMap.uniqueKeysSize();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void valuesTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act
    double[] actual = smallArrayBasedLongToDoubleMap.values();

    // Assert
    assertEquals(4, actual.length);
  }
}









