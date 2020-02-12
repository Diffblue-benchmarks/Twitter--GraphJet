package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.Arrays;
import org.junit.Test;

public class TopSecondDegreeByCountForTweetDiffblueTest {
  @Test(timeout=10000)
  public void isEdgeUpdateValidTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask, new NullStatsReceiver());
    TopSecondDegreeByCountForTweet topSecondDegreeByCountForTweet = new TopSecondDegreeByCountForTweet(
        leftIndexedBipartiteGraph, 1, new NullStatsReceiver());
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(topSecondDegreeByCountForTweet
        .isEdgeUpdateValid(new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap, longAVLTreeSet, null,
            null, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null), null), 1L, (byte) 1, 1L));
  }
}

