package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class SalsaRequestBuilderDiffblueTest {
  @Test(timeout=10000)
  public void withMaxSocialProofTypeSizeTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withMaxSocialProofTypeSize(3));
  }

  @Test(timeout=10000)
  public void removeNegativeNodesTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.removeNegativeNodes(true));
  }

  @Test(timeout=10000)
  public void withLeftSeedNodesTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withLeftSeedNodes(long2DoubleAVLTreeMap));
  }

  @Test(timeout=10000)
  public void withNumRandomWalksTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withNumRandomWalks(10));
  }

  @Test(timeout=10000)
  public void buildTest() {
    // Arrange and Act
    SalsaRequest actualBuildResult = (new SalsaRequestBuilder(1L)).build();

    // Assert
    Long2DoubleMap leftSeedNodesWithWeight = actualBuildResult.getLeftSeedNodesWithWeight();
    int actualNumRandomWalks = actualBuildResult.getNumRandomWalks();
    int actualMaxNumResults = actualBuildResult.getMaxNumResults();
    int actualMaxSocialProofTypeSize = actualBuildResult.getMaxSocialProofTypeSize();
    LongSet toBeFiltered = actualBuildResult.getToBeFiltered();
    int actualMaxRandomWalkLength = actualBuildResult.getMaxRandomWalkLength();
    double actualQueryNodeWeightFraction = actualBuildResult.getQueryNodeWeightFraction();
    byte[] socialProofTypes = actualBuildResult.getSocialProofTypes();
    double actualResetProbability = actualBuildResult.getResetProbability();
    int actualMaxSocialProofSize = actualBuildResult.getMaxSocialProofSize();
    assertTrue(leftSeedNodesWithWeight instanceof it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap);
    assertEquals(1L, actualBuildResult.getQueryNode());
    assertEquals(0, actualMaxSocialProofSize);
    assertEquals(0.3, actualResetProbability, 0.0);
    assertEquals(1, socialProofTypes.length);
    assertEquals(0.9, actualQueryNodeWeightFraction, 0.0);
    assertEquals(1, actualMaxRandomWalkLength);
    assertTrue(toBeFiltered instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertEquals(1, actualMaxSocialProofTypeSize);
    assertEquals(10, actualMaxNumResults);
    assertEquals(1, actualNumRandomWalks);
  }

  @Test(timeout=10000)
  public void withToBeFilteredTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withToBeFiltered(longAVLTreeSet));
  }

  @Test(timeout=10000)
  public void withMaxNumResultsTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withMaxNumResults(10));
  }

  @Test(timeout=10000)
  public void withMaxSocialProofSizeTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withMaxSocialProofSize(3));
  }

  @Test(timeout=10000)
  public void withMaxRandomWalkLengthTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withMaxRandomWalkLength(3));
  }

  @Test(timeout=10000)
  public void withQueryNodeWeightFractionTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withQueryNodeWeightFraction(10.0));
  }

  @Test(timeout=10000)
  public void withResetProbabilityTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act and Assert
    assertSame(salsaRequestBuilder, salsaRequestBuilder.withResetProbability(0.25));
  }
}

