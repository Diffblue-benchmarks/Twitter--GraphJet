package com.twitter.graphjet.bipartite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import org.junit.Test;

public class MultiSegmentReaderAccessibleInfoProviderDiffblueTest {
  @Test(timeout=10000)
  public void getLiveSegmentIdTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new MultiSegmentReaderAccessibleInfoProvider<LeftIndexedBipartiteGraphSegment>(3, 3)).getLiveSegmentId());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = (new MultiSegmentReaderAccessibleInfoProvider<LeftIndexedBipartiteGraphSegment>(
        3, 3)).getMultiSegmentReaderAccessibleInfo();
    assertEquals(-1, multiSegmentReaderAccessibleInfo.liveSegmentId);
    assertTrue(
        multiSegmentReaderAccessibleInfo.getSegments() instanceof it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap);
    assertEquals(0, multiSegmentReaderAccessibleInfo.oldestSegmentId);
  }

  @Test(timeout=10000)
  public void getNumEdgesInNonLiveSegmentsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MultiSegmentReaderAccessibleInfoProvider<LeftIndexedBipartiteGraphSegment>(3, 3))
        .getNumEdgesInNonLiveSegments());
  }
}

