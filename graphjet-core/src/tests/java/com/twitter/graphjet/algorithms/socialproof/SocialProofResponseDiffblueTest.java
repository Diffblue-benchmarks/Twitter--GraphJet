package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SocialProofResponseDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new SocialProofResponse(null)).getRankedRecommendations());
  }
}

