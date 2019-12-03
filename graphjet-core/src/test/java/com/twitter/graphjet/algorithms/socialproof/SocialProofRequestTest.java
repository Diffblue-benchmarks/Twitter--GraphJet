package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class SocialProofRequestTest {
  @Test
  public void constructorTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    byte[] byteArray = new byte[24];
    byteArray[1] = 10;

    // Act
    SocialProofRequest socialProofRequest = new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap, byteArray);

    // Assert
    Long2DoubleMap leftSeedNodesWithWeight = socialProofRequest.getLeftSeedNodesWithWeight();
    LongSet toBeFiltered = socialProofRequest.getToBeFiltered();
    byte[] socialProofTypes = socialProofRequest.getSocialProofTypes();
    LongSet rightNodeIds = socialProofRequest.getRightNodeIds();
    assertSame(long2DoubleAVLTreeMap, leftSeedNodesWithWeight);
    assertEquals(0L, socialProofRequest.getQueryNode());
    assertSame(longAVLTreeSet, rightNodeIds);
    assertEquals(24, socialProofTypes.length);
    assertTrue(toBeFiltered instanceof it.unimi.dsi.fastutil.longs.LongArraySet);
  }

  @Test
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    SocialProofRequest socialProofRequest = new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap, null);

    // Act
    Long2DoubleMap actual = socialProofRequest.getLeftSeedNodesWithWeight();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getRightNodeIdsTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    SocialProofRequest socialProofRequest = new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap, null);

    // Act
    LongSet actual = socialProofRequest.getRightNodeIds();

    // Assert
    assertEquals(0, actual.size());
  }
}


