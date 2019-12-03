package com.twitter.graphjet.algorithms.counting;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.counting.tweet.TopSecondDegreeByCountRequestForTweet;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratorHelperTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void addResultToPriorityQueueTest() {
    // Arrange
    PriorityQueue<NodeInfo> topResults = new PriorityQueue<NodeInfo>();
    NodeInfo nodeInfo = new NodeInfo(1L, 1.0, 0);
    int maxNumResults = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    GeneratorHelper.addResultToPriorityQueue(topResults, nodeInfo, maxNumResults);
  }
  @Test
  public void getMaxNumResultsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("akaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    byte[] byteArray = new byte[24];
    byteArray[5] = 10;
    ((HashSet<byte[]>) hashSet1).add(byteArray);
    TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 0, 0, 0, hashMap1, new byte[24], 655361L,
        1L, resultFilterChain, hashSet1);
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    GeneratorHelper.getMaxNumResults(request, recommendationType);
  }
  @Test
  public void getMinUserSocialProofSizeTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("akaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    byte[] byteArray = new byte[24];
    byteArray[5] = 10;
    ((HashSet<byte[]>) hashSet1).add(byteArray);
    TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 0, 0, 0, hashMap1, new byte[24], 655361L,
        1L, resultFilterChain, hashSet1);
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    GeneratorHelper.getMinUserSocialProofSize(request, recommendationType);
  }
  @Test
  public void getValidNodesTest() {
    // Arrange
    ArrayList<NodeInfo> arrayList = new ArrayList<NodeInfo>();
    ((ArrayList<NodeInfo>) arrayList).add(new NodeInfo(1L, 1.0, 0));
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    int maxNumResults = 0;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    GeneratorHelper.getValidNodes((java.util.List<NodeInfo>) arrayList, hashMap, maxNumResults);
  }
  @Test
  public void isValidSocialProofTest() {
    // Arrange
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] socialProofs = new SmallArrayBasedLongToDoubleMap[]{smallArrayBasedLongToDoubleMap,
        smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    GeneratorHelper.isValidSocialProof((java.util.Map<Byte, Integer>) hashMap, socialProofs);
  }
  @Test
  public void pickTopSocialProofsTest() {
    // Arrange
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap[] smallArrayBasedLongToDoubleMapArray = new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()};

    // Act
    Map<Byte, ConnectingUsersWithMetadata> actual = GeneratorHelper
        .pickTopSocialProofs(smallArrayBasedLongToDoubleMapArray);

    // Assert
    assertEquals(3, actual.size());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap2 = smallArrayBasedLongToDoubleMapArray[0];
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap3 = smallArrayBasedLongToDoubleMapArray[1];
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap4 = smallArrayBasedLongToDoubleMapArray[2];
    long[] metadataResult = smallArrayBasedLongToDoubleMap2.metadata();
    long[] keysResult = smallArrayBasedLongToDoubleMap2.keys();
    int sizeResult = smallArrayBasedLongToDoubleMap2.size();
    long[] metadataResult1 = smallArrayBasedLongToDoubleMap4.metadata();
    long[] keysResult1 = smallArrayBasedLongToDoubleMap4.keys();
    int sizeResult1 = smallArrayBasedLongToDoubleMap4.size();
    long[] metadataResult2 = smallArrayBasedLongToDoubleMap3.metadata();
    long[] keysResult2 = smallArrayBasedLongToDoubleMap3.keys();
    assertEquals(0, sizeResult1);
    assertEquals(0, smallArrayBasedLongToDoubleMap3.size());
    assertEquals(0, keysResult2.length);
    assertEquals(0, metadataResult2.length);
    assertEquals(0, keysResult1.length);
    assertEquals(0, metadataResult1.length);
    assertEquals(0, keysResult.length);
    assertEquals(0, metadataResult.length);
    assertEquals(0, sizeResult);
  }
}





