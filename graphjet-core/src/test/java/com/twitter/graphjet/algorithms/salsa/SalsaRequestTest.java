package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaRequestTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    int numRandomWalks = 11;
    int maxRandomWalkLength = 1;
    double resetProbability = 1.0;
    int maxNumResults = 1;
    int maxSocialProofSize = 1;
    int maxSocialProofTypeSize = 1;
    byte[] byteArray = new byte[24];
    byteArray[9] = 10;
    double queryNodeWeightFraction = 1.0;
    boolean removeCustomizedBitsNodes = true;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);

    // Act
    SalsaRequest salsaRequest = new SalsaRequest(queryNode, long2DoubleAVLTreeMap, longAVLTreeSet, numRandomWalks,
        maxRandomWalkLength, resetProbability, maxNumResults, maxSocialProofSize, maxSocialProofTypeSize, byteArray,
        queryNodeWeightFraction, removeCustomizedBitsNodes, resultFilterChain);

    // Assert
    Long2DoubleMap leftSeedNodesWithWeight = salsaRequest.getLeftSeedNodesWithWeight();
    int numRandomWalks1 = salsaRequest.getNumRandomWalks();
    int maxNumResults1 = salsaRequest.getMaxNumResults();
    int maxSocialProofTypeSize1 = salsaRequest.getMaxSocialProofTypeSize();
    LongSet toBeFiltered = salsaRequest.getToBeFiltered();
    int maxRandomWalkLength1 = salsaRequest.getMaxRandomWalkLength();
    double queryNodeWeightFraction1 = salsaRequest.getQueryNodeWeightFraction();
    byte[] socialProofTypes = salsaRequest.getSocialProofTypes();
    double resetProbability1 = salsaRequest.getResetProbability();
    int maxSocialProofSize1 = salsaRequest.getMaxSocialProofSize();
    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
    assertEquals(1L, salsaRequest.getQueryNode());
    assertEquals(1, maxSocialProofSize1);
    assertEquals(1.0, resetProbability1, 0.0);
    assertEquals(24, socialProofTypes.length);
    assertEquals(1.0, queryNodeWeightFraction1, 0.0);
    assertEquals(1, maxRandomWalkLength1);
    assertSame(longAVLTreeSet, toBeFiltered);
    assertEquals(1, maxSocialProofTypeSize1);
    assertEquals(1, maxNumResults1);
    assertEquals(11, numRandomWalks1);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));
    Long result = Long.getLong("aaaaa");
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaRequest.filterResult(result, socialProofs);
  }

  @Test
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    Long2DoubleMap actual = salsaRequest.getLeftSeedNodesWithWeight();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = salsaRequest.getMaxNumResults();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxRandomWalkLengthTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = salsaRequest.getMaxRandomWalkLength();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = salsaRequest.getMaxSocialProofSize();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getMaxSocialProofTypeSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = salsaRequest.getMaxSocialProofTypeSize();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getNumRandomWalksTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    int actual = salsaRequest.getNumRandomWalks();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getQueryNodeWeightFractionTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    double actual = salsaRequest.getQueryNodeWeightFraction();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void getResetProbabilityTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    double actual = salsaRequest.getResetProbability();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void removeCustomizedBitsNodesTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    boolean actual = salsaRequest.removeCustomizedBitsNodes();

    // Assert
    assertTrue(actual);
  }

  @Test
  public void resetFiltersTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    byte[] byteArray = new byte[24];
    byteArray[6] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1.0, 1, 1, 1,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaRequest.resetFilters();
  }
}











