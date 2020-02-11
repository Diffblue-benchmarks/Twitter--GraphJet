package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SalsaResponseDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act
    SalsaResponse actualSalsaResponse = new SalsaResponse(null, salsaStats);

    // Assert
    SalsaStats actualSalsaStats = actualSalsaResponse.getSalsaStats();
    assertSame(salsaStats, actualSalsaStats);
    assertNull(actualSalsaResponse.getRankedRecommendations());
  }

  @Test(timeout=10000)
  public void getSalsaStatsTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();

    // Act and Assert
    assertSame(salsaStats, (new SalsaResponse(null, salsaStats)).getSalsaStats());
  }
}

