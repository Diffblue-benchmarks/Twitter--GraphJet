package com.twitter.graphjet.bipartite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.MultiSegmentReaderAccessibleInfo
 *
 * @author Diffblue JCover
 */

public class MultiSegmentReaderAccessibleInfoTest {

    @Test(timeout=10000)
    public void getSegments() {
        @SuppressWarnings("unchecked")
        Int2ObjectMap<com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment> segments = mock(Int2ObjectMap.class);
        assertThat(new MultiSegmentReaderAccessibleInfo<com.twitter.graphjet.bipartite.segment.LeftIndexedBipartiteGraphSegment>(segments, 1, 1).getSegments(), sameInstance(segments));
    }
}
