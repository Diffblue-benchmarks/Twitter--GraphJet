package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class ArrayBasedLongToInternalIntFixedLengthBiMapTest {
  @Test
  public void clearTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));

    // Act
    arrayBasedLongToInternalIntFixedLengthBiMap.clear();
  }

  @Test
  public void constructorTest() {
    // Arrange
    int capacity = 0;
    double loadFactor = 1.0;
    int defaultGetReturnValue = 0;
    long defaultGetKeyReturnValue = 0L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("numStoredKeys");

    // Act
    new ArrayBasedLongToInternalIntFixedLengthBiMap(capacity, loadFactor, defaultGetReturnValue,
        defaultGetKeyReturnValue, statsReceiver);
  }

  @Test
  public void getBackingArrayLengthTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));

    // Act
    int actual = arrayBasedLongToInternalIntFixedLengthBiMap.getBackingArrayLength();

    // Assert
    assertEquals(16, actual);
  }

  @Test
  public void getKeyTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));
    int value = 0;

    // Act
    long actual = arrayBasedLongToInternalIntFixedLengthBiMap.getKey(value);

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void getNumStoredKeysTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));

    // Act
    int actual = arrayBasedLongToInternalIntFixedLengthBiMap.getNumStoredKeys();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));
    long key = 0L;

    // Act
    int actual = arrayBasedLongToInternalIntFixedLengthBiMap.get(key);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void isAtCapacityTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));

    // Act
    boolean actual = arrayBasedLongToInternalIntFixedLengthBiMap.isAtCapacity();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void putTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        0, 1.0, 0, 0L, new DefaultStatsReceiver("numStoredKeys"));
    long key = 0L;

    // Act
    int actual = arrayBasedLongToInternalIntFixedLengthBiMap.put(key);

    // Assert
    assertEquals(0, actual);
  }
}







