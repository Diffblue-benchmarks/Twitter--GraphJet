package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DirectInteractionsFilterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph = null;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new DirectInteractionsFilter(bipartiteGraph, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    DirectInteractionsFilter directInteractionsFilter = new DirectInteractionsFilter(null,
        new DefaultStatsReceiver("aaaaa"));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{null,
        smallArrayBasedLongToDoubleMap, new SmallArrayBasedLongToDoubleMap()};

    // Act
    boolean actual = directInteractionsFilter.filterResult(resultNode, socialProofs);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getStatsScopeTest() {
    // Arrange
    DirectInteractionsFilter directInteractionsFilter = new DirectInteractionsFilter(null,
        new DefaultStatsReceiver("aaaaa"));

    // Act
    String actual = directInteractionsFilter.getStatsScope();

    // Assert
    assertEquals("DirectInteractionsFilter", actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    DirectInteractionsFilter directInteractionsFilter = new DirectInteractionsFilter(null,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[12] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 655361, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    directInteractionsFilter.resetFilter(request);
  }
}



