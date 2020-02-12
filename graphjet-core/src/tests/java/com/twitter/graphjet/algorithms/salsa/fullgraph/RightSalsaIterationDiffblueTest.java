package com.twitter.graphjet.algorithms.salsa.fullgraph;

import static org.mockito.Mockito.mock;

import com.twitter.graphjet.bipartite.api.BipartiteGraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.RightSalsaIteration
 *
 * @author Diffblue JCover
 */

public class RightSalsaIterationDiffblueTest {

    @Test(timeout=10000)
    public void runSingleIteration() {
        BipartiteGraph bipartiteGraph = mock(BipartiteGraph.class);
        new RightSalsaIteration(new SalsaInternalState(bipartiteGraph, new com.twitter.graphjet.algorithms.salsa.SalsaStats(), 1)).runSingleIteration();
    }
}
