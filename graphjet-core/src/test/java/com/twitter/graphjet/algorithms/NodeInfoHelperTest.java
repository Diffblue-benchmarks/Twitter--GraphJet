package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NodeInfoHelperTest {
  @Test
  public void nodeInfoHasValidSocialProofsTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    boolean actual = NodeInfoHelper.nodeInfoHasValidSocialProofs(nodeInfo);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void removeUnfavoritedSocialProofsTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    boolean actual = NodeInfoHelper.removeUnfavoritedSocialProofs(nodeInfo);

    // Assert
    assertFalse(actual);
  }
}

