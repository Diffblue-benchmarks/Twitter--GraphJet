package com.twitter.graphjet.algorithms.salsa;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.filters.ResultFilterChain;

import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaRequestBuilder
 *
 * @author Diffblue JCover
 */

public class SalsaRequestBuilderDiffblueTest {

    @Test(timeout=10000)
    public void build() {
        SalsaRequest result = new SalsaRequestBuilder(1L).build();
        assertEquals(1.0, result.getLeftSeedNodesWithWeight().get(1L), 0);
        assertThat(result.getMaxNumResults(), is(10));
        assertThat(result.getMaxRandomWalkLength(), is(1));
        assertThat(result.getMaxSocialProofSize(), is(0));
        assertThat(result.getMaxSocialProofTypeSize(), is(1));
        assertThat(result.getNumRandomWalks(), is(1));
        assertEquals(0.9, result.getQueryNodeWeightFraction(), 0);
        assertEquals(0.3, result.getResetProbability(), 0);
        assertThat(result.getQueryNode(), is(1L));
        assertArrayEquals(new byte[] { 0 }, result.getSocialProofTypes());
        assertTrue(result.getToBeFiltered().isEmpty());
    }

    @Test(timeout=10000)
    public void removeNegativeNodesInputRemoveNegativeNodesIsFalse() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.removeNegativeNodes(false), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withLeftSeedNodes() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        Long2DoubleMap inputLeftSeedNodes = mock(Long2DoubleMap.class);
        assertThat(salsaRequestBuilder.withLeftSeedNodes(inputLeftSeedNodes), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withMaxNumResultsInputMaxNumResultsIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withMaxNumResults(1), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withMaxRandomWalkLengthInputMaxRandomWalkLengthIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withMaxRandomWalkLength(1), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withMaxSocialProofSizeInputMaxSocialProofSizeIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withMaxSocialProofSize(1), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withMaxSocialProofTypeSizeInputMaxSocialProofTypeSizeIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withMaxSocialProofTypeSize(1), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withNumRandomWalksInputNumRandomWalksIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withNumRandomWalks(1), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withQueryNodeWeightFractionInputQueryNodeWeightFractionIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withQueryNodeWeightFraction(1.0), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withResetProbabilityInputResetProbabilityIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withResetProbability(1.0), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withResultFilterChain() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        assertThat(salsaRequestBuilder.withResultFilterChain(new ResultFilterChain(new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>())), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withToBeFiltered() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        LongSet inputToBeFiltered = mock(LongSet.class);
        assertThat(salsaRequestBuilder.withToBeFiltered(inputToBeFiltered), sameInstance(salsaRequestBuilder));
    }

    @Test(timeout=10000)
    public void withValidSocialProofTypesInputValidSocialProofTypesIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        byte[] inputValidSocialProofTypes = new byte[] { 1 };
        assertThat(salsaRequestBuilder.withValidSocialProofTypes(inputValidSocialProofTypes), sameInstance(salsaRequestBuilder));
    }
}
