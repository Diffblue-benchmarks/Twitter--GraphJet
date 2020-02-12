package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ShardedBigLongArrayDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);
    long[] longArray1 = new long[8];
    Arrays.fill(longArray1, 1L);
    long[] longArray2 = new long[8];
    Arrays.fill(longArray2, 1L);

    // Act and Assert
    assertEquals(3,
        (new ShardedBigLongArray.ReaderAccessibleInfo(new long[][]{longArray, longArray1, longArray2})).array.length);
  }

  @Test(timeout=10000)
  public void getEntryTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver())).getEntry(1));
  }

  @Test(timeout=10000)
  public void getShardOffsetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver())).getShardOffset(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ShardedBigLongArray actualShardedBigLongArray = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());

    // Assert
    assertEquals(0.0, actualShardedBigLongArray.getFillPercentage(), 0.0);
    assertEquals(1, actualShardedBigLongArray.readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void resetTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());

    // Act
    shardedBigLongArray.reset();

    // Assert
    assertEquals(0.0, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void getFillPercentageTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver())).getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void arrayCopyTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());
    long[] longArray = new long[8];
    Arrays.fill(longArray, 1L);

    // Act
    shardedBigLongArray.arrayCopy(longArray, 1, 1, 3, true);

    // Assert
    assertEquals(0.002288818359375, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void addEntryTest() {
    // Arrange
    ShardedBigLongArray shardedBigLongArray = new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver());

    // Act
    shardedBigLongArray.addEntry(1L, 1);

    // Assert
    assertEquals(7.62939453125E-4, shardedBigLongArray.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void incrementEntryTest() {
    // Arrange, Act and Assert
    assertEquals(3L, (new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver())).incrementEntry(1, 2L));
  }

  @Test(timeout=10000)
  public void getShardTest() {
    // Arrange and Act
    long[] actualShard = (new ShardedBigLongArray(10, 1, 1L, new NullStatsReceiver())).getShard(1);

    // Assert
    assertEquals(65536, actualShard.length);
    assertEquals(1L, actualShard[0]);
    assertEquals(1L, actualShard[1]);
    assertEquals(1L, actualShard[2]);
    assertEquals(1L, actualShard[3]);
    assertEquals(1L, actualShard[4]);
    assertEquals(1L, actualShard[5]);
    assertEquals(1L, actualShard[65530]);
    assertEquals(1L, actualShard[65531]);
    assertEquals(1L, actualShard[65532]);
    assertEquals(1L, actualShard[65533]);
    assertEquals(1L, actualShard[65534]);
    assertEquals(1L, actualShard[65535]);
  }
}

