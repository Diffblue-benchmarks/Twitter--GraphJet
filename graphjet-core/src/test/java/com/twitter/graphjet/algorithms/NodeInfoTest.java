package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeInfoTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addToSocialProofTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    long socialProofId = 1L;
    byte edgeType = (byte) 0;
    long edgeMetadata = 1L;
    double socialProofWeight = 1.0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    nodeInfo.addToSocialProof(socialProofId, edgeType, edgeMetadata, socialProofWeight);
  }

  @Test
  public void addToWeightTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    double increment = 1.0;

    // Act
    nodeInfo.addToWeight(increment);

    // Assert
    assertEquals(2.0, nodeInfo.getWeight(), 0.0);
  }

  @Test
  public void compareToTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    NodeInfo otherNodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    int actual = nodeInfo.compareTo(otherNodeInfo);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    long nodeId = 1L;
    double weight = 1.0;
    int maxSocialProofTypeSize = 0;

    // Act
    NodeInfo nodeInfo = new NodeInfo(nodeId, weight, maxSocialProofTypeSize);

    // Assert
    int numVisits = nodeInfo.getNumVisits();
    long nodeId1 = nodeInfo.getNodeId();
    double weight1 = nodeInfo.getWeight();
    assertEquals(1, numVisits);
    assertEquals(0, nodeInfo.getSocialProofs().length);
    assertEquals(1.0, weight1, 0.0);
    assertEquals(1L, nodeId1);
  }

  @Test
  public void constructorTest2() {
    // Arrange
    long nodeId = 1L;
    int[][] nodeMetadata = new int[][]{new int[8], new int[8], new int[8]};
    double weight = 1.0;
    int maxSocialProofTypeSize = 0;

    // Act
    NodeInfo nodeInfo = new NodeInfo(nodeId, nodeMetadata, weight, maxSocialProofTypeSize);

    // Assert
    int numVisits = nodeInfo.getNumVisits();
    long nodeId1 = nodeInfo.getNodeId();
    double weight1 = nodeInfo.getWeight();
    assertEquals(1, numVisits);
    assertEquals(0, nodeInfo.getSocialProofs().length);
    assertEquals(1.0, weight1, 0.0);
    assertEquals(1L, nodeId1);
  }

  @Test
  public void equalsTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    String obj = "aaaaa";

    // Act
    boolean actual = nodeInfo.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getNodeIdTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    long actual = nodeInfo.getNodeId();

    // Assert
    assertEquals(1L, actual);
  }

  @Test
  public void getNodeMetadataTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    int nodeMetadataType = 0;

    // Act
    int[] actual = nodeInfo.getNodeMetadata(nodeMetadataType);

    // Assert
    assertEquals(1, actual.length);
  }

  @Test
  public void getNumVisitsTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    int actual = nodeInfo.getNumVisits();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getSocialProofsTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    SmallArrayBasedLongToDoubleMap[] actual = nodeInfo.getSocialProofs();

    // Assert
    assertEquals(0, actual.length);
  }

  @Test
  public void getWeightTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    double actual = nodeInfo.getWeight();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    int actual = nodeInfo.hashCode();

    // Assert
    assertEquals(1072694240, actual);
  }

  @Test
  public void setWeightTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    double weight = 1.0;

    // Act
    nodeInfo.setWeight(weight);

    // Assert
    assertEquals(1.0, nodeInfo.getWeight(), 0.0);
  }

  @Test
  public void toStringTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);

    // Act
    nodeInfo.toString();
  }
}













