package com.twitter.graphjet.bipartite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.junit.Test;

public class MultiSegmentReaderAccessibleInfoTest {
  @Test
  public void constructorTest() {
    // Arrange
    Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    int oldestSegmentId = 1;
    int liveSegmentId = 1;

    // Act
    MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment>(
        (Int2ObjectMap<LeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap, oldestSegmentId, liveSegmentId);

    // Assert
    assertSame(int2ObjectOpenHashMap, multiSegmentReaderAccessibleInfo.getSegments());
  }

  @Test
  public void getSegmentsTest() {
    // Arrange
    Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<LeftIndexedBipartiteGraphSegment>();
    Integer.getInteger("aaaaa");
    MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment> multiSegmentReaderAccessibleInfo = new MultiSegmentReaderAccessibleInfo<LeftIndexedBipartiteGraphSegment>(
        (Int2ObjectMap<LeftIndexedBipartiteGraphSegment>) int2ObjectOpenHashMap, 1, 1);

    // Act
    Int2ObjectMap<LeftIndexedBipartiteGraphSegment> actual = multiSegmentReaderAccessibleInfo.getSegments();

    // Assert
    assertEquals(0, actual.size());
  }
}

