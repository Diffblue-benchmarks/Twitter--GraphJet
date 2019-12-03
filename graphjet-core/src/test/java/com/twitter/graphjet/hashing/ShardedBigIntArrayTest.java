package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ShardedBigIntArrayTest {
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[6] = 167772161;
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[6] = 2561;
    int[] intArray2 = new int[8];
    Arrays.fill(intArray2, 1);
    intArray2[5] = 167772161;
    int[][] array = new int[][]{intArray, intArray1, intArray2};

    // Act
    new ShardedBigIntArray.ReaderAccessibleInfo(array);
  }

  @Test
  public void addEntryTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int entry = 0;
    int position = 0;

    // Act
    shardedBigIntArray.addEntry(entry, position);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test
  public void arrayCopyTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int[] src = new int[8];
    int srcPos = 0;
    int desPos = 0;
    int length = 0;
    boolean updateStats = true;

    // Act
    shardedBigIntArray.arrayCopy(src, srcPos, desPos, length, updateStats);

    // Assert
    assertEquals(0.0, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int numExpectedEntries = 0;
    int minShardSize = 0;
    int nullEntry = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("ShardedBigIntArray");

    // Act
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(numExpectedEntries, minShardSize, nullEntry,
        statsReceiver);

    // Assert
    assertEquals(0.0, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test
  public void getEntryTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int position = 0;

    // Act
    int actual = shardedBigIntArray.getEntry(position);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getFillPercentageTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));

    // Act
    double actual = shardedBigIntArray.getFillPercentage();

    // Assert
    assertEquals(0.0, actual, 0.0);
  }

  @Test
  public void getShardOffsetTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int position = 0;

    // Act
    int actual = shardedBigIntArray.getShardOffset(position);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getShardTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int position = 0;

    // Act
    int[] actual = shardedBigIntArray.getShard(position);

    // Assert
    assertNull(actual);
  }

  @Test
  public void incrementEntryTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));
    int position = 0;
    int delta = 0;

    // Act
    int actual = shardedBigIntArray.incrementEntry(position, delta);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void resetTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(0, 0, 0,
        new DefaultStatsReceiver("ShardedBigIntArray"));

    // Act
    shardedBigIntArray.reset();

    // Assert
    assertEquals(0.0, shardedBigIntArray.getFillPercentage(), 0.0);
  }
}









