package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class RightNodeMetadataLeftIndexedPowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    RightNodeMetadataLeftIndexedPowerLawSegmentProvider actualRightNodeMetadataLeftIndexedPowerLawSegmentProvider = new RightNodeMetadataLeftIndexedPowerLawSegmentProvider(
        10, 1, 10.0, 10, 10, identityEdgeTypeMask, nullStatsReceiver);

    // Assert
    assertSame(identityEdgeTypeMask, actualRightNodeMetadataLeftIndexedPowerLawSegmentProvider.edgeTypeMask);
    assertSame(nullStatsReceiver, actualRightNodeMetadataLeftIndexedPowerLawSegmentProvider.statsReceiver);
  }
}

