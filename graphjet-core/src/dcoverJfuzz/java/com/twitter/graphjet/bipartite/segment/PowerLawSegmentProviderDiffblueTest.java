package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class PowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    PowerLawSegmentProvider actualPowerLawSegmentProvider = new PowerLawSegmentProvider(10, 1, 10.0, 10, 1, 10.0,
        edgeTypeMask, new NullStatsReceiver());

    // Assert
    assertTrue(actualPowerLawSegmentProvider.edgeTypeMask instanceof IdentityEdgeTypeMask);
    assertTrue(actualPowerLawSegmentProvider.statsReceiver instanceof NullStatsReceiver);
  }
}

