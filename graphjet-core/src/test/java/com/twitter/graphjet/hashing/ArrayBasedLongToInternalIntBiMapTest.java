package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ArrayBasedLongToInternalIntBiMapTest {
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        1, 1.0, 1, 1L, new DefaultStatsReceiver("aaaaa"));
    ArrayBasedLongToInternalIntFixedLengthBiMap[] maps = new ArrayBasedLongToInternalIntFixedLengthBiMap[]{
        arrayBasedLongToInternalIntFixedLengthBiMap, arrayBasedLongToInternalIntFixedLengthBiMap,
        new ArrayBasedLongToInternalIntFixedLengthBiMap(1, 1.0, 1, 1L, new DefaultStatsReceiver("aaaaa"))};
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[0] = 2561;
    int[] intArray1 = new int[6];
    Arrays.fill(intArray1, 1);

    // Act
    new ArrayBasedLongToInternalIntBiMap.ReaderAccessibleInfo(maps, intArray, intArray1);
  }

  @Test
  public void clearTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("0"));

    // Act
    arrayBasedLongToInternalIntBiMap.clear();
  }

  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumKeys = 0;
    double loadFactor = 1.0;
    int defaultGetReturnValue = 0;
    long defaultGetKeyReturnValue = 1L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("0");

    // Act
    new ArrayBasedLongToInternalIntBiMap(expectedNumKeys, loadFactor, defaultGetReturnValue, defaultGetKeyReturnValue,
        statsReceiver);
  }

  @Test
  public void getKeyTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("0"));
    int value = 0;

    // Act
    long actual = arrayBasedLongToInternalIntBiMap.getKey(value);

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void getTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("0"));
    long key = 1L;

    // Act
    int actual = arrayBasedLongToInternalIntBiMap.get(key);

    // Assert
    assertEquals(14, actual);
  }

  @Test
  public void putTest() {
    // Arrange
    ArrayBasedLongToInternalIntBiMap arrayBasedLongToInternalIntBiMap = new ArrayBasedLongToInternalIntBiMap(0, 1.0, 0,
        1L, new DefaultStatsReceiver("0"));
    long key = 1L;

    // Act
    int actual = arrayBasedLongToInternalIntBiMap.put(key);

    // Assert
    assertEquals(14, actual);
  }
}





