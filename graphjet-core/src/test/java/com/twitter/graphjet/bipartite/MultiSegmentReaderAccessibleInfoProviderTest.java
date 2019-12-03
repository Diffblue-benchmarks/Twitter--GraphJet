package com.twitter.graphjet.bipartite;

import com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiSegmentReaderAccessibleInfoProviderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    int maxNumSegments = -1;
    int maxNumEdgesPerSegment = -1;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new MultiSegmentReaderAccessibleInfoProvider<LeftIndexedBipartiteGraphSegment>(maxNumSegments,
        maxNumEdgesPerSegment);
  }
}
