package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeMetadataLeftIndexedReaderAccessibleInfoProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = -1;
    int expectedNumRightNodes = -1;
    int numRightNodeMetadataTypes = -1;
    OptimizedEdgePool leftNodeEdgePool = null;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("left");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new NodeMetadataLeftIndexedReaderAccessibleInfoProvider(expectedNumLeftNodes, expectedNumRightNodes,
        numRightNodeMetadataTypes, leftNodeEdgePool, statsReceiver);
  }
}
