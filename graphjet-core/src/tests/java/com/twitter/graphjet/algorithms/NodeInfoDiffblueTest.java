package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getSocialProofsTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new NodeInfo(123L, 10.0, 3)).getSocialProofs().length);
  }

  @Test(timeout=10000)
  public void getNodeMetadataTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new NodeInfo(123L, 10.0, 3)).getNodeMetadata(1);
  }

  @Test(timeout=10000)
  public void addToWeightTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(123L, 10.0, 3);

    // Act
    nodeInfo.addToWeight(10.0);

    // Assert
    int actualNumVisits = nodeInfo.getNumVisits();
    assertEquals(2, actualNumVisits);
    assertEquals(20.0, nodeInfo.getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void setWeightTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(123L, 10.0, 3);

    // Act
    nodeInfo.setWeight(10.0);

    // Assert
    assertEquals(10.0, nodeInfo.getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(123L, 10.0, 3);

    // Act and Assert
    assertEquals(0, nodeInfo.compareTo(new NodeInfo(123L, 10.0, 3)));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    NodeInfo actualNodeInfo = new NodeInfo(123L, 10.0, 3);

    // Assert
    int actualNumVisits = actualNodeInfo.getNumVisits();
    long actualNodeId = actualNodeInfo.getNodeId();
    double actualWeight = actualNodeInfo.getWeight();
    assertEquals(1, actualNumVisits);
    assertEquals(3, actualNodeInfo.getSocialProofs().length);
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(123L, actualNodeId);
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new NodeInfo(123L, 10.0, 3)).getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void getNumVisitsTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new NodeInfo(123L, 10.0, 3)).getNumVisits());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new NodeInfo(123L, 10.0, 3)).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    int[] intArray2 = new int[8];
    Arrays.fill(intArray2, 1);

    // Act
    NodeInfo actualNodeInfo = new NodeInfo(123L, new int[][]{intArray, intArray1, intArray2}, 10.0, 3);

    // Assert
    int actualNumVisits = actualNodeInfo.getNumVisits();
    long actualNodeId = actualNodeInfo.getNodeId();
    double actualWeight = actualNodeInfo.getWeight();
    assertEquals(1, actualNumVisits);
    assertEquals(3, actualNodeInfo.getSocialProofs().length);
    assertEquals(10.0, actualWeight, 0.0);
    assertEquals(123L, actualNodeId);
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1076105894, (new NodeInfo(123L, 10.0, 3)).hashCode());
  }

  @Test(timeout=10000)
  public void addToSocialProofTest() {
    // Arrange
    NodeInfo nodeInfo = new NodeInfo(123L, 10.0, 3);

    // Act and Assert
    assertTrue(nodeInfo.addToSocialProof(123L, (byte) 1, 1L, 10.0));
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = nodeInfo.getSocialProofs()[1];
    long[] metadataResult = smallArrayBasedLongToDoubleMap.metadata();
    long[] keysResult = smallArrayBasedLongToDoubleMap.keys();
    assertEquals(4, keysResult.length);
    assertEquals(4, metadataResult.length);
    assertEquals(1, smallArrayBasedLongToDoubleMap.size());
  }

  @Test(timeout=10000)
  public void getNodeIdTest() {
    // Arrange, Act and Assert
    assertEquals(123L, (new NodeInfo(123L, 10.0, 3)).getNodeId());
  }
}

