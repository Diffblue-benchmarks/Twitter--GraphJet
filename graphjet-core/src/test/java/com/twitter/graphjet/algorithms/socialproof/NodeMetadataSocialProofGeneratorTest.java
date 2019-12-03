package com.twitter.graphjet.algorithms.socialproof;

import com.twitter.graphjet.bipartite.NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph;
import com.twitter.graphjet.stats.DefaultCounter;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import java.util.Random;
import org.junit.Test;

public class NodeMetadataSocialProofGeneratorTest {
//failed_compile @Test
//  public void computeRecommendationsTest() {
//    // Arrange
//    NodeMetadataSocialProofGenerator nodeMetadataSocialProofGenerator = new NodeMetadataSocialProofGenerator(null);
//    Byte2ObjectAVLTreeMap<IntSet> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<IntSet>();
//    Byte resultByte = new Byte((byte) 0);
//    IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
//    Integer.getInteger("aaaaa");
//    byte2ObjectAVLTreeMap.put((Object) resultByte, intAVLTreeSet);
//    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
//    Long.getLong("aaaaa");
//    byte[] byteArray = new byte[24];
//    byteArray[17] = 10;
//    NodeMetadataSocialProofRequest request = new NodeMetadataSocialProofRequest(
//        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<IntSet>) byte2ObjectAVLTreeMap, long2DoubleAVLTreeMap, byteArray);
//    Random rand = new Random();
//
//    // Act
//    nodeMetadataSocialProofGenerator.computeRecommendations(request, rand);
//  }

  @Test
  public void constructorTest() {
    // Arrange
    DefaultStatsReceiver defaultStatsReceiver = new DefaultStatsReceiver("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    defaultStatsReceiver.counter("aaaaa");
    NodeMetadataLeftIndexedPowerLawMultiSegmentBipartiteGraph graph = null;

    // Act
    new NodeMetadataSocialProofGenerator(graph);
  }
}

