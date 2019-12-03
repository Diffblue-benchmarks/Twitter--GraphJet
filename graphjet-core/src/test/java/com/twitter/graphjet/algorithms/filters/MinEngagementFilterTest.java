package com.twitter.graphjet.algorithms.filters;

import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MinEngagementFilterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int minEngagement = 1;
    MultiSegmentPowerLawBipartiteGraph bipartiteGraph = null;
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("aaaaa");

    // Act
    new MinEngagementFilter(minEngagement, bipartiteGraph, statsReceiver);
  }
  @Test
  public void filterTest() {
    // Arrange
    MinEngagementFilter minEngagementFilter = new MinEngagementFilter(1, null, new DefaultStatsReceiver("aaaaa"));
    long tweet = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    minEngagementFilter.filter(tweet);
  }
}

