package com.twitter.graphjet.bipartite.segment;

import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecycleSegmentMemoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void recycleLeftRegularBipartiteGraphSegmentTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraphSegment = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    RecycleSegmentMemory.recycleLeftRegularBipartiteGraphSegment(bipartiteGraphSegment);
  }
}
