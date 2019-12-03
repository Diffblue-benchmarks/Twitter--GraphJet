package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class TweetMetadataRecommendationInfoTest {
  @Test
  public void addToTweetSocialProofsTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);
    byte socialProofType = (byte) 0;
    SmallArrayBasedLongToDoubleMap userSocialProofs = new SmallArrayBasedLongToDoubleMap();
    long rightNode = 1L;
    int maxUserSocialProofSize = 0;
    int maxTweetSocialProofSize = 0;

    // Act
    tweetMetadataRecommendationInfo.addToTweetSocialProofs(socialProofType, userSocialProofs, rightNode,
        maxUserSocialProofSize, maxTweetSocialProofSize);
  }

  @Test
  public void addToWeightTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);
    double delta = 1.0;

    // Act
    tweetMetadataRecommendationInfo.addToWeight(delta);

    // Assert
    assertEquals(2.0, tweetMetadataRecommendationInfo.getWeight(), 0.0);
  }

  @Test
  public void compareToTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    int actual = tweetMetadataRecommendationInfo.compareTo(tweetMetadataRecommendationInfo);

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void constructorTest() {
    // Arrange
    int recommendation = 0;
    RecommendationType type = RecommendationType.HASHTAG;
    double weight = 1.0;
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, longSubList);
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);

    // Act
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(
        recommendation, type, weight, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Assert
    int recommendation1 = tweetMetadataRecommendationInfo.getRecommendation();
    RecommendationType recommendationType = tweetMetadataRecommendationInfo.getRecommendationType();
    double weight1 = tweetMetadataRecommendationInfo.getWeight();
    assertEquals(0, recommendation1);
    assertEquals(
        "TweetMetadataRecommendationInfo{recommendation=0, recommendationType=HASHTAG, weight=1.0, socialProof={0={null=[]}}}",
        tweetMetadataRecommendationInfo.toString());
    assertEquals(1.0, weight1, 0.0);
    assertEquals(RecommendationType.HASHTAG, recommendationType);
  }

  @Test
  public void equalsTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);
    String obj = "aaaaa";

    // Act
    boolean actual = tweetMetadataRecommendationInfo.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getRecommendationTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    int actual = tweetMetadataRecommendationInfo.getRecommendation();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getRecommendationTypeTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    RecommendationType actual = tweetMetadataRecommendationInfo.getRecommendationType();

    // Assert
    assertEquals(RecommendationType.HASHTAG, actual);
  }

  @Test
  public void getSocialProofTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    Map<Byte, Map<Long, LongList>> actual = tweetMetadataRecommendationInfo.getSocialProof();

    // Assert
    assertEquals(1, actual.size());
  }

  @Test
  public void getWeightTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    double actual = tweetMetadataRecommendationInfo.getWeight();

    // Assert
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    int actual = tweetMetadataRecommendationInfo.hashCode();

    // Assert
    assertEquals(403227144, actual);
  }

  @Test
  public void toStringTest() {
    // Arrange
    HashMap<Byte, Map<Long, LongList>> hashMap = new HashMap<Byte, Map<Long, LongList>>();
    Byte resultByte = new Byte((byte) 0);
    HashMap<Long, LongList> hashMap1 = new HashMap<Long, LongList>();
    Long theLong = Long.getLong("aaaaa");
    ((HashMap<Long, LongList>) hashMap1).put(theLong, new AbstractLongList.LongSubList(null, 0, 0));
    ((HashMap<Byte, Map<Long, LongList>>) hashMap).put(resultByte, hashMap1);
    TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(0,
        RecommendationType.HASHTAG, 1.0, (Map<Byte, Map<Long, LongList>>) hashMap);

    // Act
    String actual = tweetMetadataRecommendationInfo.toString();

    // Assert
    assertEquals(
        "TweetMetadataRecommendationInfo{recommendation=0, recommendationType=HASHTAG, weight=1.0, socialProof={0={null=[]}}}",
        actual);
  }
}










