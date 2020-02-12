package com.twitter.graphjet.algorithms.salsa.fullgraph;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.bipartite.api.BipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import org.junit.Test;

public class SalsaInternalStateDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    SalsaStats salsaStats = new SalsaStats();

    // Act
    SalsaInternalState actualSalsaInternalState = new SalsaInternalState(bipartiteGraph, salsaStats, 1);

    // Assert
    BipartiteGraph expectedBipartiteGraph = actualSalsaInternalState.bipartiteGraph;
    Long2ObjectMap<NodeInfo> visitedRightNodes = actualSalsaInternalState.getVisitedRightNodes();
    SalsaStats actualSalsaStats = actualSalsaInternalState.getSalsaStats();
    BipartiteGraph actualBipartiteGraph = actualSalsaInternalState.getBipartiteGraph();
    Long2IntMap currentRightNodes = actualSalsaInternalState.getCurrentRightNodes();
    Long2IntMap currentLeftNodes = actualSalsaInternalState.getCurrentLeftNodes();
    assertTrue(visitedRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap);
    assertTrue(actualSalsaInternalState.getNonZeroSeedSet() instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertTrue(currentLeftNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertTrue(currentRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertSame(expectedBipartiteGraph, actualBipartiteGraph);
    assertSame(salsaStats, actualSalsaStats);
  }

  @Test(timeout=10000)
  public void getBipartiteGraphTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    SalsaInternalState salsaInternalState = new SalsaInternalState(bipartiteGraph, new SalsaStats(), 1);

    // Act and Assert
    assertSame(salsaInternalState.bipartiteGraph, salsaInternalState.getBipartiteGraph());
  }
}

