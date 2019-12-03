package com.twitter.graphjet.algorithms.counting.user;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.counting.TopSecondDegreeByCountResponse;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.bipartite.ChronologicalMultiSegmentIterator;
import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TopSecondDegreeByCountForUserTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;
    int expectedNodesToHit = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new TopSecondDegreeByCountForUser(leftIndexedBipartiteGraph, expectedNodesToHit, statsReceiver);
  }
  @Test
  public void generateRecommendationFromNodeInfoTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("akaaa");
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(null, 0,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaaaaaaaaaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("akaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[13] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) null, defaultStatsReceiver));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    ((HashMap<Byte, Integer>) new HashMap<Byte, Integer>()).put(null, null);
    TopSecondDegreeByCountRequestForUser request = new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 0, 0, 0, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L, resultFilterChain);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    topSecondDegreeByCountForUser.generateRecommendationFromNodeInfo(request);
  }
  @Test
  public void isEdgeUpdateValidTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("akaaa");
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(null, 0,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaaaaaaaaaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("akaaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    byte[] byteArray = new byte[24];
    byteArray[13] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) null, defaultStatsReceiver));
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    ((HashMap<Byte, Integer>) new HashMap<Byte, Integer>()).put(null, null);
    TopSecondDegreeByCountRequestForUser request = new TopSecondDegreeByCountRequestForUser(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, 0, 0, 0, (java.util.Map<Byte, Integer>) hashMap, byteArray, 1L, 1L, resultFilterChain);
    long rightNode = 1L;
    byte edgeType = (byte) 0;
    long edgeMetadata = 1L;

    // Act
    boolean actual = topSecondDegreeByCountForUser.isEdgeUpdateValid(request, rightNode, edgeType, edgeMetadata);

    // Assert
    assertFalse(actual);
  }
  @Test
  public void updateNodeInfoTest() {
    // Arrange
    TopSecondDegreeByCountForUser topSecondDegreeByCountForUser = new TopSecondDegreeByCountForUser(null, 0,
        new DefaultStatsReceiver("aaaaa"));
    long leftNode = 1L;
    long rightNode = 1L;
    byte edgeType = (byte) 0;
    long edgeMetadata = 1L;
    double weight = 1.0;
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    Integer.getInteger("aaaaa");
    Integer.getInteger("aaaaa");
    ChronologicalMultiSegmentIterator<LeftIndexedBipartiteGraphSegment> edgeIterator = null;
    int maxSocialProofTypeSize = 0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    topSecondDegreeByCountForUser.updateNodeInfo(leftNode, rightNode, edgeType, edgeMetadata, weight, edgeIterator,
        maxSocialProofTypeSize);
  }
}



