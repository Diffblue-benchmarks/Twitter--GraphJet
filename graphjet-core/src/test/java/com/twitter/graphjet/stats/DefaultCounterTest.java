package com.twitter.graphjet.stats;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultCounterTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DefaultCounter defaultCounter = new DefaultCounter();

    // Assert
    assertEquals(0L, defaultCounter.getCount());
  }

  @Test
  public void getCountTest() {
    // Arrange
    DefaultCounter defaultCounter = new DefaultCounter();

    // Act
    long actual = defaultCounter.getCount();

    // Assert
    assertEquals(0L, actual);
  }

  @Test
  public void incrTest() {
    // Arrange
    DefaultCounter defaultCounter = new DefaultCounter();
    int delta = 1;

    // Act
    defaultCounter.incr(delta);

    // Assert
    assertEquals(1L, defaultCounter.getCount());
  }

  @Test
  public void incrTest2() {
    // Arrange
    DefaultCounter defaultCounter = new DefaultCounter();

    // Act
    defaultCounter.incr();

    // Assert
    assertEquals(1L, defaultCounter.getCount());
  }
}



