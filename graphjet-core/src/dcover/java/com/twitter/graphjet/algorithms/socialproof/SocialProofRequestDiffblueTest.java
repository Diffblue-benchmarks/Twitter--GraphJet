package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;
import org.junit.Test;

public class SocialProofRequestDiffblueTest {
  @Test(timeout=10000)
  public void getRightNodeIdsTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    LongSet actualRightNodeIds = (new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap, byteArray))
        .getRightNodeIds();

    // Assert
    assertSame(longAVLTreeSet, actualRightNodeIds);
    assertEquals(1, actualRightNodeIds.size());
  }

  @Test(timeout=10000)
  public void getLeftSeedNodesWithWeightTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    Long2DoubleMap actualLeftSeedNodesWithWeight = (new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap,
        byteArray)).getLeftSeedNodesWithWeight();

    // Assert
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(1, actualLeftSeedNodesWithWeight.size());
    assertEquals(Double.valueOf(10.0), actualLeftSeedNodesWithWeight.get(Long.valueOf(1L)));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    longAVLTreeSet.add(Long.valueOf(1L));
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    long2DoubleAVLTreeMap.put(Long.valueOf(1L), Double.valueOf(10.0));
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    SocialProofRequest actualSocialProofRequest = new SocialProofRequest(longAVLTreeSet, long2DoubleAVLTreeMap,
        byteArray);

    // Assert
    Long2DoubleMap actualLeftSeedNodesWithWeight = actualSocialProofRequest.getLeftSeedNodesWithWeight();
    LongSet toBeFiltered = actualSocialProofRequest.getToBeFiltered();
    byte[] socialProofTypes = actualSocialProofRequest.getSocialProofTypes();
    LongSet actualRightNodeIds = actualSocialProofRequest.getRightNodeIds();
    assertSame(long2DoubleAVLTreeMap, actualLeftSeedNodesWithWeight);
    assertEquals(0L, actualSocialProofRequest.getQueryNode());
    assertSame(longAVLTreeSet, actualRightNodeIds);
    assertEquals(24, socialProofTypes.length);
    assertTrue(toBeFiltered instanceof it.unimi.dsi.fastutil.longs.LongArraySet);
  }
}

