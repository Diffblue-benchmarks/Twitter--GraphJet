package com.twitter.graphjet.algorithms.filters;

import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultFilterChainTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));

    // Act
    new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    long node = 167772161L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    resultFilterChain.filterResult(node, socialProofs);
  }

  @Test
  public void resetFiltersTest() {
    // Arrange
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaak");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[1] = 10;
    ArrayList<ResultFilter> arrayList2 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList2).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList2));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    resultFilterChain.resetFilters(request);
  }
}


