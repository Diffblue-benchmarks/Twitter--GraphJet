package com.twitter.graphjet.bipartite.optimizer;

import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptimizerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void optimizeLeftIndexedBipartiteGraphSegmentTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    Optimizer.optimizeLeftIndexedBipartiteGraphSegment(
        new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3, new NullStatsReceiver()));
  }
  @Test(timeout=10000)
  public void optimizeBipartiteGraphSegmentTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    Optimizer.optimizeBipartiteGraphSegment(
        new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3, new NullStatsReceiver()));
  }
}

