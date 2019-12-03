package com.twitter.graphjet.stats;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class NullStatsReceiverTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new NullStatsReceiver();
  }

  @Test
  public void counterTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    String counterName = "aaaaa";

    // Act
    nullStatsReceiver.counter(counterName);
  }

  @Test
  public void scopeTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    String namespace = "aaaaa";

    // Act
    StatsReceiver actual = nullStatsReceiver.scope(namespace);

    // Assert
    assertSame(nullStatsReceiver, actual);
  }
}


