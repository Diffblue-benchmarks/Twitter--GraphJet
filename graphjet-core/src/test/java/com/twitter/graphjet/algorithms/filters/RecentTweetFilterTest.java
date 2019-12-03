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

public class RecentTweetFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    long keepWithInLastXMillis = 1L;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new RecentTweetFilter(keepWithInLastXMillis, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    RecentTweetFilter recentTweetFilter = new RecentTweetFilter(1L, new DefaultStatsReceiver("aaaaa"));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act
    boolean actual = recentTweetFilter.filterResult(resultNode, socialProofs);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void originalTimeStampFromTweetIdTest() {
    // Arrange
    long id = 1L;

    // Act
    long actual = RecentTweetFilter.originalTimeStampFromTweetId(id);

    // Assert
    assertEquals(1288834974657L, actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    RecentTweetFilter recentTweetFilter = new RecentTweetFilter(1L, new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[11] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 2561, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    recentTweetFilter.resetFilter(request);
  }

  @Test
  public void timeStampFromTweetIdTest() {
    // Arrange
    long id = 1L;

    // Act
    long actual = RecentTweetFilter.timeStampFromTweetId(id);

    // Assert
    assertEquals(1288834974657L, actual);
  }
}




