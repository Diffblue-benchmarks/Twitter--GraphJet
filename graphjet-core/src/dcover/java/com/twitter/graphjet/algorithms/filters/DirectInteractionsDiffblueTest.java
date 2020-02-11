package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class DirectInteractionsDiffblueTest {
  @Test(timeout=10000)
  public void isDirectInteractionTest() {
    // Arrange, Act and Assert
    assertFalse(
        (new DirectInteractions(new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3, new NullStatsReceiver())))
            .isDirectInteraction(1L));
  }
}

