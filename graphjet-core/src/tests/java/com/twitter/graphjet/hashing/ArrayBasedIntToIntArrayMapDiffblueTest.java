package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayBasedIntToIntArrayMapDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ShardedBigIntArray edges = new ShardedBigIntArray(10, 1, 1, new NullStatsReceiver());

    // Act
    ArrayBasedIntToIntArrayMap.ReaderAccessibleInfo actualReaderAccessibleInfo = new ArrayBasedIntToIntArrayMap.ReaderAccessibleInfo(
        edges, new IntToIntPairArrayIndexBasedMap(10, 42, new NullStatsReceiver()));

    // Assert
    assertTrue(actualReaderAccessibleInfo.nodeInfo instanceof IntToIntPairArrayIndexBasedMap);
    assertTrue(actualReaderAccessibleInfo.edges instanceof ShardedBigIntArray);
  }

  @Test(timeout=10000)
  public void getTest2() {
    // Arrange and Act
    IntIterator actualGetResult = (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).get(1);

    // Assert
    boolean actualHasNextResult = actualGetResult.hasNext();
    assertFalse(actualHasNextResult);
    assertEquals(0, ((IntArrayIterator) actualGetResult).size());
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    ArrayBasedIntToIntArrayMap arrayBasedIntToIntArrayMap = new ArrayBasedIntToIntArrayMap(10, 3,
        new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    assertTrue(arrayBasedIntToIntArrayMap.put(1, intArray));
    ArrayBasedIntToIntArrayMap.ReaderAccessibleInfo readerAccessibleInfo = arrayBasedIntToIntArrayMap.readerAccessibleInfo;
    assertEquals(1, arrayBasedIntToIntArrayMap.currentNumNodes);
    assertEquals(8, arrayBasedIntToIntArrayMap.currentNumEdgesStored);
    IntToIntPairConcurrentHashMap.ReaderAccessibleInfo readerAccessibleInfo1 = ((IntToIntPairConcurrentHashMap) readerAccessibleInfo.nodeInfo).readerAccessibleInfo;
    assertEquals(0.006103515625, readerAccessibleInfo.edges.getFillPercentage(), 0.0);
    assertEquals(0.002288818359375, readerAccessibleInfo1.array.getFillPercentage(), 0.0);
  }

  @Test(timeout=10000)
  public void crossMemoryBarrierTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).crossMemoryBarrier());
  }

  @Test(timeout=10000)
  public void getArrayLengthTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).getArrayLength(1));
  }

  @Test(timeout=10000)
  public void getNodeInfoTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).getNodeInfo(1));
  }

  @Test(timeout=10000)
  public void getNumberedEdgeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).getNumberedEdge(1, 10));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ArrayBasedIntToIntArrayMap actualArrayBasedIntToIntArrayMap = new ArrayBasedIntToIntArrayMap(10, 3,
        new NullStatsReceiver());

    // Assert
    ArrayBasedIntToIntArrayMap.ReaderAccessibleInfo readerAccessibleInfo = actualArrayBasedIntToIntArrayMap.readerAccessibleInfo;
    assertEquals(0, actualArrayBasedIntToIntArrayMap.currentNumNodes);
    assertEquals(0, actualArrayBasedIntToIntArrayMap.currentNumEdgesStored);
    IntToIntPairHashMap intToIntPairHashMap = readerAccessibleInfo.nodeInfo;
    BigIntArray bigIntArray = readerAccessibleInfo.edges;
    assertTrue(intToIntPairHashMap instanceof IntToIntPairConcurrentHashMap);
    assertTrue(bigIntArray instanceof ShardedBigIntArray);
    IntToIntPairConcurrentHashMap.ReaderAccessibleInfo readerAccessibleInfo1 = ((IntToIntPairConcurrentHashMap) intToIntPairHashMap).readerAccessibleInfo;
    int actualResultInt = readerAccessibleInfo1.maxNumKeysToStore;
    BigIntArray bigIntArray1 = readerAccessibleInfo1.array;
    assertEquals(0.0, bigIntArray.getFillPercentage(), 0.0);
    assertEquals(1, ((ShardedBigIntArray) bigIntArray).readerAccessibleInfo.array.length);
    assertTrue(bigIntArray1 instanceof ShardedBigIntArray);
    assertEquals(31, readerAccessibleInfo1.bitMask);
    assertEquals(16, actualResultInt);
    assertEquals(0.0, bigIntArray1.getFillPercentage(), 0.0);
    assertEquals(1, ((ShardedBigIntArray) bigIntArray1).readerAccessibleInfo.array.length);
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange
    ArrayBasedIntToIntArrayMap arrayBasedIntToIntArrayMap = new ArrayBasedIntToIntArrayMap(10, 3,
        new NullStatsReceiver());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    OptimizedEdgeIterator optimizedEdgeIterator = new OptimizedEdgeIterator(
        new OptimizedEdgePool(intArray, 3, new NullStatsReceiver()));

    // Act
    IntIterator actualGetResult = arrayBasedIntToIntArrayMap.get(1, optimizedEdgeIterator);

    // Assert
    assertSame(optimizedEdgeIterator, actualGetResult);
    assertTrue(actualGetResult.hasNext());
  }

  @Test(timeout=10000)
  public void incrementFeatureValueTest2() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).incrementFeatureValue(1, (byte) 1);
  }

  @Test(timeout=10000)
  public void incrementFeatureValueTest() {
    // Arrange, Act and Assert
    assertFalse((new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver())).incrementFeatureValue(1, (byte) 127));
  }
}

