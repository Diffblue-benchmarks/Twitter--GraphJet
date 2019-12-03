package com.twitter.graphjet.hashing;

import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayBasedIntToIntArrayMapTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void ReaderAccessibleInfoConstructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ShardedBigIntArray edges = new ShardedBigIntArray(1, 1, 1, defaultStatsReceiver);
    IntToIntPairArrayIndexBasedMap nodeInfo = new IntToIntPairArrayIndexBasedMap(11, 1, defaultStatsReceiver);

    // Act
    new ArrayBasedIntToIntArrayMap.ReaderAccessibleInfo(edges, nodeInfo);
  }
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumNodes = -1;
    int expectedArraySize = -1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("ArrayBasedIntToIntArrayMap");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new ArrayBasedIntToIntArrayMap(expectedNumNodes, expectedArraySize, statsReceiver);
  }
}

