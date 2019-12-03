package com.twitter.graphjet.bipartite.optimizer;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.bipartite.optimizer.Optimizer
 */

public class OptimizerTest {

    @Test
    public void submitGraphOptimizerJobGraphIsNullAndSegmentIsNull() {
        Optimizer.submitGraphOptimizerJob(null, null);
    }
}
