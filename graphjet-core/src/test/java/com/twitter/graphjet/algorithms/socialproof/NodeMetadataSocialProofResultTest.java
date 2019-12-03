package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.RecommendationType;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Test;

public class NodeMetadataSocialProofResultTest {
  @Test
  public void constructorTest() {
    // Arrange
    int nodeMetadataId = 1;
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    Long.getLong("aaaka");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    double weight = 1.0;
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(nodeMetadataId,
        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, weight,
        recommendationType);

    // Assert
    RecommendationType recommendationType1 = nodeMetadataSocialProofResult.getRecommendationType();
    int nodeMetadataId1 = nodeMetadataSocialProofResult.getNodeMetadataId();
    double weight1 = nodeMetadataSocialProofResult.getWeight();
    assertEquals(0, nodeMetadataSocialProofResult.getSocialProofSize());
    assertEquals(1.0, weight1, 0.0);
    assertEquals(RecommendationType.HASHTAG, recommendationType1);
    assertEquals(1, nodeMetadataId1);
  }

  @Test
  public void getNodeMetadataIdTest() {
    // Arrange
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1,
        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, 1.0,
        RecommendationType.USER);

    // Act
    int actual = nodeMetadataSocialProofResult.getNodeMetadataId();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getRecommendationTypeTest() {
    // Arrange
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1,
        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, 1.0,
        RecommendationType.USER);

    // Act
    RecommendationType actual = nodeMetadataSocialProofResult.getRecommendationType();

    // Assert
    assertEquals(RecommendationType.USER, actual);
  }

  @Test
  public void getSocialProofSizeTest() {
    // Arrange
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1,
        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, 1.0,
        RecommendationType.USER);

    // Act
    int actual = nodeMetadataSocialProofResult.getSocialProofSize();

    // Assert
    assertEquals(0, actual);
    assertEquals(0, nodeMetadataSocialProofResult.getSocialProofSize());
  }

  @Test
  public void getSocialProofTest() {
    // Arrange
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1,
        (Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, 1.0, RecommendationType.USER);

    // Act
    Byte2ObjectMap<Long2ObjectMap<LongSet>> actual = nodeMetadataSocialProofResult.getSocialProof();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getWeightTest() {
    // Arrange
    Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<Long2ObjectMap<LongSet>>();
    Byte resultByte = new Byte((byte) 0);
    Long2ObjectAVLTreeMap<LongSet> long2ObjectAVLTreeMap = new Long2ObjectAVLTreeMap<LongSet>();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, long2ObjectAVLTreeMap);
    NodeMetadataSocialProofResult nodeMetadataSocialProofResult = new NodeMetadataSocialProofResult(1,
        (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<Long2ObjectMap<LongSet>>) byte2ObjectAVLTreeMap, 1.0,
        RecommendationType.USER);

    // Act
    double actual = nodeMetadataSocialProofResult.getWeight();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }
}





