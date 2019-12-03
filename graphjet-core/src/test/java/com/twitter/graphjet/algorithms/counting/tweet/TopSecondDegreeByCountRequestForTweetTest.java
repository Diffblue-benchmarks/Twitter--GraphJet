package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class TopSecondDegreeByCountRequestForTweetTest {
  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    int maxSocialProofTypeSize = 1;
    int maxUserSocialProofSize = 1;
    int maxTweetSocialProofSize = 1;
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[23] = 10;
    long maxRightNodeAgeInMillis = 1L;
    long maxEdgeAgeInMillis = 1L;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(byteArray);

    // Act
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        queryNode, long2DoubleAVLTreeMap, longAVLTreeSet, (Set<RecommendationType>) hashSet, hashMap,
        maxSocialProofTypeSize, maxUserSocialProofSize, maxTweetSocialProofSize, hashMap1, byteArray,
        maxRightNodeAgeInMillis, maxEdgeAgeInMillis, resultFilterChain, hashSet1);

    // Assert
    long maxRightNodeAgeInMillis1 = topSecondDegreeByCountRequestForTweet.getMaxRightNodeAgeInMillis();
    Set<byte[]> socialProofTypeUnions = topSecondDegreeByCountRequestForTweet.getSocialProofTypeUnions();
    Set<RecommendationType> recommendationTypes = topSecondDegreeByCountRequestForTweet.getRecommendationTypes();
    int maxUserSocialProofSize1 = topSecondDegreeByCountRequestForTweet.getMaxUserSocialProofSize();
    long maxEdgeAgeInMillis1 = topSecondDegreeByCountRequestForTweet.getMaxEdgeAgeInMillis();
    Long2DoubleMap leftSeedNodesWithWeight = topSecondDegreeByCountRequestForTweet.getLeftSeedNodesWithWeight();
    Map<RecommendationType, Integer> maxNumResultsByType = topSecondDegreeByCountRequestForTweet
        .getMaxNumResultsByType();
    int maxSocialProofTypeSize1 = topSecondDegreeByCountRequestForTweet.getMaxSocialProofTypeSize();
    LongSet toBeFiltered = topSecondDegreeByCountRequestForTweet.getToBeFiltered();
    int maxTweetSocialProofSize1 = topSecondDegreeByCountRequestForTweet.getMaxTweetSocialProofSize();
    byte[] socialProofTypes = topSecondDegreeByCountRequestForTweet.getSocialProofTypes();
    Map<RecommendationType, Integer> minUserSocialProofSizes = topSecondDegreeByCountRequestForTweet
        .getMinUserSocialProofSizes();
    assertEquals(1L, maxRightNodeAgeInMillis1);
    assertEquals(1L, topSecondDegreeByCountRequestForTweet.getQueryNode());
    assertSame(hashMap1, minUserSocialProofSizes);
    assertEquals(24, socialProofTypes.length);
    assertEquals(1, maxTweetSocialProofSize1);
    assertSame(longAVLTreeSet, toBeFiltered);
    assertEquals(1, maxSocialProofTypeSize1);
    assertSame(hashMap, maxNumResultsByType);
    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
    assertEquals(1L, maxEdgeAgeInMillis1);
    assertEquals(1, maxUserSocialProofSize1);
    assertSame(hashSet, recommendationTypes);
    assertSame(hashSet1, socialProofTypeUnions);
  }

  @Test
  public void getMaxNumResultsByTypeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 1, 1, 1,
        hashMap1, byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    Map<RecommendationType, Integer> actual = topSecondDegreeByCountRequestForTweet.getMaxNumResultsByType();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getMaxTweetSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 1, 1, 1,
        hashMap1, byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    int actual = topSecondDegreeByCountRequestForTweet.getMaxTweetSocialProofSize();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxUserSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 1, 1, 1,
        hashMap1, byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    int actual = topSecondDegreeByCountRequestForTweet.getMaxUserSocialProofSize();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMinUserSocialProofSizesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 1, 1, 1,
        hashMap1, byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    Map<RecommendationType, Integer> actual = topSecondDegreeByCountRequestForTweet.getMinUserSocialProofSizes();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getRecommendationTypesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (Set<RecommendationType>) hashSet, hashMap, 1, 1, 1, hashMap1,
        byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    Set<RecommendationType> actual = topSecondDegreeByCountRequestForTweet.getRecommendationTypes();

    // Assert
    assertEquals(1, actual.size());
    assertTrue(actual.contains(RecommendationType.HASHTAG));
  }

  @Test
  public void getSocialProofTypeUnionsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>(1, 1.0f);
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[15] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet topSecondDegreeByCountRequestForTweet = new TopSecondDegreeByCountRequestForTweet(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, (Set<RecommendationType>) hashSet, hashMap, 1, 1, 1, hashMap1,
        byteArray, 1L, 1L, resultFilterChain, hashSet1);

    // Act
    Set<byte[]> actual = topSecondDegreeByCountRequestForTweet.getSocialProofTypeUnions();

    // Assert
    assertEquals(1, actual.size());
  }
}






