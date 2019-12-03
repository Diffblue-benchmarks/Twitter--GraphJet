package com.twitter.graphjet.algorithms.counting.tweet;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.RecommendationType;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
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

    // Act
    TweetRecommendationInfo tweetRecommendationInfo = new TweetRecommendationInfo(recommendation, weight,
        (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap);

    // Assert
    long recommendation1 = tweetRecommendationInfo.getRecommendation();
    RecommendationType recommendationType = tweetRecommendationInfo.getRecommendationType();
    double weight1 = tweetRecommendationInfo.getWeight();
    assertEquals(1L, recommendation1);
    assertEquals(
        "TweetRecommendationInfo{recommendation=1, recommendationType=TWEET, weight=1.0, socialProof={0=connectingUsers = [], metadata = []}}",
        tweetRecommendationInfo.toString());
    assertEquals(1.0, weight1, 0.0);
    assertEquals(RecommendationType.TWEET, recommendationType);
  }
}
