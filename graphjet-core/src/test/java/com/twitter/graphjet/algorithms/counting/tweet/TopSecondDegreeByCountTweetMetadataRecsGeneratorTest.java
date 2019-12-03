package com.twitter.graphjet.algorithms.counting.tweet;

import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TopSecondDegreeByCountTweetMetadataRecsGeneratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void generateTweetMetadataRecsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("akaaa");
    HashSet<RecommendationType> hashSet = new HashSet<RecommendationType>();
    ((HashSet<RecommendationType>) hashSet).add(RecommendationType.HASHTAG);
    HashMap<RecommendationType, Integer> hashMap = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap).put(RecommendationType.HASHTAG, Integer.getInteger("aaaaa"));
    HashMap<RecommendationType, Integer> hashMap1 = new HashMap<RecommendationType, Integer>();
    ((HashMap<RecommendationType, Integer>) hashMap1).put(RecommendationType.HASHTAG, Integer.getInteger("kaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    ResultFilterChain resultFilterChain = new ResultFilterChain((List<ResultFilter>) arrayList);
    HashSet<byte[]> hashSet1 = new HashSet<byte[]>();
    byte[] byteArray = new byte[24];
    byteArray[4] = 10;
    ((HashSet<byte[]>) hashSet1).add(byteArray);
    TopSecondDegreeByCountRequestForTweet request = new TopSecondDegreeByCountRequestForTweet(1L, long2DoubleAVLTreeMap,
        longAVLTreeSet, (java.util.Set<RecommendationType>) hashSet, hashMap, 0, 0, 0, hashMap1, new byte[24], 2561L,
        1L, resultFilterChain, hashSet1);
    ArrayList<NodeInfo> arrayList1 = new ArrayList<NodeInfo>();
    ((ArrayList<NodeInfo>) arrayList1).add(new NodeInfo(1L, 1.0, 0));
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    TopSecondDegreeByCountTweetMetadataRecsGenerator.generateTweetMetadataRecs(request, (List<NodeInfo>) arrayList1,
        recommendationType);
  }
}
