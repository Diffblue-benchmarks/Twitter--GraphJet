package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DefaultStatsReceiverTest {
  @Test
  public void constructorTest() {
    // Arrange
    String name = "/";

    // Act
    new DefaultStatsReceiver(name);
  }

  @Test
  public void counterTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("/");
    String counterName = "/";

    // Act
    DefaultCounter actual = defaultStatsReceiver.counter(counterName);

    // Assert
    assertEquals(0L, actual.getCount());
  }

  @Test
  public void getCountTest() {
    // Arrange
    String counterName = "/";

    // Act
    long actual = DefaultStatsReceiver.getCount(counterName);

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void scopeTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("/");
    String namespace = "/";

    // Act
    StatsReceiver actual = defaultStatsReceiver.scope(namespace);

    // Assert
    assertTrue(actual instanceof DefaultStatsReceiver);
  }
}



