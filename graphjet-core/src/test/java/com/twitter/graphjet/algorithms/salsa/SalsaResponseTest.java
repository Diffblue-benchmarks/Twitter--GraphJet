package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.counting.moment.MomentRecommendationInfo;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class SalsaResponseTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(resultByte, new ConnectingUsersWithMetadata(null, null));
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));
    SalsaStats salsaStats = new SalsaStats();

    // Act
    SalsaResponse salsaResponse = new SalsaResponse((Iterable<RecommendationInfo>) arrayList, salsaStats);

    // Assert
    SalsaStats salsaStats1 = salsaResponse.getSalsaStats();
    assertSame(salsaStats, salsaStats1);
    assertSame(arrayList, salsaResponse.getRankedRecommendations());
  }

  @Test
  public void getSalsaStatsTest() {
    // Arrange
    ArrayList<RecommendationInfo> arrayList = new ArrayList<RecommendationInfo>();
    HashMap<Byte, ConnectingUsersWithMetadata> hashMap = new HashMap<Byte, ConnectingUsersWithMetadata>();
    ((HashMap<Byte, ConnectingUsersWithMetadata>) hashMap).put(null, null);
    ((ArrayList<RecommendationInfo>) arrayList)
        .add(new MomentRecommendationInfo(1L, 1.0, (java.util.Map<Byte, ConnectingUsersWithMetadata>) hashMap));
    SalsaStats salsaStats = new SalsaStats();
    SalsaResponse salsaResponse = new SalsaResponse((Iterable<RecommendationInfo>) arrayList, salsaStats);

    // Act
    SalsaStats actual = salsaResponse.getSalsaStats();

    // Assert
    assertSame(salsaStats, actual);
  }
}

