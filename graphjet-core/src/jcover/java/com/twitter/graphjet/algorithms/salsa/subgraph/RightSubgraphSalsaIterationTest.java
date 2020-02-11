package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.mockito.Mockito.mock;

import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.RightSubgraphSalsaIteration
 *
 * @author Diffblue JCover
 */

public class RightSubgraphSalsaIterationTest {

    @Test(timeout=10000)
    public void runSingleIteration() {
        LeftIndexedBipartiteGraph leftIndexedBipartiteGraph = mock(LeftIndexedBipartiteGraph.class);
        new RightSubgraphSalsaIteration(new SalsaSubgraphInternalState(leftIndexedBipartiteGraph, new com.twitter.graphjet.algorithms.salsa.SalsaStats(), 1, 1)).runSingleIteration();
    }
}
