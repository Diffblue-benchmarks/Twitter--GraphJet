package com.twitter.graphjet.algorithms.counting.tweetfeature;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.RecommendationType;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;

public class TweetRecommendationInfoTest {
  @Test
  public void constructorTest() {
    // Arrange
    long recommendation = 1L;
    double weight = 1.0;
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    Byte resultByte = new Byte((byte) 0);
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 1, 655361), 1, 1);
    Long.getLong("aaaaa");
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(resultByte,
        new ConnectingUsersWithMetadata(longSubList, longSubList));
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[2] = 11;

    // Act
    TweetRecommendationInfo tweetRecommendationInfo = new TweetRecommendationInfo(recommendation, weight,
        (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap, intArray);

    // Assert
    long recommendation1 = tweetRecommendationInfo.getRecommendation();
    RecommendationType recommendationType = tweetRecommendationInfo.getRecommendationType();
    double weight1 = tweetRecommendationInfo.getWeight();
    String toStringResult = tweetRecommendationInfo.toString();
    assertEquals(1L, recommendation1);
    assertEquals(8, tweetRecommendationInfo.getTweetFeature().length);
    assertEquals(
        "TweetRecommendationInfo{recommendation=1, recommendationType=TWEET, weight=1.0, socialProof={0=connectingUsers = [], metadata = []}}",
        toStringResult);
    assertEquals(1.0, weight1, 0.0);
    assertEquals(RecommendationType.TWEET, recommendationType);
  }

  @Test
  public void getTweetFeatureTest() {
    // Arrange
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(resultByte, new ConnectingUsersWithMetadata(
        new AbstractLongList.LongSubList(null, 1, 167772161), new AbstractLongList.LongSubList(null, 1, 167772161)));
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[6] = 2561;
    TweetRecommendationInfo tweetRecommendationInfo = new TweetRecommendationInfo(1L, 1.0,
        (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap, intArray);
    int[] intArray1 = new int[8];
    Arrays.fill(intArray1, 1);
    intArray1[5] = 655361;
    tweetRecommendationInfo.tweetFeature = intArray1;

    // Act
    int[] actual = tweetRecommendationInfo.getTweetFeature();

    // Assert
    assertEquals(8, actual.length);
  }
}

