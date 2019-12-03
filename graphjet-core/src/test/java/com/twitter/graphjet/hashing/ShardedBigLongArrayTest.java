package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ShardedBigLongArrayTest {
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);
    longArray[6] = 167772161L;
    long[] longArray1 = new long[8];
    Arrays.fill(longArray1, 1L);
    longArray1[6] = 2561L;
    long[] longArray2 = new long[8];
    Arrays.fill(longArray2, 1L);
    longArray2[5] = 167772161L;
    long[][] array = new long[][]{longArray, longArray1, longArray2};

    // Act
    new ShardedBigLongArray.ReaderAccessibleInfo(array);
  }

  @Test
  public void addEntryTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    long entry = 0L;
    int position = 0;

    // Act
    shardedBigLongArray.addEntry(entry, position);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test
  public void arrayCopyTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    long[] src = new long[8];
    int srcPos = 0;
    int desPos = 0;
    int length = 0;
    boolean updateStats = true;

    // Act
    shardedBigLongArray.arrayCopy(src, srcPos, desPos, length, updateStats);

    // Assert
    assertEquals(0.0, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int numExpectedEntries = 0;
    int minShardSize = 0;
    long nullEntry = 0L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("ShardedBigLongArray");

    // Act
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(numExpectedEntries, minShardSize, nullEntry,
        statsReceiver);

    // Assert
    assertEquals(0.0, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test
  public void getEntryTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    int position = 0;

    // Act
    long actual = shardedBigLongArray.getEntry(position);

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void getFillPercentageTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));

    // Act
    double actual = shardedBigLongArray.getFillPercentage();

    // Assert
    assertEquals(0.0, actual, 0.0);
  }

  @Test
  public void getShardOffsetTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    int position = 0;

    // Act
    int actual = shardedBigLongArray.getShardOffset(position);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getShardTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    int position = 0;

    // Act
    long[] actual = shardedBigLongArray.getShard(position);

    // Assert
    assertEquals(65536, actual.length);
    assertEquals(0L, actual[0]);
    assertEquals(0L, actual[1]);
    assertEquals(0L, actual[2]);
    assertEquals(0L, actual[3]);
    assertEquals(0L, actual[4]);
    assertEquals(0L, actual[5]);
    assertEquals(0L, actual[65530]);
    assertEquals(0L, actual[65531]);
    assertEquals(0L, actual[65532]);
    assertEquals(0L, actual[65533]);
    assertEquals(0L, actual[65534]);
    assertEquals(0L, actual[65535]);
  }

  @Test
  public void incrementEntryTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));
    int position = 0;
    long delta = 0L;

    // Act
    long actual = shardedBigLongArray.incrementEntry(position, delta);

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void resetTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(0, 0, 0L,
        new DefaultStatsReceiver("ShardedBigLongArray"));

    // Act
    shardedBigLongArray.reset();

    // Assert
    assertEquals(0.0, shardedBigLongArray.getFillPercentage(), 0.0);
  }
}









