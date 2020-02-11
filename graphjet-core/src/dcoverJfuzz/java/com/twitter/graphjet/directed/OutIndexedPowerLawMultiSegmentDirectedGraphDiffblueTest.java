package com.twitter.graphjet.directed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OutIndexedPowerLawMultiSegmentDirectedGraphDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void removeEdgeTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1, 10.0, edgeTypeMask, new NullStatsReceiver()))
        .removeEdge(1L, 1L);
  }

  @Test(timeout=10000)
  public void getRandomOutEdgesTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertNull(
        (new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1, 10.0, edgeTypeMask, new NullStatsReceiver()))
            .getRandomOutEdges(1L, 10, null));
  }

  @Test(timeout=10000)
  public void getOutDegreeTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertEquals(0,
        (new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1, 10.0, edgeTypeMask, new NullStatsReceiver()))
            .getOutDegree(1L));
  }

  @Test(timeout=10000)
  public void getOutEdgesTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();

    // Act and Assert
    assertFalse(
        (new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1, 10.0, edgeTypeMask, new NullStatsReceiver()))
            .getOutEdges(1L).hasNext());
  }
}

