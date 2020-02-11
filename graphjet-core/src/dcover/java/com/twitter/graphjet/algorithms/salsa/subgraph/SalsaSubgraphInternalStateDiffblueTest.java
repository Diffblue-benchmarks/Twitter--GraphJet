package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import org.junit.Test;

public class SalsaSubgraphInternalStateDiffblueTest {
  @Test(timeout=10000)
  public void getBipartiteGraphTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph smallLeftRegularBipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0,
        3, new NullStatsReceiver());

    // Act and Assert
    assertSame(smallLeftRegularBipartiteGraph,
        (new SalsaSubgraphInternalState(smallLeftRegularBipartiteGraph, new SalsaStats(), 1, 10)).getBipartiteGraph());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph smallLeftRegularBipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0,
        3, new NullStatsReceiver());
    SalsaStats salsaStats = new SalsaStats();

    // Act
    SalsaSubgraphInternalState actualSalsaSubgraphInternalState = new SalsaSubgraphInternalState(
        smallLeftRegularBipartiteGraph, salsaStats, 1, 10);

    // Assert
    Long2ObjectMap<NodeInfo> visitedRightNodes = actualSalsaSubgraphInternalState.getVisitedRightNodes();
    SalsaStats actualSalsaStats = actualSalsaSubgraphInternalState.getSalsaStats();
    Long2IntMap currentRightNodes = actualSalsaSubgraphInternalState.getCurrentRightNodes();
    LeftIndexedBipartiteGraph actualBipartiteGraph = actualSalsaSubgraphInternalState.getBipartiteGraph();
    Long2IntMap currentLeftNodes = actualSalsaSubgraphInternalState.getCurrentLeftNodes();
    assertTrue(visitedRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap);
    assertTrue(
        actualSalsaSubgraphInternalState.getNonZeroSeedSet() instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertTrue(currentLeftNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertSame(smallLeftRegularBipartiteGraph, actualBipartiteGraph);
    assertTrue(currentRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertSame(salsaStats, actualSalsaStats);
  }

  @Test(timeout=10000)
  public void traverseSubgraphRightToLeftTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph leftIndexedBipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(leftIndexedBipartiteGraph,
        new SalsaStats(), 1, 10);

    // Act
    salsaSubgraphInternalState.traverseSubgraphRightToLeft();

    // Assert
    assertEquals(0, salsaSubgraphInternalState.getSalsaStats().getNumRHSVisits());
  }
}

