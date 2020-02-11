package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayBasedLongToInternalIntFixedLengthBiMapDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getBackingArrayLengthTest() {
    // Arrange, Act and Assert
    assertEquals(16, (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver()))
        .getBackingArrayLength());
  }

  @Test(timeout=10000)
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals(42L,
        (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver())).getKey(1));
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver())).getKey(42);
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertEquals(42,
        (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver())).get(1L));
  }

  @Test(timeout=10000)
  public void clearTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        3, 10.0, 42, 42L, new NullStatsReceiver());

    // Act
    arrayBasedLongToInternalIntFixedLengthBiMap.clear();

    // Assert
    assertEquals(0, arrayBasedLongToInternalIntFixedLengthBiMap.getNumStoredKeys());
  }

  @Test(timeout=10000)
  public void getNumStoredKeysTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver()))
        .getNumStoredKeys());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    ArrayBasedLongToInternalIntFixedLengthBiMap actualArrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        3, 10.0, 42, 0L, new NullStatsReceiver());

    // Assert
    boolean actualIsAtCapacityResult = actualArrayBasedLongToInternalIntFixedLengthBiMap.isAtCapacity();
    int actualNumStoredKeys = actualArrayBasedLongToInternalIntFixedLengthBiMap.getNumStoredKeys();
    assertFalse(actualIsAtCapacityResult);
    assertEquals(16, actualArrayBasedLongToInternalIntFixedLengthBiMap.getBackingArrayLength());
    assertEquals(0, actualNumStoredKeys);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 0, 42L, new NullStatsReceiver());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ArrayBasedLongToInternalIntFixedLengthBiMap actualArrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        3, 10.0, 42, 42L, new NullStatsReceiver());

    // Assert
    boolean actualIsAtCapacityResult = actualArrayBasedLongToInternalIntFixedLengthBiMap.isAtCapacity();
    int actualNumStoredKeys = actualArrayBasedLongToInternalIntFixedLengthBiMap.getNumStoredKeys();
    assertFalse(actualIsAtCapacityResult);
    assertEquals(16, actualArrayBasedLongToInternalIntFixedLengthBiMap.getBackingArrayLength());
    assertEquals(0, actualNumStoredKeys);
  }

  @Test(timeout=10000)
  public void putTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, Double.NaN, 42, 42L, new NullStatsReceiver())).put(1L);
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    ArrayBasedLongToInternalIntFixedLengthBiMap arrayBasedLongToInternalIntFixedLengthBiMap = new ArrayBasedLongToInternalIntFixedLengthBiMap(
        3, 10.0, 42, 42L, new NullStatsReceiver());

    // Act and Assert
    assertEquals(14, arrayBasedLongToInternalIntFixedLengthBiMap.put(1L));
    assertEquals(1, arrayBasedLongToInternalIntFixedLengthBiMap.getNumStoredKeys());
  }

  @Test(timeout=10000)
  public void isAtCapacityTest2() {
    // Arrange, Act and Assert
    assertFalse(
        (new ArrayBasedLongToInternalIntFixedLengthBiMap(3, 10.0, 42, 42L, new NullStatsReceiver())).isAtCapacity());
  }

  @Test(timeout=10000)
  public void isAtCapacityTest() {
    // Arrange, Act and Assert
    assertTrue((new ArrayBasedLongToInternalIntFixedLengthBiMap(3, Double.NaN, 42, 42L, new NullStatsReceiver()))
        .isAtCapacity());
  }
}

