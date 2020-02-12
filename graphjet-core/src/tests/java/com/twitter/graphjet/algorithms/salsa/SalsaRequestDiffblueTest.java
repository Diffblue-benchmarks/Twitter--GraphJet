package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;
import org.junit.Test;

public class SalsaRequestDiffblueTest {
  @Test(timeout=10000)
  public void getMaxSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0,
        true, new ResultFilterChain(null))).getMaxSocialProofSize());
  }

  @Test(timeout=10000)
  public void getResetProbabilityTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(0.25, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray,
        10.0, true, new ResultFilterChain(null))).getResetProbability(), 0.0);
  }

  @Test(timeout=10000)
  public void getQueryNodeWeightFractionTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(10.0, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray,
        10.0, true, new ResultFilterChain(null))).getQueryNodeWeightFraction(), 0.0);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    SalsaRequest actualSalsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3,
        byteArray, 10.0, true, new ResultFilterChain(null));

    // Assert
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualSalsaRequest.getLeftSeedNodesWithWeight();
    int actualNumRandomWalks = actualSalsaRequest.getNumRandomWalks();
    int actualMaxNumResults = actualSalsaRequest.getMaxNumResults();
    int actualMaxSocialProofTypeSize = actualSalsaRequest.getMaxSocialProofTypeSize();
    LongSet actualToBeFiltered = actualSalsaRequest.getToBeFiltered();
    int actualMaxRandomWalkLength = actualSalsaRequest.getMaxRandomWalkLength();
    double actualQueryNodeWeightFraction = actualSalsaRequest.getQueryNodeWeightFraction();
    byte[] socialProofTypes = actualSalsaRequest.getSocialProofTypes();
    double actualResetProbability = actualSalsaRequest.getResetProbability();
    int actualMaxSocialProofSize = actualSalsaRequest.getMaxSocialProofSize();
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(1L, actualSalsaRequest.getQueryNode());
    assertEquals(3, actualMaxSocialProofSize);
    assertEquals(0.25, actualResetProbability, 0.0);
    assertEquals(24, socialProofTypes.length);
    assertEquals(10.0, actualQueryNodeWeightFraction, 0.0);
    assertEquals(3, actualMaxRandomWalkLength);
    assertSame(longAVLTreeSet, actualToBeFiltered);
    assertEquals(3, actualMaxSocialProofTypeSize);
    assertEquals(3, actualMaxNumResults);
    assertEquals(10, actualNumRandomWalks);
  }

  @Test(timeout=10000)
  public void getMaxRandomWalkLengthTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0,
        true, new ResultFilterChain(null))).getMaxRandomWalkLength());
  }

  @Test(timeout=10000)
  public void getMaxSocialProofTypeSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0,
        true, new ResultFilterChain(null))).getMaxSocialProofTypeSize());
  }

  @Test(timeout=10000)
  public void removeCustomizedBitsNodesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertTrue((new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0, true,
        new ResultFilterChain(null))).removeCustomizedBitsNodes());
  }

  @Test(timeout=10000)
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0,
        true, new ResultFilterChain(null))).getMaxNumResults());
  }

  @Test(timeout=10000)
  public void getNumRandomWalksTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(10, (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3, 0.25, 3, 3, 3, byteArray, 10.0,
        true, new ResultFilterChain(null))).getNumRandomWalks());
  }

  @Test(timeout=10000)
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    Long2DoubleMap actualLeftSeedNodesWithWeight = (new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 10, 3,
        0.25, 3, 3, 3, byteArray, 10.0, true, new ResultFilterChain(null))).getLeftSeedNodesWithWeight();

    // Assert
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(1, actualLeftSeedNodesWithWeight.size());
    assertEquals(Double.valueOf(10.0), actualLeftSeedNodesWithWeight.get(Long.valueOf(1L)));
  }
}

