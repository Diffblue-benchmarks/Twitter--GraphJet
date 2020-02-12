package com.twitter.graphjet.algorithms.counting.tweet;

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
import java.util.Set;
import org.junit.Test;

public class TopSecondDegreeByCountRequestForTweetDiffblueTest {
  @Test(timeout=10000)
  public void getMinUserSocialProofSizesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull((new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3, 3,
        3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getMinUserSocialProofSizes());
  }

  @Test(timeout=10000)
  public void getMaxUserSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3,
        3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getMaxUserSocialProofSize());
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
    TopSecondDegreeByCountRequestForTweet actualTopSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3, 3, 3, null, byteArray, 1L, 1L,
        new ResultFilterChain(null), null);

    // Assert
    long actualMaxRightNodeAgeInMillis = actualTopSecondDegreeByCountRequestForTweet.getMaxRightNodeAgeInMillis();
    Set<byte[]> actualSocialProofTypeUnions = actualTopSecondDegreeByCountRequestForTweet.getSocialProofTypeUnions();
    Set<RecommendationType> actualRecommendationTypes = actualTopSecondDegreeByCountRequestForTweet
        .getRecommendationTypes();
    int actualMaxUserSocialProofSize = actualTopSecondDegreeByCountRequestForTweet.getMaxUserSocialProofSize();
    long actualMaxEdgeAgeInMillis = actualTopSecondDegreeByCountRequestForTweet.getMaxEdgeAgeInMillis();
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualTopSecondDegreeByCountRequestForTweet
        .getLeftSeedNodesWithWeight();
    Map<RecommendationType, Integer> actualMaxNumResultsByType = actualTopSecondDegreeByCountRequestForTweet
        .getMaxNumResultsByType();
    int actualMaxSocialProofTypeSize = actualTopSecondDegreeByCountRequestForTweet.getMaxSocialProofTypeSize();
    LongSet actualToBeFiltered = actualTopSecondDegreeByCountRequestForTweet.getToBeFiltered();
    int actualMaxTweetSocialProofSize = actualTopSecondDegreeByCountRequestForTweet.getMaxTweetSocialProofSize();
    byte[] socialProofTypes = actualTopSecondDegreeByCountRequestForTweet.getSocialProofTypes();
    Map<RecommendationType, Integer> actualMinUserSocialProofSizes = actualTopSecondDegreeByCountRequestForTweet
        .getMinUserSocialProofSizes();
    assertEquals(1L, actualMaxRightNodeAgeInMillis);
    assertEquals(1L, actualTopSecondDegreeByCountRequestForTweet.getQueryNode());
    assertNull(actualMinUserSocialProofSizes);
    assertEquals(24, socialProofTypes.length);
    assertEquals(3, actualMaxTweetSocialProofSize);
    assertSame(longAVLTreeSet, actualToBeFiltered);
    assertEquals(3, actualMaxSocialProofTypeSize);
    assertNull(actualMaxNumResultsByType);
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(1L, actualMaxEdgeAgeInMillis);
    assertEquals(3, actualMaxUserSocialProofSize);
    assertNull(actualRecommendationTypes);
    assertNull(actualSocialProofTypeUnions);
  }

  @Test(timeout=10000)
  public void getRecommendationTypesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull((new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3, 3,
        3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getRecommendationTypes());
  }

  @Test(timeout=10000)
  public void getMaxTweetSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, (new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3,
        3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getMaxTweetSocialProofSize());
  }

  @Test(timeout=10000)
  public void getSocialProofTypeUnionsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull((new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3, 3,
        3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getSocialProofTypeUnions());
  }

  @Test(timeout=10000)
  public void getMaxNumResultsByTypeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull((new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null, null, 3, 3,
        3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null)).getMaxNumResultsByType());
  }
}

