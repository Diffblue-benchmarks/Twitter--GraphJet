package com.twitter.graphjet.algorithms.counting.user;

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

public class TopSecondDegreeByCountRequestForUserDiffblueTest {
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
    TopSecondDegreeByCountRequestForUser actualTopSecondDegreeByCountRequestForUser = new TopSecondDegreeByCountRequestForUser(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null));

    // Assert
    int actualMaxNumResults = actualTopSecondDegreeByCountRequestForUser.getMaxNumResults();
    int actualMaxNumSocialProofs = actualTopSecondDegreeByCountRequestForUser.getMaxNumSocialProofs();
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualTopSecondDegreeByCountRequestForUser
        .getLeftSeedNodesWithWeight();
    RecommendationType actualRecommendationType = actualTopSecondDegreeByCountRequestForUser.getRecommendationType();
    int actualMaxSocialProofTypeSize = actualTopSecondDegreeByCountRequestForUser.getMaxSocialProofTypeSize();
    long actualMaxRightNodeAgeInMillis = actualTopSecondDegreeByCountRequestForUser.getMaxRightNodeAgeInMillis();
    LongSet actualToBeFiltered = actualTopSecondDegreeByCountRequestForUser.getToBeFiltered();
    Map<Byte, Integer> actualMinUserPerSocialProof = actualTopSecondDegreeByCountRequestForUser
        .getMinUserPerSocialProof();
    byte[] socialProofTypes = actualTopSecondDegreeByCountRequestForUser.getSocialProofTypes();
    long actualMaxEdgeAgeInMillis = actualTopSecondDegreeByCountRequestForUser.getMaxEdgeAgeInMillis();
    assertEquals(3, actualMaxNumResults);
    assertEquals(1L, actualTopSecondDegreeByCountRequestForUser.getQueryNode());
    assertEquals(1L, actualMaxEdgeAgeInMillis);
    assertEquals(24, socialProofTypes.length);
    assertNull(actualMinUserPerSocialProof);
    assertSame(longAVLTreeSet, actualToBeFiltered);
    assertEquals(1L, actualMaxRightNodeAgeInMillis);
    assertEquals(3, actualMaxSocialProofTypeSize);
    assertEquals(RecommendationType.USER, actualRecommendationType);
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
    assertNull((new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null,
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
    assertEquals(RecommendationType.USER, (new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap,
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
    assertEquals(3, (new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null,
        byteArray, 1L, 1L, new ResultFilterChain(null))).getMaxNumSocialProofs());
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
    assertEquals(3, (new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null,
        byteArray, 1L, 1L, new ResultFilterChain(null))).getMaxNumResults());
  }
}

