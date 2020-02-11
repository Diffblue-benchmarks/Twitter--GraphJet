package com.twitter.graphjet.algorithms.salsa.subgraph;

import static org.mockito.Mockito.mock;

import com.twitter.graphjet.algorithms.salsa.SalsaNodeVisitor;
import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.subgraph.LeftSubgraphSalsaIteration
 *
 * @author Diffblue JCover
 */

public class LeftSubgraphSalsaIterationTest {

    @Test(timeout=10000)
    public void runSingleIteration() {
        LeftIndexedBipartiteGraph leftIndexedBipartiteGraph = mock(LeftIndexedBipartiteGraph.class);
        SalsaNodeVisitor.NodeVisitor nodeVisitor = mock(SalsaNodeVisitor.NodeVisitor.class);
        new LeftSubgraphSalsaIteration(new SalsaSubgraphInternalState(leftIndexedBipartiteGraph, new com.twitter.graphjet.algorithms.salsa.SalsaStats(), 0, 1), nodeVisitor).runSingleIteration();
    }
}
