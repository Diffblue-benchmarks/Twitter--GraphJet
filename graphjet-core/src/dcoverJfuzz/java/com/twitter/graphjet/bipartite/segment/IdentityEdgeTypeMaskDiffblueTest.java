package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdentityEdgeTypeMaskDiffblueTest {
  @Test(timeout=10000)
  public void encodeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new IdentityEdgeTypeMask()).encode(1, (byte) 1));
  }

  @Test(timeout=10000)
  public void edgeTypeTest() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, (new IdentityEdgeTypeMask()).edgeType(1));
  }

  @Test(timeout=10000)
  public void restoreTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new IdentityEdgeTypeMask()).restore(1));
  }
}

