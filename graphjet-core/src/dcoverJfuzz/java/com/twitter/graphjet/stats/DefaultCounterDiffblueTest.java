package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultCounterDiffblueTest {
  @Test(timeout=10000)
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new DefaultCounter()).getCount());
  }

  @Test(timeout=10000)
  public void incrTest2() {
    // Arrange
    DefaultCounter defaultCounter = new DefaultCounter();

    // Act
    defaultCounter.incr();

    // Assert
    assertEquals(1L, defaultCounter.getCount());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new DefaultCounter()).getCount());
  }

  @Test(timeout=10000)
  public void incrTest() {
    // Arrange
    DefaultCounter defaultCounter = new DefaultCounter();

    // Act
    defaultCounter.incr(2);

    // Assert
    assertEquals(2L, defaultCounter.getCount());
  }
}

