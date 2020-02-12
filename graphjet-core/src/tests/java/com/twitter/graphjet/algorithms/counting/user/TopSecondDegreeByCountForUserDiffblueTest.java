package com.twitter.graphjet.algorithms.counting.user;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.Arrays;
import org.junit.Test;

public class TopSecondDegreeByCountForUserDiffblueTest {
  @Test(timeout=10000)
  public void isEdgeUpdateValidTest3() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask, new NullStatsReceiver());
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(
        leftIndexedBipartiteGraph, 1, new NullStatsReceiver());
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(topSecondDegreeByCountForUser.isEdgeUpdateValid(new TopSecondDegreeByCountRequestForUser(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null)), 1L,
        (byte) 1, 1L));
  }

  @Test(timeout=10000)
  public void isEdgeUpdateValidTest2() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask, new NullStatsReceiver());
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(
        leftIndexedBipartiteGraph, 1, new NullStatsReceiver());
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(topSecondDegreeByCountForUser.isEdgeUpdateValid(new TopSecondDegreeByCountRequestForUser(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3, null, byteArray, 1L, 1L, new ResultFilterChain(null)), 1L,
        (byte) 127, 1L));
  }

  @Test(timeout=10000)
  public void isEdgeUpdateValidTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = new NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph(
        3, 3, 10, 1, 10.0, 10, 10, edgeTypeMask, new NullStatsReceiver());
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(
        leftIndexedBipartiteGraph, 1, new NullStatsReceiver());
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertTrue(topSecondDegreeByCountForUser
        .isEdgeUpdateValid(new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 3, 3, 3,
            null, byteArray, 1L, 9223372036854775807L, new ResultFilterChain(null)), 1L, (byte) 1, 1L));
  }
}

