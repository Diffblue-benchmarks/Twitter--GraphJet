package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class IntToIntPairArrayIndexBasedMapDiffblueTest {
  @Test(timeout=10000)
  public void incrementSecondValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).incrementSecondValue(1, 2));
  }

  @Test(timeout=10000)
  public void getFirstValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).getFirstValue(1));
  }

  @Test(timeout=10000)
  public void getBothValuesTest() {
    // Arrange, Act and Assert
    assertEquals(42L, (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).getBothValues(1));
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(10, 42,
        new NullStatsReceiver());

    // Act and Assert
    assertFalse(intToIntPairArrayIndexBasedMap.put(1, 42, 42));
    assertEquals(0.00152587890625, intToIntPairArrayIndexBasedMap.array.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void clearTest() {
    // Arrange
    IntToIntPairArrayIndexBasedMap intToIntPairArrayIndexBasedMap = new IntToIntPairArrayIndexBasedMap(10, 42,
        new NullStatsReceiver());

    // Act
    intToIntPairArrayIndexBasedMap.clear();

    // Assert
    assertEquals(0.0, intToIntPairArrayIndexBasedMap.array.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void incrementFirstValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).incrementFirstValue(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    BigIntArray bigIntArray = (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).array;
    assertTrue(bigIntArray instanceof ShardedBigIntArray);
    assertEquals(0.0, bigIntArray.getFillPercentage(), 0.0);
    assertEquals(1, ((ShardedBigIntArray) bigIntArray).readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void getFirstValueFromNodeInfoTest() {
    // Arrange, Act and Assert
    assertEquals(0, IntToIntPairArrayIndexBasedMap.getFirstValueFromNodeInfo(1L));
  }

  @Test(timeout=10000)
  public void getSecondValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver())).getSecondValue(1));
  }

  @Test(timeout=10000)
  public void getSecondValueFromNodeInfoTest() {
    // Arrange, Act and Assert
    assertEquals(1, IntToIntPairArrayIndexBasedMap.getSecondValueFromNodeInfo(1L));
  }
}

