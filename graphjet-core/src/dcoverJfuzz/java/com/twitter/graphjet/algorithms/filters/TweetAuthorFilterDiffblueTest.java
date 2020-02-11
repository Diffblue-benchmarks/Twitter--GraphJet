package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.junit.Test;

public class TweetAuthorFilterDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new LeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, edgeTypeMask, nullStatsReceiver);
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    LongAVLTreeSet longAVLTreeSet1 = new LongAVLTreeSet();
    longAVLTreeSet1.add(Long.valueOf(1L));

    // Act
    TweetAuthorFilter actualTweetAuthorFilter = new TweetAuthorFilter(leftIndexedBipartiteGraph, longAVLTreeSet,
        longAVLTreeSet1, nullStatsReceiver);

    // Assert
    assertSame(nullStatsReceiver, actualTweetAuthorFilter.scopedStatsReceiver);
    assertSame(actualTweetAuthorFilter.inputCounter, actualTweetAuthorFilter.filteredCounter);
  }

  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NullStatsReceiver nullStatsReceiver = new NullStatsReceiver();
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new LeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, edgeTypeMask, nullStatsReceiver);
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    LongAVLTreeSet longAVLTreeSet1 = new LongAVLTreeSet();
    longAVLTreeSet1.add(Long.valueOf(1L));
    TweetAuthorFilter tweetAuthorFilter = new TweetAuthorFilter(leftIndexedBipartiteGraph, longAVLTreeSet,
        longAVLTreeSet1, nullStatsReceiver);
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(tweetAuthorFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }
}

