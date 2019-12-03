package com.twitter.graphjet.algorithms.counting;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.RecommendationStats;
import com.twitter.graphjet.algorithms.counting.moment.MomentRecommendationInfo;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class TopSecondDegreeByCountResponseTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(resultByte, new ConnectingUsersWithMetadata(null, null));
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    TopSecondDegreeByCountResponse topSecondDegreeByCountResponse = new TopSecondDegreeByCountResponse(
        (Iterable<RecommendationInfo>) arrayList, recommendationStats);

    // Assert
    Iterable<RecommendationInfo> rankedRecommendations = topSecondDegreeByCountResponse.getRankedRecommendations();
    assertSame(arrayList, rankedRecommendations);
    assertSame(recommendationStats, topSecondDegreeByCountResponse.getTopSecondDegreeByCountStats());
  }

  @Test
  public void getTopSecondDegreeByCountStatsTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(null, null);
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));
    RecommendationStats recommendationStats = new RecommendationStats();
    TopSecondDegreeByCountResponse topSecondDegreeByCountResponse = new TopSecondDegreeByCountResponse(
        (Iterable<RecommendationInfo>) arrayList, recommendationStats);

    // Act
    RecommendationStats actual = topSecondDegreeByCountResponse.getTopSecondDegreeByCountStats();

    // Assert
    assertSame(recommendationStats, actual);
  }
}

