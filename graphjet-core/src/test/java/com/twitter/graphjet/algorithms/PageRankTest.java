package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.twitter.graphjet.directed.OutIndexedPowerLawMultiSegmentDirectedGraph;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PageRankTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = null;
    ((ArrayList<Long>) new ArrayList<Long>()).add(Long.getLong("aaaaa"));
    LongOpenHashSet nodes = null;
    long maxNodeId = 1L;
    double dampingFactor = 2.0;
    int maxIterations = 0;
    double tolerance = 2.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new PageRank(graph, nodes, maxNodeId, dampingFactor, maxIterations, tolerance);
  }

  @Test
  public void getL1NormTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    Long.getLong("aaaaa");
    PageRank pageRank = new PageRank(null, longOpenHashSet, 1L, 2.0, 0, 2.0);

    // Act
    double actual = pageRank.getL1Norm();

    // Assert
    assertEquals(1.7976931348623157E308, actual, 0.0);
  }

  @Test
  public void getPageRankVectorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    Long.getLong("aaaaa");
    PageRank pageRank = new PageRank(null, longOpenHashSet, 1L, 2.0, 0, 2.0);

    // Act
    double[] actual = pageRank.getPageRankVector();

    // Assert
    assertNull(actual);
  }

  @Test
  public void runTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
    Long.getLong("aaaaa");
    PageRank pageRank = new PageRank(null, longOpenHashSet, 1L, 2.0, 0, 2.0);

    // Act
    int actual = pageRank.run();

    // Assert
    assertEquals(0, actual);
    assertEquals(2, pageRank.getPageRankVector().length);
  }
}



