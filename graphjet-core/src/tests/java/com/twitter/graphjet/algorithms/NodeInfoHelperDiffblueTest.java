package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NodeInfoHelperDiffblueTest {
  @Test(timeout=10000)
  public void removeUnfavoritedSocialProofsTest() {
    // Arrange, Act and Assert
    assertFalse(NodeInfoHelper.removeUnfavoritedSocialProofs(new NodeInfo(123L, 10.0, 3)));
  }

  @Test(timeout=10000)
  public void nodeInfoHasValidSocialProofsTest() {
    // Arrange, Act and Assert
    assertFalse(NodeInfoHelper.nodeInfoHasValidSocialProofs(new NodeInfo(123L, 10.0, 3)));
  }
}

