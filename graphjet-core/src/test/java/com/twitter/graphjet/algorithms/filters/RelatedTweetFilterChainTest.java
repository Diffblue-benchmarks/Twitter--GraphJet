package com.twitter.graphjet.algorithms.filters;

import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RelatedTweetFilterChainTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<RelatedTweetFilter> arrayList = new ArrayList<RelatedTweetFilter>();
    ((ArrayList<RelatedTweetFilter>) arrayList)
        .add(new MinEngagementFilter(1, null, new DefaultStatsReceiver("aakaa")));

    // Act
    new RelatedTweetFilterChain((java.util.List<RelatedTweetFilter>) arrayList);
  }
  @Test
  public void filterTest() {
    // Arrange
    ArrayList<RelatedTweetFilter> arrayList = new ArrayList<RelatedTweetFilter>();
    ((ArrayList<RelatedTweetFilter>) arrayList)
        .add(new MinEngagementFilter(1, null, new DefaultStatsReceiver("aaaaa")));
    RelatedTweetFilterChain relatedTweetFilterChain = new RelatedTweetFilterChain(
        (java.util.List<RelatedTweetFilter>) arrayList);
    long tweet = 655361L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    relatedTweetFilterChain.filter(tweet);
  }
}

