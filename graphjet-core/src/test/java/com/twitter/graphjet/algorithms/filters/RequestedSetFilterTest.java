package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class RequestedSetFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new RequestedSetFilter(statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    RequestedSetFilter requestedSetFilter = new RequestedSetFilter(new DefaultStatsReceiver("aaaaa"));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act
    boolean actual = requestedSetFilter.filterResult(resultNode, socialProofs);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getStatsScopeTest() {
    // Arrange
    RequestedSetFilter requestedSetFilter = new RequestedSetFilter(new DefaultStatsReceiver("aaaaa"));

    // Act
    String actual = requestedSetFilter.getStatsScope();

    // Assert
    assertEquals("RequestedSetFilter", actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    RequestedSetFilter requestedSetFilter = new RequestedSetFilter(new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aakaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) null, new byte[24], 1L, 2561L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    requestedSetFilter.resetFilter(request);
  }
}



