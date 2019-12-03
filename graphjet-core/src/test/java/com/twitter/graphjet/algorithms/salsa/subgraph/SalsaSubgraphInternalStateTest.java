package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.algorithms.salsa.SalsaRequest;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaSubgraphInternalStateTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructSubgraphAndTraverseOnceTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("graph");
    SalsaNodeVisitor.NodeVisitorWithSocialProof nodeVisitor = new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);
    Random random = new Random();

    // Act
    salsaSubgraphInternalState.constructSubgraphAndTraverseOnce(nodeVisitor, random);

    // Assert
    assertEquals(0, salsaSubgraphInternalState.getSalsaStats().getNumRHSVisits());
  }
  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;
    SalsaStats salsaStats = new SalsaStats();
    int expectedNodesToHit = 0;
    int expectedNumLeftNodes = 0;

    // Act
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(leftIndexedBipartiteGraph,
        salsaStats, expectedNodesToHit, expectedNumLeftNodes);

    // Assert
    Long2ObjectMap<NodeInfo> visitedRightNodes = salsaSubgraphInternalState.getVisitedRightNodes();
    SalsaStats salsaStats1 = salsaSubgraphInternalState.getSalsaStats();
    Long2IntMap currentRightNodes = salsaSubgraphInternalState.getCurrentRightNodes();
    LeftIndexedBipartiteGraph bipartiteGraph = salsaSubgraphInternalState.getBipartiteGraph();
    Long2IntMap currentLeftNodes = salsaSubgraphInternalState.getCurrentLeftNodes();
    assertTrue(visitedRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap);
    assertTrue(salsaSubgraphInternalState.getNonZeroSeedSet() instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertTrue(currentLeftNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertNull(bipartiteGraph);
    assertTrue(currentRightNodes instanceof it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap);
    assertSame(salsaStats, salsaStats1);
  }
  @Test
  public void getBipartiteGraphTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);

    // Act
    LeftIndexedBipartiteGraph actual = salsaSubgraphInternalState.getBipartiteGraph();

    // Assert
    assertNull(actual);
  }
  @Test
  public void resetWithRequestTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    SalsaRequest incomingSalsaRequest = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaSubgraphInternalState.resetWithRequest(incomingSalsaRequest);
  }
  @Test
  public void traverseSubgraphLeftToRightTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("graph");
    SalsaNodeVisitor.NodeVisitorWithSocialProof nodeVisitor = new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaSubgraphInternalState.traverseSubgraphLeftToRight(nodeVisitor);
  }
  @Test
  public void traverseSubgraphRightToLeftTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);

    // Act
    salsaSubgraphInternalState.traverseSubgraphRightToLeft();

    // Assert
    assertEquals(0, salsaSubgraphInternalState.getSalsaStats().getNumRHSVisits());
  }
}





