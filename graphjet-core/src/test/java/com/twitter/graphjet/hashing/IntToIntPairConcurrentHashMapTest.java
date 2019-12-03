package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class IntToIntPairConcurrentHashMapTest {
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    ShardedBigIntArray array = new ShardedBigIntArray(1, 1, 1, new DefaultStatsReceiver("aaaaa"));
    int bitMask = 1;
    int maxNumKeysToStore = 11;

    // Act
    new IntToIntPairConcurrentHashMap.ReaderAccessibleInfo(array, bitMask, maxNumKeysToStore);
  }

  @Test
  public void clearTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));

    // Act
    intToIntPairConcurrentHashMap.clear();
  }

  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumNodes = 0;
    double loadFactor = 1.0;
    int defaultReturnValue = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("numStoredKeys");

    // Act
    new IntToIntPairConcurrentHashMap(expectedNumNodes, loadFactor, defaultReturnValue, statsReceiver);
  }

  @Test
  public void getBothValuesTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;

    // Act
    long actual = intToIntPairConcurrentHashMap.getBothValues(key);

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void getFirstValueTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;

    // Act
    int actual = intToIntPairConcurrentHashMap.getFirstValue(key);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getSecondValueTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;

    // Act
    int actual = intToIntPairConcurrentHashMap.getSecondValue(key);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void incrementFirstValueTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;

    // Act
    int actual = intToIntPairConcurrentHashMap.incrementFirstValue(key);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void incrementSecondValueTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;
    int delta = 0;

    // Act
    int actual = intToIntPairConcurrentHashMap.incrementSecondValue(key, delta);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void putTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(0, 1.0, 0,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 0;
    int firstValue = 0;
    int secondValue = 0;

    // Act
    boolean actual = intToIntPairConcurrentHashMap.put(key, firstValue, secondValue);

    // Assert
    assertFalse(actual);
  }
}








