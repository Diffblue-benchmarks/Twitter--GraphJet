package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DefaultStatsReceiverDiffblueTest {
  @Test(timeout=10000)
  public void counterTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new DefaultStatsReceiver("name")).counter("name").getCount());
  }

  @Test(timeout=10000)
  public void scopeTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultStatsReceiver("name")).scope("foo") instanceof DefaultStatsReceiver);
  }

  @Test(timeout=10000)
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, DefaultStatsReceiver.getCount("name"));
  }
}

