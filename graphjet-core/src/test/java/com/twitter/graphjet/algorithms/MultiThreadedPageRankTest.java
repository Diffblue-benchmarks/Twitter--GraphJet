package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.google.common.util.concurrent.AtomicDoubleArray;
import com.twitter.graphjet.directed.OutIndexedPowerLawMultiSegmentDirectedGraph;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiThreadedPageRankTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    OutIndexedPowerLawMultiSegmentDirectedGraph graph = null;
    LongArrayList nodes = new LongArrayList(0);
    Long.getLong("aaaaa");
    long maxNodeId = 1L;
    double dampingFactor = 2.0;
    int maxIterations = 0;
    double tolerance = 2.0;
    int threads = 0;

    // Act
    MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(graph, nodes, maxNodeId, dampingFactor,
        maxIterations, tolerance, threads);

    // Assert
    double l1Norm = multiThreadedPageRank.getL1Norm();
    assertEquals(1.7976931348623157E308, l1Norm, 0.0);
    assertNull(multiThreadedPageRank.getPageRankVector());
  }
  @Test
  public void getL1NormTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongArrayList longArrayList = new LongArrayList();
    Long.getLong("aaaaa");
    MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, longArrayList, 1L, 2.0, 0, 2.0, 0);

    // Act
    double actual = multiThreadedPageRank.getL1Norm();

    // Assert
    assertEquals(1.7976931348623157E308, actual, 0.0);
  }
  @Test
  public void getPageRankVectorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongArrayList longArrayList = new LongArrayList();
    Long.getLong("aaaaa");
    MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, longArrayList, 1L, 2.0, 0, 2.0, 0);

    // Act
    AtomicDoubleArray actual = multiThreadedPageRank.getPageRankVector();

    // Assert
    assertNull(actual);
  }
  @Test
  public void runTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    LongArrayList longArrayList = new LongArrayList();
    Long.getLong("aaaaa");
    MultiThreadedPageRank multiThreadedPageRank = new MultiThreadedPageRank(null, longArrayList, 1L, 2.0, 0, 2.0, 0);

    // Act and Assert
    thrown.expect(ArithmeticException.class);
    multiThreadedPageRank.run();
  }
}



