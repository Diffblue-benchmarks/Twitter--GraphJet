package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class LeftIndexedPowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    LeftIndexedPowerLawSegmentProvider actualLeftIndexedPowerLawSegmentProvider = new LeftIndexedPowerLawSegmentProvider(
        10, 1, 10.0, 10, identityEdgeTypeMask, nullStatsReceiver);

    // Assert
    assertSame(identityEdgeTypeMask, actualLeftIndexedPowerLawSegmentProvider.edgeTypeMask);
    assertSame(nullStatsReceiver, actualLeftIndexedPowerLawSegmentProvider.statsReceiver);
  }
}

