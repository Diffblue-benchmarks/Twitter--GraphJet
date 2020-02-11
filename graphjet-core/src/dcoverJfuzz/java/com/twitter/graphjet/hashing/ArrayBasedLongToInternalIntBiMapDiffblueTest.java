package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayBasedLongToInternalIntBiMapDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getKeyTest2() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L, new NullStatsReceiver())).getKey(42);
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals(42L, (new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L, new NullStatsReceiver())).getKey(0));
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertEquals(42, (new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L, new NullStatsReceiver())).get(1L));
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange, Act and Assert
    assertEquals(14, (new ArrayBasedLongToInternalIntBiMap(10, 10.0, 42, 42L, new NullStatsReceiver())).put(1L));
  }
}

