package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Test;

public class IntToIntPairArrayIndexBasedMapTest {
  @Test
  public void clearTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));

    // Act
    intToIntPairArrayIndexBasedMap.clear();

    // Assert
    assertEquals(0.0, (intToIntPairArrayIndexBasedMap.array).getFillPercentage(), 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumNodes = 1;
    int defaultReturnValue = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("numStoredKeys");

    // Act
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(expectedNumNodes,
        defaultReturnValue, statsReceiver);

    // Assert
    assertEquals(0.0, (intToIntPairArrayIndexBasedMap.array).getFillPercentage(), 0.0);
  }

  @Test
  public void getBothValuesTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;

    // Act
    long actual = intToIntPairArrayIndexBasedMap.getBothValues(key);

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void getFirstValueFromNodeInfoTest() {
    // Arrange
    long nodeInfo = 1L;

    // Act
    int actual = IntToIntPairArrayIndexBasedMap.getFirstValueFromNodeInfo(nodeInfo);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getFirstValueTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;

    // Act
    int actual = intToIntPairArrayIndexBasedMap.getFirstValue(key);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getSecondValueFromNodeInfoTest() {
    // Arrange
    long nodeInfo = 1L;

    // Act
    int actual = IntToIntPairArrayIndexBasedMap.getSecondValueFromNodeInfo(nodeInfo);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getSecondValueTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;

    // Act
    int actual = intToIntPairArrayIndexBasedMap.getSecondValue(key);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void incrementFirstValueTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;

    // Act
    int actual = intToIntPairArrayIndexBasedMap.incrementFirstValue(key);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void incrementSecondValueTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;
    int delta = 1;

    // Act
    int actual = intToIntPairArrayIndexBasedMap.incrementSecondValue(key, delta);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void putTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(1, 1,
        new DefaultStatsReceiver("numStoredKeys"));
    int key = 1;
    int firstValue = 1;
    int secondValue = 1;

    // Act
    boolean actual = intToIntPairArrayIndexBasedMap.put(key, firstValue, secondValue);

    // Assert
    assertFalse(actual);
    assertEquals(0.00152587890625, (intToIntPairArrayIndexBasedMap.array).getFillPercentage(), 0.0);
  }
}









