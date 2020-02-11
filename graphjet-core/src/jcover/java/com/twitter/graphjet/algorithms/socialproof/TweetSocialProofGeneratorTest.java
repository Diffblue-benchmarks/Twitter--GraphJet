package com.twitter.graphjet.algorithms.socialproof;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.twitter.graphjet.bipartite.LeftIndexedMultiSegmentBipartiteGraph;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectSet;

import java.util.Random;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.TweetSocialProofGenerator
 *
 * @author Diffblue JCover
 */

public class TweetSocialProofGeneratorTest {

    @Test(timeout=10000)
    public void computeRecommendations() {
        LeftIndexedMultiSegmentBipartiteGraph leftIndexedBipartiteGraph = mock(LeftIndexedMultiSegmentBipartiteGraph.class);
        LongSet rightNodeIds = mock(LongSet.class);
        @SuppressWarnings("unchecked")
        ObjectIterator<Long2DoubleMap.Entry> objectIterator = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectSet<Long2DoubleMap.Entry> objectSet = mock(ObjectSet.class);
        when(objectSet.iterator())
            .thenReturn(objectIterator);
        Long2DoubleMap weightedSeedNodes = mock(Long2DoubleMap.class);
        when(weightedSeedNodes.long2DoubleEntrySet())
            .thenReturn(objectSet);
        byte[] socialProofTypes = new byte[] { 1 };
        // pojo Iterable<com.twitter.graphjet.algorithms.RecommendationInfo>
    }
}
