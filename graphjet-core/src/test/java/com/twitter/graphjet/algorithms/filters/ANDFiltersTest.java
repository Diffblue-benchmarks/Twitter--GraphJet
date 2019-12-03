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

public class ANDFiltersTest {
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
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new ANDFilters((java.util.List<ResultFilter>) arrayList, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaaa")));
    ANDFilters aNDFilters = new ANDFilters((java.util.List<ResultFilter>) arrayList, new DefaultStatsReceiver("aaaaa"));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    aNDFilters.filterResult(resultNode, socialProofs);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, defaultStatsReceiver));
    ANDFilters aNDFilters = new ANDFilters((java.util.List<ResultFilter>) arrayList, new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[19] = 10;
    ArrayList<ResultFilter> arrayList2 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList2)
        .add(new ANDFilters((java.util.List<ResultFilter>) null, defaultStatsReceiver));
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList2));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    aNDFilters.resetFilter(request);
  }
}


