package com.twitter.graphjet.algorithms.counting;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.RecommendationStats;
import org.junit.Test;

public class TopSecondDegreeByCountResponseDiffblueTest {
  @Test(timeout=10000)
  public void getTopSecondDegreeByCountStatsTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act and Assert
    assertSame(recommendationStats,
        (new TopSecondDegreeByCountResponse(null, recommendationStats)).getTopSecondDegreeByCountStats());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RecommendationStats recommendationStats = new RecommendationStats();

    // Act
    TopSecondDegreeByCountResponse actualTopSecondDegreeByCountResponse = new TopSecondDegreeByCountResponse(null,
        recommendationStats);

    // Assert
    Iterable<RecommendationInfo> actualRankedRecommendations = actualTopSecondDegreeByCountResponse
        .getRankedRecommendations();
    assertNull(actualRankedRecommendations);
    assertSame(recommendationStats, actualTopSecondDegreeByCountResponse.getTopSecondDegreeByCountStats());
  }
}

