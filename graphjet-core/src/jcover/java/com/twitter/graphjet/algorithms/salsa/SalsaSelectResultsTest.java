package com.twitter.graphjet.algorithms.salsa;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.SalsaSelectResults
 *
 * @author Diffblue JCover
 */

public class SalsaSelectResultsTest {

    @Test(timeout=10000)
    public void constructor() {
        @SuppressWarnings("unchecked")
        CommonInternalState<com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph> salsaInternalState = mock(CommonInternalState.class);
        when(salsaInternalState.getSalsaStats())
            .thenReturn(new SalsaStats());
        // pojo SalsaSelectResults<com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph>
    }
}
