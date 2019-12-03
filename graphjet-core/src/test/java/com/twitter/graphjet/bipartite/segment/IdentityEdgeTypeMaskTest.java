package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdentityEdgeTypeMaskTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new IdentityEdgeTypeMask();
  }

  @Test
  public void edgeTypeTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    int node = 1;

    // Act
    byte actual = identityEdgeTypeMask.edgeType(node);

    // Assert
    assertEquals((byte) 0, actual);
  }

  @Test
  public void encodeTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    int node = 1;
    byte edgeType = (byte) 0;

    // Act
    int actual = identityEdgeTypeMask.encode(node, edgeType);

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void restoreTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    int node = 1;

    // Act
    int actual = identityEdgeTypeMask.restore(node);

    // Assert
    assertEquals(1, actual);
  }
}



