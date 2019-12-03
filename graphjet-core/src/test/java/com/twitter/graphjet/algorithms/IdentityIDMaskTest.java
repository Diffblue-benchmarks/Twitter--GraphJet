package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdentityIDMaskTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new IdentityIDMask();
  }

  @Test
  public void restoreTest() {
    // Arrange
    IdentityIDMask identityIDMask = new IdentityIDMask();
    long node = 1L;

    // Act
    long actual = identityIDMask.restore(node);

    // Assert
    assertEquals(1L, actual);
  }
}

