package com.twitter.graphjet.algorithms.counting.moment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
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
import java.util.Map;
import org.junit.Test;

public class TopSecondDegreeByCountRequestForMomentTest {
  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    int maxNumResults = 11;
    int maxNumSocialProofs = 1;
    int maxSocialProofTypeSize = 1;
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[2] = 10;
    long maxRightNodeAgeInMillis = 1L;
    long maxEdgeAgeInMillis = 1L;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);

    // Act
    TopSecondDegreeByCountRequestForMoment topSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        queryNode, long2DoubleAVLTreeMap, longAVLTreeSet, maxNumResults, maxNumSocialProofs, maxSocialProofTypeSize,
        (Map<Byte, Integer>) hashMap, byteArray, maxRightNodeAgeInMillis, maxEdgeAgeInMillis, resultFilterChain);

    // Assert
    int maxNumResults1 = topSecondDegreeByCountRequestForMoment.getMaxNumResults();
    int maxNumSocialProofs1 = topSecondDegreeByCountRequestForMoment.getMaxNumSocialProofs();
    Long2DoubleMap leftSeedNodesWithWeight = topSecondDegreeByCountRequestForMoment.getLeftSeedNodesWithWeight();
    RecommendationType recommendationType = topSecondDegreeByCountRequestForMoment.getRecommendationType();
    int maxSocialProofTypeSize1 = topSecondDegreeByCountRequestForMoment.getMaxSocialProofTypeSize();
    long maxRightNodeAgeInMillis1 = topSecondDegreeByCountRequestForMoment.getMaxRightNodeAgeInMillis();
    LongSet toBeFiltered = topSecondDegreeByCountRequestForMoment.getToBeFiltered();
    Map<Byte, Integer> minUserPerSocialProof = topSecondDegreeByCountRequestForMoment.getMinUserPerSocialProof();
    byte[] socialProofTypes = topSecondDegreeByCountRequestForMoment.getSocialProofTypes();
    long maxEdgeAgeInMillis1 = topSecondDegreeByCountRequestForMoment.getMaxEdgeAgeInMillis();
    assertEquals(11, maxNumResults1);
    assertEquals(1L, topSecondDegreeByCountRequestForMoment.getQueryNode());
    assertEquals(1L, maxEdgeAgeInMillis1);
    assertEquals(24, socialProofTypes.length);
    assertSame(hashMap, minUserPerSocialProof);
    assertSame(longAVLTreeSet, toBeFiltered);
    assertEquals(1L, maxRightNodeAgeInMillis1);
    assertEquals(1, maxSocialProofTypeSize1);
    assertEquals(RecommendationType.MOMENT, recommendationType);
    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
    assertEquals(1, maxNumSocialProofs1);
  }

  @Test
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment topSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, new byte[21], 1L,
        1L, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = topSecondDegreeByCountRequestForMoment.getMaxNumResults();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxNumSocialProofsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment topSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, new byte[21], 1L,
        1L, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = topSecondDegreeByCountRequestForMoment.getMaxNumSocialProofs();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMinUserPerSocialProofTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment topSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (Map<Byte, Integer>) hashMap, new byte[21], 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    Map<Byte, Integer> actual = topSecondDegreeByCountRequestForMoment.getMinUserPerSocialProof();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getRecommendationTypeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment topSecondDegreeByCountRequestForMoment = new TopSecondDegreeByCountRequestForMoment(
        1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, new byte[21], 1L,
        1L, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    RecommendationType actual = topSecondDegreeByCountRequestForMoment.getRecommendationType();

    // Assert
    assertEquals(RecommendationType.MOMENT, actual);
  }
}




