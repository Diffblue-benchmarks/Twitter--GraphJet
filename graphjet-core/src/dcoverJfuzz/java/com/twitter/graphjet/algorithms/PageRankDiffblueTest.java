package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.directed.OutIndexedPowerLawMultiSegmentDirectedGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PageRankDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getPageRankVectorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));

    // Act and Assert
    assertNull((new PageRank(graph, longOpenHashSet, 123L, 10.0, 3, 10.0)).getPageRankVector());
  }

  @Test(timeout=10000)
  public void runTest2() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));
    PageRank pageRank = new PageRank(graph, longOpenHashSet, 123L, 10.0, 3, 10.0);

    // Act and Assert
    assertEquals(1, pageRank.run());
    double actualL1Norm = pageRank.getL1Norm();
    assertEquals(0.0, actualL1Norm, 0.0);
    assertEquals(124, pageRank.getPageRankVector().length);
  }

  @Test(timeout=10000)
  public void runTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));
    PageRank pageRank = new PageRank(graph, longOpenHashSet, 123L, 10.0, 1, 10.0);

    // Act and Assert
    assertEquals(1, pageRank.run());
    double actualL1Norm = pageRank.getL1Norm();
    assertEquals(0.0, actualL1Norm, 0.0);
    assertEquals(124, pageRank.getPageRankVector().length);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    new PageRank(graph, longOpenHashSet, 9223372036854775807L, 10.0, 3, 10.0);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));

    // Act
    PageRank actualPageRank = new PageRank(graph, longOpenHashSet, 123L, 10.0, 3, 10.0);

    // Assert
    double actualL1Norm = actualPageRank.getL1Norm();
    assertEquals(1.7976931348623157E308, actualL1Norm, 0.0);
    assertNull(actualPageRank.getPageRankVector());
  }

  @Test(timeout=10000)
  public void getL1NormTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = new OutIndexedPowerLawMultiSegmentDirectedGraph(3, 3, 10, 1,
        10.0, edgeTypeMask, new NullStatsReceiver());
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    longOpenHashSet.add(Long.valueOf(1L));

    // Act and Assert
    assertEquals(1.7976931348623157E308, (new PageRank(graph, longOpenHashSet, 123L, 10.0, 3, 10.0)).getL1Norm(), 0.0);
  }
}

