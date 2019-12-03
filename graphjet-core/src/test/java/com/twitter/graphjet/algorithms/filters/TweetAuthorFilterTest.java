package com.twitter.graphjet.algorithms.filters;

import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.junit.Test;

public class TweetAuthorFilterTest {
  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("blacklist_filtered");
    LeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;
    LongAVLTreeSet whitelistTweetAuthors = new LongAVLTreeSet();
    Long.getLong("blacklist_filtered");

    // Act
    new TweetAuthorFilter(leftIndexedBipartiteGraph, whitelistTweetAuthors, whitelistTweetAuthors, statsReceiver);
  }
}
