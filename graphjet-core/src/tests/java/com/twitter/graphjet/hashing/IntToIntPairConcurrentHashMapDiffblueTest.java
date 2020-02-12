package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class IntToIntPairConcurrentHashMapDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    IntToIntPairConcurrentHashMap.ReaderAccessibleInfo actualReaderAccessibleInfo = new IntToIntPairConcurrentHashMap.ReaderAccessibleInfo(
        shardedBigIntArray, 1, 3);

    // Assert
    assertEquals(3, actualReaderAccessibleInfo.maxNumKeysToStore);
    assertEquals(1, actualReaderAccessibleInfo.bitMask);
    assertSame(shardedBigIntArray, actualReaderAccessibleInfo.array);
  }

  @Test(timeout=10000)
  public void incrementSecondValueTest() {
    // Arrange, Act and Assert
    assertEquals(42,
        (new IntToIntPairConcurrentHashMap(10, 10.0, 42, new NullStatsReceiver())).incrementSecondValue(1, 2));
  }

  @Test(timeout=10000)
  public void getFirstValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairConcurrentHashMap(10, 10.0, 42, new NullStatsReceiver())).getFirstValue(1));
  }

  @Test(timeout=10000)
  public void getBothValuesTest() {
    // Arrange, Act and Assert
    assertEquals(42L, (new IntToIntPairConcurrentHashMap(10, 10.0, 42, new NullStatsReceiver())).getBothValues(1));
  }

  @Test(timeout=10000)
  public void putTest2() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(10, Double.NaN, 42,
        new NullStatsReceiver());

    // Act and Assert
    assertFalse(intToIntPairConcurrentHashMap.put(1, 42, 42));
    IntToIntPairConcurrentHashMap.ReaderAccessibleInfo readerAccessibleInfo = intToIntPairConcurrentHashMap.readerAccessibleInfo;
    BigIntArray bigIntArray = readerAccessibleInfo.array;
    assertEquals(0, readerAccessibleInfo.maxNumKeysToStore);
    assertEquals(15, readerAccessibleInfo.bitMask);
    assertTrue(bigIntArray instanceof ShardedBigIntArray);
    assertEquals(0.002288818359375, bigIntArray.getFillPercentage(), 0.0);
    assertEquals(1, ((ShardedBigIntArray) bigIntArray).readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(10, 10.0, 42,
        new NullStatsReceiver());

    // Act and Assert
    assertFalse(intToIntPairConcurrentHashMap.put(1, 42, 42));
    assertEquals(0.002288818359375, intToIntPairConcurrentHashMap.readerAccessibleInfo.array.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void clearTest() {
    // Arrange
    IntToIntPairConcurrentHashMap intToIntPairConcurrentHashMap = new IntToIntPairConcurrentHashMap(10, 10.0, 42,
        new NullStatsReceiver());

    // Act
    intToIntPairConcurrentHashMap.clear();

    // Assert
    assertEquals(0.0, intToIntPairConcurrentHashMap.readerAccessibleInfo.array.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void incrementFirstValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairConcurrentHashMap(10, 10.0, 42, new NullStatsReceiver())).incrementFirstValue(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    IntToIntPairConcurrentHashMap.ReaderAccessibleInfo readerAccessibleInfo = (new IntToIntPairConcurrentHashMap(10,
        10.0, 42, new NullStatsReceiver())).readerAccessibleInfo;
    BigIntArray bigIntArray = readerAccessibleInfo.array;
    assertEquals(80, readerAccessibleInfo.maxNumKeysToStore);
    assertEquals(7, readerAccessibleInfo.bitMask);
    assertTrue(bigIntArray instanceof ShardedBigIntArray);
    assertEquals(0.0, bigIntArray.getFillPercentage(), 0.0);
    assertEquals(1, ((ShardedBigIntArray) bigIntArray).readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void getSecondValueTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new IntToIntPairConcurrentHashMap(10, 10.0, 42, new NullStatsReceiver())).getSecondValue(1));
  }
}

