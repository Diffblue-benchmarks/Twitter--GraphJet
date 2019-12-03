package com.twitter.graphjet.algorithms.salsa.fullgraph;

import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.salsa.fullgraph.LeftSalsaIteration
 */

public class LeftSalsaIterationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        LeftSalsaIteration leftSalsaIteration = new LeftSalsaIteration(salsaInternalState);
        // pojo LeftSalsaIteration
    }

    @Test
    public void resetWithRequestSalsaRequestIsNull() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        LeftSalsaIteration leftSalsaIteration = new LeftSalsaIteration(salsaInternalState);
        Random newRandom = new Random();
        leftSalsaIteration.resetWithRequest(null, newRandom);
    }

    @Test
    public void runSingleIterationThrows() {
        com.twitter.graphjet.algorithms.salsa.SalsaStats salsaStats = new com.twitter.graphjet.algorithms.salsa.SalsaStats();
        SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 1);
        LeftSalsaIteration leftSalsaIteration = new LeftSalsaIteration(salsaInternalState);
        thrown.expect(NullPointerException.class);
        leftSalsaIteration.runSingleIteration();
    }
}
