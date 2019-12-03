package com.twitter.graphjet.algorithms.socialproof;

import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.counting.moment.MomentRecommendationInfo;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class SocialProofResponseTest {
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
    SocialProofResponse socialProofResponse = new SocialProofResponse((java.util.List<RecommendationInfo>) arrayList);

    // Assert
    assertSame(arrayList, socialProofResponse.getRankedRecommendations());
  }
}
