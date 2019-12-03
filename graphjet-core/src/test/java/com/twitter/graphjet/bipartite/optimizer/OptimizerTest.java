package com.twitter.graphjet.bipartite.optimizer;

import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.bipartite.edgepool.EdgePool;
import com.twitter.graphjet.bipartite.edgepool.PowerLawDegreeEdgePool;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptimizerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void optimizeBipartiteGraphSegmentTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraphSegment = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Optimizer.optimizeBipartiteGraphSegment(bipartiteGraphSegment);
  }
  @Test
  public void optimizeLeftIndexedBipartiteGraphSegmentTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph leftIndexedBipartiteGraphSegment = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Optimizer.optimizeLeftIndexedBipartiteGraphSegment(leftIndexedBipartiteGraphSegment);
  }
  @Test
  public void optimizePowerLawDegreeEdgePoolTest() {
    // Arrange
    PowerLawDegreeEdgePool edgePool = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Optimizer.optimizePowerLawDegreeEdgePool(edgePool);
  }
  @Test
  public void submitGraphOptimizerJobTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph graph = null;
    SmallLeftRegularBipartiteGraph segment = null;

    // Act
    Optimizer.submitGraphOptimizerJob(graph, segment);
  }
}



