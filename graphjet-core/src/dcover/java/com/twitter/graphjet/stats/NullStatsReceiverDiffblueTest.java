package com.twitter.graphjet.stats;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class NullStatsReceiverDiffblueTest {
  @Test(timeout=10000)
  public void scopeTest() {
    // Arrange
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act and Assert
    assertSame(nullStatsReceiver, nullStatsReceiver.scope("foo"));
  }
}

