package com.twitter.graphjet.algorithms.salsa;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaRequestBuilder
 */

public class SalsaRequestBuilderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void build() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequest result = salsaRequestBuilder.build();
        assertFalse(result.getLeftSeedNodesWithWeight().isEmpty());
        assertEquals(10, result.getMaxNumResults());
        assertEquals(1, result.getMaxRandomWalkLength());
        assertEquals(0, result.getMaxSocialProofSize());
        assertEquals(1, result.getMaxSocialProofTypeSize());
        assertEquals(1, result.getNumRandomWalks());
        assertEquals(0.9, result.getQueryNodeWeightFraction(), 0);
        assertEquals(0.3, result.getResetProbability(), 0);
        assertEquals(1L, result.getQueryNode());
        assertArrayEquals(new byte[] { 0 }, result.getSocialProofTypes());
        assertTrue(result.getToBeFiltered().isEmpty());
    }

    @Test
    public void constructorQueryNodeIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        // pojo SalsaRequestBuilder
    }

    @Test
    public void removeNegativeNodesInputRemoveNegativeNodesIsTrue() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.removeNegativeNodes(true);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withLeftSeedNodesInputLeftSeedNodesIsNull() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withLeftSeedNodes(null);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withMaxNumResultsInputMaxNumResultsIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withMaxNumResults(1);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withMaxRandomWalkLengthInputMaxRandomWalkLengthIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withMaxRandomWalkLength(1);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withMaxSocialProofSizeInputMaxSocialProofSizeIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withMaxSocialProofSize(1);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withMaxSocialProofTypeSizeInputMaxSocialProofTypeSizeIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withMaxSocialProofTypeSize(1);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withNumRandomWalksInputNumRandomWalksIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withNumRandomWalks(1);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withQueryNodeWeightFractionInputQueryNodeWeightFractionIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withQueryNodeWeightFraction(1.0);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withResetProbabilityInputResetProbabilityIsOne() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withResetProbability(1.0);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withResultFilterChain() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter> resultFilterSet = new ArrayList<com.twitter.graphjet.algorithms.filters.ResultFilter>();
        com.twitter.graphjet.algorithms.filters.ResultFilterChain inputResultFilterChain = new com.twitter.graphjet.algorithms.filters.ResultFilterChain(resultFilterSet);
        SalsaRequestBuilder result = salsaRequestBuilder.withResultFilterChain(inputResultFilterChain);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withToBeFilteredInputToBeFilteredIsNull() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        SalsaRequestBuilder result = salsaRequestBuilder.withToBeFiltered(null);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withValidSocialProofTypesInputValidSocialProofTypesIsEmpty() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        byte[] inputValidSocialProofTypes = new byte[] { };
        SalsaRequestBuilder result = salsaRequestBuilder.withValidSocialProofTypes(inputValidSocialProofTypes);
        assertSame(salsaRequestBuilder, result);
    }

    @Test
    public void withMaxRandomWalkLengthInputMaxRandomWalkLengthIsZeroThrows() {
        SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
        // Maximum random walk length must be odd.
        thrown.expect(IllegalArgumentException.class);
        salsaRequestBuilder.withMaxRandomWalkLength(0);
    }
}
