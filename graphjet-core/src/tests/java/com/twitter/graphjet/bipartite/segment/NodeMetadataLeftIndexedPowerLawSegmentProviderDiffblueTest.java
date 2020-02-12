package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class NodeMetadataLeftIndexedPowerLawSegmentProviderDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask identityEdgeTypeMask = new IdentityEdgeTypeMask();

    // Act
    NodeMetadataLeftIndexedPowerLawSegmentProvider actualNodeMetadataLeftIndexedPowerLawSegmentProvider = new NodeMetadataLeftIndexedPowerLawSegmentProvider(
        10, 1, 10.0, 10, 10, identityEdgeTypeMask, new NullStatsReceiver());

    // Assert
    assertSame(identityEdgeTypeMask, actualNodeMetadataLeftIndexedPowerLawSegmentProvider.edgeTypeMask);
    assertTrue(actualNodeMetadataLeftIndexedPowerLawSegmentProvider.statsReceiver instanceof NullStatsReceiver);
  }
}

