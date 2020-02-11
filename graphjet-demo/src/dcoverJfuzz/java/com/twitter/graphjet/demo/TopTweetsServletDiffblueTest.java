package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.IdentityEdgeTypeMask;
import com.twitter.graphjet.stats.NullStatsReceiver;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.junit.Test;

public class TopTweetsServletDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    MultiSegmentPowerLawBipartiteGraph bigraph = new MultiSegmentPowerLawBipartiteGraph(3, 3, 10, 1, 10.0, 10, 1, 10.0,
        edgeTypeMask, new NullStatsReceiver());
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));

    // Act
    new TopTweetsServlet(bigraph, longAVLTreeSet, TopTweetsServlet.GraphType.USER_TWEET);

    // Assert
    assertEquals(1, longAVLTreeSet.size());
  }
}

