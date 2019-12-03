package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.counting.TopSecondDegreeByCountResponse;
import com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.bipartite.ChronologicalMultiSegmentIterator;
import com.twitter.graphjet.bipartite.RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TopSecondDegreeByCountForTweetTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    RightNodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = null;
    int expectedNodesToHit = 0;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new TopSecondDegreeByCountForTweet(leftIndexedBipartiteGraph, expectedNodesToHit, statsReceiver);
  }

  @Test
  public void generateRecommendationFromNodeInfoTest() {
    // Arrange
    TopSecondDegreeByCountForTweet topSecondDegreeByCountForTweet = new TopSecondDegreeByCountForTweet(null, 0,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaaaaaaaaaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("akaaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("akaaa"));
    byte[] byteArray = new byte[24];
    byteArray[17] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>(0, 1.0f);
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, null, 0, 0, 0, hashMap, byteArray, 1L, 1L,
        resultFilterChain, hashSet1);

    // Act
    topSecondDegreeByCountForTweet.generateRecommendationFromNodeInfo(request);
  }

  @Test
  public void isEdgeUpdateValidTest() {
    // Arrange
    TopSecondDegreeByCountForTweet topSecondDegreeByCountForTweet = new TopSecondDegreeByCountForTweet(null, 0,
        new DefaultStatsReceiver("aaaaa"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaaaaaaaaaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("akaaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("akaaa"));
    byte[] byteArray = new byte[24];
    byteArray[17] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>(0, 1.0f);
    ((HashSet<byte[]>) hashSet1).add(new byte[24]);
    TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, null, 0, 0, 0, hashMap, byteArray, 1L, 1L,
        resultFilterChain, hashSet1);
    long rightNode = 2561L;
    byte edgeType = (byte) 0;
    long edgeMetadata = 1L;

    // Act
    boolean actual = topSecondDegreeByCountForTweet.isEdgeUpdateValid(request, rightNode, edgeType, edgeMetadata);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void updateNodeInfoTest() {
    // Arrange
    TopSecondDegreeByCountForTweet topSecondDegreeByCountForTweet = new TopSecondDegreeByCountForTweet(null, 0,
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
    thrown.expect(NullPointerException.class);
    topSecondDegreeByCountForTweet.updateNodeInfo(leftNode, rightNode, edgeType, edgeMetadata, weight, edgeIterator,
        maxSocialProofTypeSize);
  }
}



