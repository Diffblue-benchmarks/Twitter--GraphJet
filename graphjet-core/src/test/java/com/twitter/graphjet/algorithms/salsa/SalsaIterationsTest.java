package com.twitter.graphjet.algorithms.salsa;

import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.algorithms.salsa.fullgraph.FinalSalsaIteration;
import com.twitter.graphjet.algorithms.salsa.fullgraph.SalsaInternalState;
import com.twitter.graphjet.bipartite.MultiSegmentPowerLawBipartiteGraph;
import com.twitter.graphjet.bipartite.api.LeftIndexedBipartiteGraph;
import com.twitter.graphjet.bipartite.segment.LeftRegularBipartiteGraphSegment;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaIterationsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, new SalsaStats(), 0);
    FinalSalsaIteration leftSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0));
    SalsaStats salsaStats = new SalsaStats();
    FinalSalsaIteration rightSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, salsaStats, 0));
    FinalSalsaIteration finalSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, salsaStats, 0));

    // Act
    new SalsaIterations<LeftIndexedBipartiteGraph>((CommonInternalState<LeftIndexedBipartiteGraph>) salsaInternalState,
        leftSalsaIteration, rightSalsaIteration, finalSalsaIteration);
  }
  @Test
  public void resetWithRequestTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 0);
    FinalSalsaIteration finalSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, salsaStats, 0));
    SalsaIterations<LeftIndexedBipartiteGraph> salsaIterations = new SalsaIterations<LeftIndexedBipartiteGraph>(
        (CommonInternalState<LeftIndexedBipartiteGraph>) salsaInternalState, finalSalsaIteration, finalSalsaIteration,
        new FinalSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("graph");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("graph");
    byte[] byteArray = new byte[24];
    byteArray[1] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 0, 0, 1.0, 0, 0, 0,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));
    Random random = new Random();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaIterations.resetWithRequest(salsaRequest, random);
  }
  @Test
  public void runSalsaIterationsTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 0);
    FinalSalsaIteration finalSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, salsaStats, 0));
    SalsaIterations<LeftIndexedBipartiteGraph> salsaIterations = new SalsaIterations<LeftIndexedBipartiteGraph>(
        (CommonInternalState<LeftIndexedBipartiteGraph>) salsaInternalState, finalSalsaIteration, finalSalsaIteration,
        new FinalSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0)));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("graph");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("graph");
    byte[] byteArray = new byte[24];
    byteArray[1] = 10;
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    SalsaRequest salsaRequest = new SalsaRequest(1L, long2DoubleAVLTreeMap, longAVLTreeSet, 0, 0, 1.0, 0, 0, 0,
        byteArray, 1.0, true, new ResultFilterChain((java.util.List<ResultFilter>) arrayList));
    Random random = new Random();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaIterations.runSalsaIterations(salsaRequest, random);
  }
  @Test
  public void seedLeftSideForFirstIterationTest() {
    // Arrange
    SalsaStats salsaStats = new SalsaStats();
    SalsaInternalState salsaInternalState = new SalsaInternalState(null, salsaStats, 0);
    FinalSalsaIteration finalSalsaIteration = new FinalSalsaIteration(new SalsaInternalState(null, salsaStats, 0));
    SalsaIterations<LeftIndexedBipartiteGraph> salsaIterations = new SalsaIterations<LeftIndexedBipartiteGraph>(
        (CommonInternalState<LeftIndexedBipartiteGraph>) salsaInternalState, finalSalsaIteration, finalSalsaIteration,
        new FinalSalsaIteration(new SalsaInternalState(null, new SalsaStats(), 0)));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    salsaIterations.seedLeftSideForFirstIteration();
  }
}



