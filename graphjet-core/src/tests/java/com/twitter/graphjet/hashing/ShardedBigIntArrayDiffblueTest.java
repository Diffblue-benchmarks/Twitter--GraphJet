package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ShardedBigIntArrayDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    int[] intArray2 = new int[8];
    Arrays.fill(intArray2, 1);

    // Act and Assert
    assertEquals(3,
        (new ShardedBigIntArray.ReaderAccessibleInfo(new int[][]{intArray, intArray1, intArray2})).array.length);
  }

  @Test(timeout=10000)
  public void getShardTest() {
    // Arrange, Act and Assert
    assertNull((new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).getShard(1));
  }

  @Test(timeout=10000)
  public void getEntryTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).getEntry(1));
  }

  @Test(timeout=10000)
  public void getEntryTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).getEntry(2147483647));
  }

  @Test(timeout=10000)
  public void addEntryTest3() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    shardedBigIntArray.addEntry(2, 2147483647);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigIntArray.getFillPercentage(), 0.0);
    assertEquals(32768, shardedBigIntArray.readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void addEntryTest2() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    shardedBigIntArray.addEntry(2, 1);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void addEntryTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 0, new NullStatsReceiver());

    // Act
    shardedBigIntArray.addEntry(2, 1);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void arrayCopyTest3() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    shardedBigIntArray.arrayCopy(intArray, 1, 65536, 3, true);

    // Assert
    assertEquals(0.002288818359375, shardedBigIntArray.getFillPercentage(), 0.0);
    assertEquals(2, shardedBigIntArray.readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void arrayCopyTest2() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 0, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    shardedBigIntArray.arrayCopy(intArray, 1, 1, 3, true);

    // Assert
    assertEquals(0.002288818359375, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void arrayCopyTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    shardedBigIntArray.arrayCopy(intArray, 1, 1, 3, true);

    // Assert
    assertEquals(0.002288818359375, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getShardOffsetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).getShardOffset(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ShardedBigIntArray actualShardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Assert
    assertEquals(0.0, actualShardedBigIntArray.getFillPercentage(), 0.0);
    assertEquals(1, actualShardedBigIntArray.readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void resetTest() {
    // Arrange
    ShardedBigIntArray shardedBigIntArray = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    shardedBigIntArray.reset();

    // Assert
    assertEquals(0.0, shardedBigIntArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getFillPercentageTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void incrementEntryTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).incrementEntry(2147483647, 2));
  }

  @Test(timeout=10000)
  public void incrementEntryTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver())).incrementEntry(1, 2));
  }
}

