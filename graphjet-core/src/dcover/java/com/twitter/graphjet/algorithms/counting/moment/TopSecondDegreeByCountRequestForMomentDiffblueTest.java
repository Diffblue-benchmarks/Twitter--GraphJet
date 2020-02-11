package com.twitter.graphjet.algorithms.counting.moment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;
import java.util.Map;
import org.junit.Test;

public class TopSecondDegreeByCountRequestForMomentDiffblueTest {
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
    TopSecondDegreeByCountRequestForMoment actualTopSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null));

    // Assert
    int actualMaxNumResults = actualTopSecondDegreeByCountRequestForMoment.getMaxNumResults();
    int actualMaxNumSocialProofs = actualTopSecondDegreeByCountRequestForMoment.getMaxNumSocialProofs();
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualTopSecondDegreeByCountRequestForMoment
        .getLeftSeedNodesWithWeight();
    RecommendationType actualRecommendationType = actualTopSecondDegreeByCountRequestForMoment.getRecommendationType();
    int actualMaxSocialProofTypeSize = actualTopSecondDegreeByCountRequestForMoment.getMaxSocialProofTypeSize();
    long actualMaxRightNodeAgeInMillis = actualTopSecondDegreeByCountRequestForMoment.getMaxRightNodeAgeInMillis();
    LongSet actualToBeFiltered = actualTopSecondDegreeByCountRequestForMoment.getToBeFiltered();
    Map<Byte, Integer> actualMinUserPerSocialProof = actualTopSecondDegreeByCountRequestForMoment
        .getMinUserPerSocialProof();
    byte[] socialProofTypes = actualTopSecondDegreeByCountRequestForMoment.getSocialProofTypes();
    long actualMaxEdgeAgeInMillis = actualTopSecondDegreeByCountRequestForMoment.getMaxEdgeAgeInMillis();
    assertEquals(3, actualMaxNumResults);
    assertEquals(1L, actualTopSecondDegreeByCountRequestForMoment.getQueryNode());
    assertEquals(1L, actualMaxEdgeAgeInMillis);
    assertEquals(24, socialProofTypes.length);
    assertNull(actualMinUserPerSocialProof);
    assertSame(longAVLTreeSet, actualToBeFiltered);
    assertEquals(1L, actualMaxRightNodeAgeInMillis);
    assertEquals(3, actualMaxSocialProofTypeSize);
    assertEquals(RecommendationType.MOMENT, actualRecommendationType);
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(3, actualMaxNumSocialProofs);
  }

  @Test(timeout=10000)
  public void getMinUserPerSocialProofTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull((new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null,
        byteArray, 1L, 1L, new ResultFilterChain(null))).getMinUserPerSocialProof());
  }

  @Test(timeout=10000)
  public void getRecommendationTypeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(RecommendationType.MOMENT, (new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null))).getRecommendationType());
  }

  @Test(timeout=10000)
  public void getMaxNumSocialProofsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3,
        null, byteArray, 1L, 1L, new ResultFilterChain(null))).getMaxNumSocialProofs());
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
    assertEquals(3, (new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3,
        null, byteArray, 1L, 1L, new ResultFilterChain(null))).getMaxNumResults());
  }
}

