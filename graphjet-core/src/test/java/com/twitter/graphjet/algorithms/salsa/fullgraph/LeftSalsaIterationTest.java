package com.twitter.graphjet.algorithms.salsa.fullgraph;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.algorithms.salsa.SalsaRequest;
import com.twitter.graphjet.algorithms.salsa.SalsaStats;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LeftSalsaIterationTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 0);
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("akaaa");
    SalsaNodeVisitor.NodeVisitorWithSocialProof nodeVisitor = new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);

    // Act
    new LeftSalsaIteration(salsaInternalState, nodeVisitor);
  }
  @Test
  public void constructorTest2() {
    // Arrange
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 0);

    // Act
    new LeftSalsaIteration(salsaInternalState);
  }
  @Test
  public void resetWithRequestTest() {
    // Arrange
    LeftSalsaIteration leftSalsaIteration = new LeftSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0));
    SalsaRequest salsaRequest = null;
    Random newRandom = new Random();

    // Act
    leftSalsaIteration.resetWithRequest(salsaRequest, newRandom);
  }
  @Test
  public void runSingleIterationTest() {
    // Arrange
    LeftSalsaIteration leftSalsaIteration = new LeftSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    leftSalsaIteration.runSingleIteration();
  }
}



