package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdentityIDMaskDiffblueTest {
  @Test(timeout=10000)
  public void restoreTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new IdentityIDMask()).restore(1L));
  }
}

