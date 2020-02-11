package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Test;

public class SocialProofTypesFilterDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SocialProofTypesFilter actualSocialProofTypesFilter = new SocialProofTypesFilter(new NullStatsReceiver());

    // Assert
    assertTrue(actualSocialProofTypesFilter.scopedStatsReceiver instanceof NullStatsReceiver);
    assertSame(actualSocialProofTypesFilter.inputCounter, actualSocialProofTypesFilter.filteredCounter);
  }
}

