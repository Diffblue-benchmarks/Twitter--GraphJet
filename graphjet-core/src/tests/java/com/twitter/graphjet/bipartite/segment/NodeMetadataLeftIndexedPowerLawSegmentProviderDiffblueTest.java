package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class NodeMetadataLeftIndexedPowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();

    // Act
    NodeMetadataLeftIndexedPowerLawSegmentProvider actualNodeMetadataLeftIndexedPowerLawSegmentProvider = new NodeMetadataLeftIndexedPowerLawSegmentProvider(
        10, 1, 10.0, 10, 10, edgeTypeMask, nullStatsReceiver);

    // Assert
    assertTrue(actualNodeMetadataLeftIndexedPowerLawSegmentProvider.edgeTypeMask instanceof IdentityEdgeTypeMask);
    assertSame(nullStatsReceiver, actualNodeMetadataLeftIndexedPowerLawSegmentProvider.statsReceiver);
  }
}

