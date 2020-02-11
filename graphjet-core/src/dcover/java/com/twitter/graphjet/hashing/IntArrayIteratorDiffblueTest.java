package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class IntArrayIteratorDiffblueTest {
  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(
        new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(0, intArrayIterator.nextInt());
    assertFalse(intArrayIterator.hasNext());
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new IntArrayIterator(new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()))).size());
  }

  @Test(timeout=10000)
  public void skipTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new IntArrayIterator(new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()))).skip(1));
  }

  @Test(timeout=10000)
  public void nextTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(
        new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()));

    // Act and Assert
    assertEquals(Integer.valueOf(0), intArrayIterator.next());
    assertFalse(intArrayIterator.hasNext());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ArrayBasedIntToIntArrayMap arrayBasedIntToIntArrayMap = new ArrayBasedIntToIntArrayMap(10, 3,
        new NullStatsReceiver());

    // Act
    IntArrayIterator actualIntArrayIterator = new IntArrayIterator(arrayBasedIntToIntArrayMap);

    // Assert
    boolean actualHasNextResult = actualIntArrayIterator.hasNext();
    assertFalse(actualHasNextResult);
    assertEquals(0, actualIntArrayIterator.size());
    assertEquals(0, arrayBasedIntToIntArrayMap.currentNumNodes);
    assertEquals(0, arrayBasedIntToIntArrayMap.currentNumEdgesStored);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange, Act and Assert
    assertFalse((new IntArrayIterator(new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()))).hasNext());
  }

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(
        new ArrayBasedIntToIntArrayMap(10, 3, new NullStatsReceiver()));

    // Act
    IntArrayIterator actualResetForNodeResult = intArrayIterator.resetForNode(1);

    // Assert
    assertSame(intArrayIterator, actualResetForNodeResult);
    boolean actualHasNextResult = actualResetForNodeResult.hasNext();
    assertFalse(actualHasNextResult);
    assertEquals(0, actualResetForNodeResult.size());
  }
}

