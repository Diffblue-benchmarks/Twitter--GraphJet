package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class TweetCardFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    boolean tweet = true;
    boolean summary = true;
    boolean photo = true;
    boolean player = true;
    boolean promotion = true;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new TweetCardFilter(tweet, summary, photo, player, promotion, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    TweetCardFilter tweetCardFilter = new TweetCardFilter(true, true, true, true, true,
        new DefaultStatsReceiver("aaaaa"));
    long resultNode = -9223372036854775808L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    smallArrayBasedLongToDoubleMap1.trim(0);
    smallArrayBasedLongToDoubleMap1.trim(0);
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act
    boolean actual = tweetCardFilter.filterResult(resultNode, socialProofs);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    TweetCardFilter tweetCardFilter = new TweetCardFilter(true, true, true, true, true,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaaaaaaaaaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[8] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(-9223372036854775808L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 0, 0, 0, (java.util.Map<Byte, Integer>) hashMap, byteArray,
        -9223372036854775808L, -9223372036854775808L, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    tweetCardFilter.resetFilter(request);
  }
}


