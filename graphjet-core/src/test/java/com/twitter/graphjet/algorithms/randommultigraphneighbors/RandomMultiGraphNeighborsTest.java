package com.twitter.graphjet.algorithms.randommultigraphneighbors;

import com.twitter.graphjet.algorithms.filters.MinEngagementFilter;
import com.twitter.graphjet.algorithms.filters.RelatedTweetFilter;
import com.twitter.graphjet.algorithms.filters.RelatedTweetFilterChain;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RandomMultiGraphNeighborsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    DefaultStatsReceiver statsReceiver = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new RandomMultiGraphNeighbors(bipartiteGraph, statsReceiver);
  }
  @Test
  public void getRandomMultiGraphNeighborsTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("numOfNeighbors");
    defaultStatsReceiver.counter("numOfNeighbors");
    defaultStatsReceiver.counter("numOfNeighbors");
    RandomMultiGraphNeighbors randomMultiGraphNeighbors = new RandomMultiGraphNeighbors(null,
        new DefaultStatsReceiver("numOfNeighbors"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("numOfNeighbors");
    RandomMultiGraphNeighborsRequest request = new RandomMultiGraphNeighborsRequest(long2DoubleAVLTreeMap, 0, 0);
    Random random = new Random();

    // Act and Assert
    thrown.expect(ArithmeticException.class);
    randomMultiGraphNeighbors.getRandomMultiGraphNeighbors(request, random);
  }
  @Test
  public void getRandomMultiGraphNeighborsTest2() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("numOfNeighbors");
    defaultStatsReceiver.counter("numOfNeighbors");
    defaultStatsReceiver.counter("numOfNeighbors");
    RandomMultiGraphNeighbors randomMultiGraphNeighbors = new RandomMultiGraphNeighbors(null,
        new DefaultStatsReceiver("numOfNeighbors"));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("numOfNeighbors");
    RandomMultiGraphNeighborsRequest request = new RandomMultiGraphNeighborsRequest(long2DoubleAVLTreeMap, 0, 0);
    Random random = new Random();
    ArrayList<RelatedTweetFilter> arrayList = new ArrayList<RelatedTweetFilter>();
    ((ArrayList<RelatedTweetFilter>) arrayList).add(new MinEngagementFilter(0, null, defaultStatsReceiver));
    RelatedTweetFilterChain filterChain = new RelatedTweetFilterChain((java.util.List<RelatedTweetFilter>) arrayList);

    // Act and Assert
    thrown.expect(ArithmeticException.class);
    randomMultiGraphNeighbors.getRandomMultiGraphNeighbors(request, random, filterChain);
  }
}


