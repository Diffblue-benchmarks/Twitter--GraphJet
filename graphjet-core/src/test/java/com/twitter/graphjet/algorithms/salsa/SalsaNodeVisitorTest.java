package com.twitter.graphjet.algorithms.salsa;

import com.twitter.graphjet.algorithms.NodeInfo;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaNodeVisitorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void NodeVisitorWithSocialProofConstructorTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> visitedRightNodes = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");

    // Act
    new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) visitedRightNodes);
  }
  @Test
  public void NodeVisitorWithSocialProofVisitRightNodeTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");
    SalsaNodeVisitor.NodeVisitorWithSocialProof nodeVisitorWithSocialProof = new SalsaNodeVisitor.NodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);
    long leftNode = 1L;
    long rightNode = 2561L;
    byte edgeType = (byte) 0;
    long metadata = 1L;
    double weight = 1.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    nodeVisitorWithSocialProof.visitRightNode(leftNode, rightNode, edgeType, metadata, weight);
  }
  @Test
  public void SimpleNodeVisitorConstructorTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> visitedRightNodes = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");

    // Act
    new SalsaNodeVisitor.SimpleNodeVisitor((it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) visitedRightNodes);
  }
  @Test
  public void SimpleNodeVisitorVisitRightNodeTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");
    SalsaNodeVisitor.SimpleNodeVisitor simpleNodeVisitor = new SalsaNodeVisitor.SimpleNodeVisitor(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);
    long leftNode = 1L;
    long rightNode = 2561L;
    byte edgeType = (byte) 0;
    long metadata = 1L;
    double weight = 1.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    simpleNodeVisitor.visitRightNode(leftNode, rightNode, edgeType, metadata, weight);
  }
  @Test
  public void WeightedNodeVisitorConstructorTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> visitedRightNodes = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");

    // Act
    new SalsaNodeVisitor.WeightedNodeVisitor((it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) visitedRightNodes);
  }
  @Test
  public void WeightedNodeVisitorVisitRightNodeTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");
    SalsaNodeVisitor.WeightedNodeVisitor weightedNodeVisitor = new SalsaNodeVisitor.WeightedNodeVisitor(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);
    long leftNode = 1L;
    long rightNode = 167772161L;
    byte edgeType = (byte) 0;
    long metadata = 1L;
    double weight = 1.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    weightedNodeVisitor.visitRightNode(leftNode, rightNode, edgeType, metadata, weight);
  }
  @Test
  public void WeightedNodeVisitorWithSocialProofConstructorTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> visitedRightNodes = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");

    // Act
    new SalsaNodeVisitor.WeightedNodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) visitedRightNodes);
  }
  @Test
  public void WeightedNodeVisitorWithSocialProofVisitRightNodeTest() {
    // Arrange
    Long2ObjectAVLTreeMap<NodeInfo> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<NodeInfo>();
    Long.getLong("aaaaa");
    SalsaNodeVisitor.WeightedNodeVisitorWithSocialProof weightedNodeVisitorWithSocialProof = new SalsaNodeVisitor.WeightedNodeVisitorWithSocialProof(
        (it.unimi.dsi.fastutil.longs.Long2ObjectMap<NodeInfo>) long2ObjectAVLTreeMap);
    long leftNode = 1L;
    long rightNode = 2561L;
    byte edgeType = (byte) 0;
    long metadata = 1L;
    double weight = 1.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    weightedNodeVisitorWithSocialProof.visitRightNode(leftNode, rightNode, edgeType, metadata, weight);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    new SalsaNodeVisitor();
  }
}








