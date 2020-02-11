package com.twitter.graphjet.algorithms.socialproof;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.twitter.graphjet.algorithms.RecommendationType;

import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.socialproof.NodeMetadataSocialProofResult
 *
 * @author Diffblue JCover
 */

public class NodeMetadataSocialProofResultTest {

    @Test(timeout=10000)
    public void getNodeMetadataIdReturnsOne() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection1)
            .thenReturn(objectCollection2);
        assertThat(new NodeMetadataSocialProofResult(1, socialProof, 1.0, RecommendationType.HASHTAG).getNodeMetadataId(), is(1));
    }

    @Test(timeout=10000)
    public void getNodeMetadataIdReturnsZero() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection1)
            .thenReturn(objectCollection2);
        assertThat(new NodeMetadataSocialProofResult(0, socialProof, 1.0, RecommendationType.HASHTAG).getNodeMetadataId(), is(0));
    }

    @Test(timeout=10000)
    public void getRecommendationTypeReturnsHASHTAG() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection1)
            .thenReturn(objectCollection2);
        assertThat(new NodeMetadataSocialProofResult(1, socialProof, 1.0, RecommendationType.HASHTAG).getRecommendationType(), is(RecommendationType.HASHTAG));
    }

    @Test(timeout=10000)
    public void getSocialProof() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection1)
            .thenReturn(objectCollection2);
        assertThat(new NodeMetadataSocialProofResult(1, socialProof, 1.0, RecommendationType.HASHTAG).getSocialProof(), sameInstance(socialProof));
    }

    @Test(timeout=10000)
    public void getSocialProofSizeReturnsZero() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator3 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection3 = mock(ObjectCollection.class);
        when(objectCollection3.iterator())
            .thenReturn(objectIterator3);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection2)
            .thenReturn(objectCollection3)
            .thenReturn(objectCollection1);
        assertThat(new NodeMetadataSocialProofResult(1, socialProof, 1.0, RecommendationType.HASHTAG).getSocialProofSize(), is(0));
    }

    @Test(timeout=10000)
    public void getWeightReturnsOne() {
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator1 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection1 = mock(ObjectCollection.class);
        when(objectCollection1.iterator())
            .thenReturn(objectIterator1);
        @SuppressWarnings("unchecked")
        ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectIterator2 = mock(ObjectIterator.class);
        @SuppressWarnings("unchecked")
        ObjectCollection<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> objectCollection2 = mock(ObjectCollection.class);
        when(objectCollection2.iterator())
            .thenReturn(objectIterator2);
        @SuppressWarnings("unchecked")
        Byte2ObjectMap<it.unimi.dsi.fastutil.longs.Long2ObjectMap<it.unimi.dsi.fastutil.longs.LongSet>> socialProof = mock(Byte2ObjectMap.class);
        when(socialProof.values())
            .thenReturn(objectCollection1)
            .thenReturn(objectCollection2);
        assertEquals(1.0, new NodeMetadataSocialProofResult(1, socialProof, 1.0, RecommendationType.HASHTAG).getWeight(), 0);
    }
}
