package com.twitter.graphjet.algorithms.salsa.subgraph;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.algorithms.salsa.SalsaRequest;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import java.util.Random;
import org.junit.Test;

public class LeftSubgraphSalsaIterationTest {
  @Test
  public void constructorTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaak");
    SalsaNodeVisitor.NodeVisitorWithSocialProof nodeVisitor = new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);

    // Act
    new LeftSubgraphSalsaIteration(salsaSubgraphInternalState, nodeVisitor);
  }

  @Test
  public void resetWithRequestTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("akaaa");
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    nodeInfo.setWeight(1.0);
    nodeInfo.setWeight(1.0);
    LeftSubgraphSalsaIteration leftSubgraphSalsaIteration = new LeftSubgraphSalsaIteration(salsaSubgraphInternalState,
        new SalsaNodeVisitor.NodeVisitorWithSocialProof(
            (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap));
    SalsaRequest salsaRequest = null;
    Random newRandom = new Random();

    // Act
    leftSubgraphSalsaIteration.resetWithRequest(salsaRequest, newRandom);
  }

  @Test
  public void runSingleIterationTest() {
    // Arrange
    SalsaSubgraphInternalState salsaSubgraphInternalState = new SalsaSubgraphInternalState(null, new SalsaStats(), 0,
        0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("akaaa");
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    nodeInfo.setWeight(1.0);
    nodeInfo.setWeight(1.0);
    LeftSubgraphSalsaIteration leftSubgraphSalsaIteration = new LeftSubgraphSalsaIteration(salsaSubgraphInternalState,
        new SalsaNodeVisitor.NodeVisitorWithSocialProof(
            (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap));

    // Act
    leftSubgraphSalsaIteration.runSingleIteration();
  }
}


