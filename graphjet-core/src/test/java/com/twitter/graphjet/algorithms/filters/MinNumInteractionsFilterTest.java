package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MinNumInteractionsFilterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    int minNumInteractions = 1;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new MinNumInteractionsFilter(bipartiteGraph, minNumInteractions, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    MinNumInteractionsFilter minNumInteractionsFilter = new MinNumInteractionsFilter(null, 1,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[2] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 11, 1, 1, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap1 = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet1 = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap1 = new HashMap<Byte, Integer>();
    Byte resultByte1 = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap1).put(resultByte1, Integer.getInteger("aaaaa"));
    byte[] byteArray1 = new byte[24];
    byteArray1[7] = 10;
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap1,
        longAVLTreeSet1, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap1, byteArray1, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList1)));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    minNumInteractionsFilter.filterResult(resultNode, socialProofs);
  }

  @Test
  public void getStatsScopeTest() {
    // Arrange
    MinNumInteractionsFilter minNumInteractionsFilter = new MinNumInteractionsFilter(null, 1,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[2] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 11, 1, 1, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap1 = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet1 = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap1 = new HashMap<Byte, Integer>();
    Byte resultByte1 = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap1).put(resultByte1, Integer.getInteger("aaaaa"));
    byte[] byteArray1 = new byte[24];
    byteArray1[7] = 10;
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap1,
        longAVLTreeSet1, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap1, byteArray1, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList1)));

    // Act
    String actual = minNumInteractionsFilter.getStatsScope();

    // Assert
    assertEquals("MinNumInteractionsFilter", actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    MinNumInteractionsFilter minNumInteractionsFilter = new MinNumInteractionsFilter(null, 1,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[2] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 11, 1, 1, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap1 = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet1 = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap1 = new HashMap<Byte, Integer>();
    Byte resultByte1 = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap1).put(resultByte1, Integer.getInteger("aaaaa"));
    byte[] byteArray1 = new byte[24];
    byteArray1[7] = 10;
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    minNumInteractionsFilter.resetFilter(new TopSecondDegreeByCountRequestForMoment(1L, long2DoubleAVLTreeMap1,
        longAVLTreeSet1, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap1, byteArray1, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList1)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap2 = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet2 = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap2 = new HashMap<Byte, Integer>();
    Byte resultByte2 = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap2).put(resultByte2, Integer.getInteger("aaaaa"));
    byte[] byteArray2 = new byte[24];
    byteArray2[7] = 10;
    ArrayList<ResultFilter> arrayList2 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList2).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap2, longAVLTreeSet2, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap2, byteArray2, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList2));

    // Act
    minNumInteractionsFilter.resetFilter(request);
  }
}



