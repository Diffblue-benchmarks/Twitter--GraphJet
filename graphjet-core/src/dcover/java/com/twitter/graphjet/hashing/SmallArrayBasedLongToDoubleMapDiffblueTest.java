package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SmallArrayBasedLongToDoubleMapDiffblueTest {
  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SmallArrayBasedLongToDoubleMap()).size());
  }

  @Test(timeout=10000)
  public void keysTest() {
    // Arrange, Act and Assert
    assertEquals(4, (new SmallArrayBasedLongToDoubleMap()).keys().length);
  }

  @Test(timeout=10000)
  public void trimTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(smallArrayBasedLongToDoubleMap.trim(1));
    long[] metadataResult = smallArrayBasedLongToDoubleMap.metadata();
    long[] keysResult = smallArrayBasedLongToDoubleMap.keys();
    assertEquals(0, metadataResult.length);
    assertEquals(0, smallArrayBasedLongToDoubleMap.size());
    assertEquals(0, keysResult.length);
  }

  @Test(timeout=10000)
  public void valuesTest() {
    // Arrange, Act and Assert
    assertEquals(4, (new SmallArrayBasedLongToDoubleMap()).values().length);
  }

  @Test(timeout=10000)
  public void metadataTest() {
    // Arrange, Act and Assert
    assertEquals(4, (new SmallArrayBasedLongToDoubleMap()).metadata().length);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SmallArrayBasedLongToDoubleMap actualSmallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Assert
    long[] metadataResult = actualSmallArrayBasedLongToDoubleMap.metadata();
    long[] keysResult = actualSmallArrayBasedLongToDoubleMap.keys();
    assertEquals(4, metadataResult.length);
    assertEquals(0, actualSmallArrayBasedLongToDoubleMap.size());
    assertEquals(4, keysResult.length);
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(smallArrayBasedLongToDoubleMap.put(1L, 10.0, 1L));
    assertEquals(1, smallArrayBasedLongToDoubleMap.size());
  }

  @Test(timeout=10000)
  public void uniqueKeysSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SmallArrayBasedLongToDoubleMap()).uniqueKeysSize());
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertFalse((new SmallArrayBasedLongToDoubleMap()).contains(1L));
  }
}

