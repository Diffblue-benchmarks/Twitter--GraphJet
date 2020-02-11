package com.twitter.graphjet.algorithms.counting.moment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.moment.TopSecondDegreeByCountRequestForMoment
 *
 * @author Diffblue JCover
 */

public class TopSecondDegreeByCountRequestForMomentTest {

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(0L, leftSeedNodesWithWeight, toBeFiltered, 1, 1, 1, new HashMap<Byte, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getMaxNumResults(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumResultsReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(1L, leftSeedNodesWithWeight, toBeFiltered, 0, 1, 1, new HashMap<Byte, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getMaxNumResults(), is(0));
    }

    @Test(timeout=10000)
    public void getMaxNumSocialProofsReturnsOne() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(0L, leftSeedNodesWithWeight, toBeFiltered, 1, 1, 1, new HashMap<Byte, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getMaxNumSocialProofs(), is(1));
    }

    @Test(timeout=10000)
    public void getMaxNumSocialProofsReturnsZero() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(1L, leftSeedNodesWithWeight, toBeFiltered, 1, 0, 1, new HashMap<Byte, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getMaxNumSocialProofs(), is(0));
    }

    @Test(timeout=10000)
    public void getMinUserPerSocialProof() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        Map<Byte, Integer> minUserPerSocialProof = new HashMap<Byte, Integer>();
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(1L, leftSeedNodesWithWeight, toBeFiltered, 1, 1, 1, minUserPerSocialProof, socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getMinUserPerSocialProof(), sameInstance(minUserPerSocialProof));
    }

    @Test(timeout=10000)
    public void getRecommendationTypeReturnsMOMENT() {
        Long2DoubleMap leftSeedNodesWithWeight = mock(Long2DoubleMap.class);
        LongSet toBeFiltered = mock(LongSet.class);
        byte[] socialProofTypes = new byte[] { 1 };
        assertThat(new TopSecondDegreeByCountRequestForMoment(1L, leftSeedNodesWithWeight, toBeFiltered, 1, 1, 1, new HashMap<Byte, Integer>(), socialProofTypes, 1L, 1L, new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())).getRecommendationType(), is(RecommendationType.MOMENT));
    }
}
