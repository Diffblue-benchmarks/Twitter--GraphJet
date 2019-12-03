package com.twitter.graphjet.algorithms.salsa.fullgraph;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.bipartite.api.BipartiteGraph;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class SalsaInternalStateTest {
  @Test
  public void constructorTest() {
    // Arrange
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    SalsaStats salsaStats = new SalsaStats();
    int expectedNodesToHit = 1;

    // Act
    SalsaInternalState salsaInternalState = new SalsaInternalState(bipartiteGraph, salsaStats, expectedNodesToHit);

    // Assert
    Long2ObjectMap<NodeInfo> visitedRightNodes = salsaInternalState.getVisitedRightNodes();
    SalsaStats salsaStats1 = salsaInternalState.getSalsaStats();
    Long2IntMap currentRightNodes = salsaInternalState.getCurrentRightNodes();
    BipartiteGraph bipartiteGraph1 = salsaInternalState.getBipartiteGraph();
    Long2IntMap currentLeftNodes = salsaInternalState.getCurrentLeftNodes();
    assertTrue(visitedRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap);
    assertTrue(salsaInternalState.getNonZeroSeedSet() instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertTrue(currentLeftNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertNull(bipartiteGraph1);
    assertTrue(currentRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertSame(salsaStats, salsaStats1);
  }

  @Test
  public void getBipartiteGraphTest() {
    // Arrange
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 1);

    // Act
    BipartiteGraph actual = salsaInternalState.getBipartiteGraph();

    // Assert
    assertNull(actual);
  }
}

