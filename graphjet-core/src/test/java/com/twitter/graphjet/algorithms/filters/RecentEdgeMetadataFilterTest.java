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

public class RecentEdgeMetadataFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    long rejectWithInLastXMillis = 1L;
    byte socialProofType = (byte) 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new RecentEdgeMetadataFilter(rejectWithInLastXMillis, socialProofType, statsReceiver);
  }

  @Test
  public void filterResultTest() {
    // Arrange
    RecentEdgeMetadataFilter recentEdgeMetadataFilter = new RecentEdgeMetadataFilter(1L, (byte) 0,
        new DefaultStatsReceiver("aaaaa"));
    long resultNode = 1L;
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        null, new SmallArrayBasedLongToDoubleMap()};

    // Act
    boolean actual = recentEdgeMetadataFilter.filterResult(resultNode, socialProofs);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void resetFilterTest() {
    // Arrange
    RecentEdgeMetadataFilter recentEdgeMetadataFilter = new RecentEdgeMetadataFilter(1L, (byte) 0,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>(0, 1.0f);
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[13] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 0, 0, 0, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L,
        new ResultFilterChain((java.util.List<ResultFilter>) arrayList));

    // Act
    recentEdgeMetadataFilter.resetFilter(request);
  }
}


