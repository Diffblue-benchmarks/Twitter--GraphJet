package com.twitter.graphjet.algorithms.salsa;

import com.twitter.graphjet.algorithms.salsa.fullgraph.SalsaInternalState;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaSelectResultsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
//failed_compile @Test
//  public void constructorTest() {
//    // Arrange
//    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("graph");
//    defaultStatsReceiver.counter("graph");
//    defaultStatsReceiver.counter("graph");
//    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 0);
//
//    // Act
//    new SalsaSelectResults<LeftIndexedBipartiteGraph>(
//        (CommonInternalState<LeftIndexedBipartiteGraph>) salsaInternalState);
//  }
//failed_compile @Test
//  public void pickTopNodesTest() {
//    // Arrange
//    SalsaSelectResults<LeftIndexedBipartiteGraph> salsaSelectResults = new SalsaSelectResults<LeftIndexedBipartiteGraph>(
//        (CommonInternalState<LeftIndexedBipartiteGraph>) new SalsaInternalState(null, new SalsaStats(), 0));
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    salsaSelectResults.pickTopNodes();
//  }
}

