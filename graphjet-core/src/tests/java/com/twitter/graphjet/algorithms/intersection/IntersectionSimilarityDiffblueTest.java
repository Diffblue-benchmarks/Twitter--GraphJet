package com.twitter.graphjet.algorithms.intersection;

import static org.junit.Assert.assertNull;
import com.twitter.graphjet.algorithms.filters.RelatedTweetFilterChain;
import com.twitter.graphjet.bipartite.SmallLeftRegularBipartiteGraph;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.junit.Test;

public class IntersectionSimilarityDiffblueTest {
  @Test(timeout=10000)
  public void getSimilarNodesTest2() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    CosineUpdateNormalization relatedTweetUpdateNormalization = new CosineUpdateNormalization();
    IntersectionSimilarity intersectionSimilarity = new IntersectionSimilarity(bipartiteGraph,
        relatedTweetUpdateNormalization, new NullStatsReceiver());
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act and Assert
    assertNull(intersectionSimilarity.getSimilarNodes(
        new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1, 10.0, 10.0, true), null));
  }

  @Test(timeout=10000)
  public void getSimilarNodesTest() {
    // Arrange
    SmallLeftRegularBipartiteGraph bipartiteGraph = new SmallLeftRegularBipartiteGraph(3, 1, 3, 3, 10.0, 3,
        new NullStatsReceiver());
    CosineUpdateNormalization relatedTweetUpdateNormalization = new CosineUpdateNormalization();
    IntersectionSimilarity intersectionSimilarity = new IntersectionSimilarity(bipartiteGraph,
        relatedTweetUpdateNormalization, new NullStatsReceiver());
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    IntersectionSimilarityRequest request = new IntersectionSimilarityRequest(1L, 3, longAVLTreeSet, 3, 1, 3, 1, 1,
        10.0, 10.0, true);

    // Act and Assert
    assertNull(intersectionSimilarity.getSimilarNodes(request, null, new RelatedTweetFilterChain(null)));
  }
}

