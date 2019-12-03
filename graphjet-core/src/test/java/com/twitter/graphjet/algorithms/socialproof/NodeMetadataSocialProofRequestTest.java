package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class NodeMetadataSocialProofRequestTest {
//failed_compile @Test
//  public void constructorTest() {
//    // Arrange
//    Byte2ObjectAVLTreeMap<IntSet> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<IntSet>();
//    Byte resultByte = new Byte((byte) 0);
//    IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
//    Integer.getInteger("aaaaa");
//    byte2ObjectAVLTreeMap.put((Object) resultByte, intAVLTreeSet);
//    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
//    Long.getLong("aaaaa");
//    byte[] socialProofTypes = new byte[24];
//
//    // Act
//    NodeMetadataSocialProofRequest nodeMetadataSocialProofRequest = new NodeMetadataSocialProofRequest(
//        (Byte2ObjectMap<IntSet>) byte2ObjectAVLTreeMap, long2DoubleAVLTreeMap, socialProofTypes);
//
//    // Assert
//    Long2DoubleMap leftSeedNodesWithWeight = nodeMetadataSocialProofRequest.getLeftSeedNodesWithWeight();
//    LongSet toBeFiltered = nodeMetadataSocialProofRequest.getToBeFiltered();
//    byte[] socialProofTypes1 = nodeMetadataSocialProofRequest.getSocialProofTypes();
//    Byte2ObjectMap<IntSet> nodeMetadataTypeToIdsMap = nodeMetadataSocialProofRequest.getNodeMetadataTypeToIdsMap();
//    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
//    assertEquals(0L, nodeMetadataSocialProofRequest.getQueryNode());
//    assertSame(byte2ObjectAVLTreeMap, nodeMetadataTypeToIdsMap);
//    assertEquals(24, socialProofTypes1.length);
//    assertTrue(toBeFiltered instanceof it.unimi.dsi.fastutil.longs.LongArraySet);
//  }

//failed_compile @Test
//  public void getLeftSeedNodesWithWeightTest() {
//    // Arrange
//    Byte2ObjectAVLTreeMap<IntSet> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<IntSet>();
//    Byte resultByte = new Byte((byte) 0);
//    IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
//    Integer.getInteger("aaaaa");
//    byte2ObjectAVLTreeMap.put((Object) resultByte, intAVLTreeSet);
//    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
//    Long.getLong("aaaka");
//    byte[] byteArray = new byte[24];
//    byteArray[23] = 10;
//    NodeMetadataSocialProofRequest nodeMetadataSocialProofRequest = new NodeMetadataSocialProofRequest(
//        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<IntSet>) byte2ObjectAVLTreeMap, long2DoubleAVLTreeMap, byteArray);
//
//    // Act
//    Long2DoubleMap actual = nodeMetadataSocialProofRequest.getLeftSeedNodesWithWeight();
//
//    // Assert
//    assertEquals(0, actual.size());
//  }

//failed_compile @Test
//  public void getNodeMetadataTypeToIdsMapTest() {
//    // Arrange
//    Byte2ObjectAVLTreeMap<IntSet> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<IntSet>();
//    Byte resultByte = new Byte((byte) 0);
//    IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
//    Integer.getInteger("aaaaa");
//    byte2ObjectAVLTreeMap.put((Object) resultByte, intAVLTreeSet);
//    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
//    Long.getLong("aaaka");
//    byte[] byteArray = new byte[24];
//    byteArray[23] = 10;
//    NodeMetadataSocialProofRequest nodeMetadataSocialProofRequest = new NodeMetadataSocialProofRequest(
//        (Byte2ObjectMap<IntSet>) byte2ObjectAVLTreeMap, long2DoubleAVLTreeMap, byteArray);
//
//    // Act
//    Byte2ObjectMap<IntSet> actual = nodeMetadataSocialProofRequest.getNodeMetadataTypeToIdsMap();
//
//    // Assert
//    assertEquals(1, actual.size());
//  }
}


