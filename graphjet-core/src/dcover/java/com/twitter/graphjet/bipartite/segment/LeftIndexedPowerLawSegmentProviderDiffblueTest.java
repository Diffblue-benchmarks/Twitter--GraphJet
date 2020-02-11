package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class LeftIndexedPowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    LeftIndexedPowerLawSegmentProvider actualLeftIndexedPowerLawSegmentProvider = new LeftIndexedPowerLawSegmentProvider(
        10, 1, 10.0, 10, edgeTypeMask, new NullStatsReceiver());

    // Assert
    assertTrue(actualLeftIndexedPowerLawSegmentProvider.edgeTypeMask instanceof IdentityEdgeTypeMask);
    assertTrue(actualLeftIndexedPowerLawSegmentProvider.statsReceiver instanceof NullStatsReceiver);
  }
}

