package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.counting.moment.MomentRecommendationInfo;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class RecommendationResponseTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(resultByte, new ConnectingUsersWithMetadata(null, null));
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));

    // Act
    RecommendationResponse recommendationResponse = new RecommendationResponse(
        (Iterable<RecommendationInfo>) arrayList);

    // Assert
    assertSame(arrayList, recommendationResponse.getRankedRecommendations());
  }

  @Test
  public void getRankedRecommendationsTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(null, null);
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));
    RecommendationResponse recommendationResponse = new RecommendationResponse(
        (Iterable<RecommendationInfo>) arrayList);

    // Act
    Iterable<RecommendationInfo> actual = recommendationResponse.getRankedRecommendations();

    // Assert
    assertEquals(1, ((ArrayList<RecommendationInfo>) actual).size());
  }
}

