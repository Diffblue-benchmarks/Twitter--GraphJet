package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;
import com.twitter.graphjet.stats.NullStatsReceiver;
import java.util.Arrays;
import org.junit.Test;

public class ExactUserSocialProofSizeFilterDiffblueTest {
  @Test(timeout=10000)
  public void filterResultTest2() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ExactUserSocialProofSizeFilter exactUserSocialProofSizeFilter = new ExactUserSocialProofSizeFilter(10, byteArray,
        new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertTrue(exactUserSocialProofSizeFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void filterResultTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ExactUserSocialProofSizeFilter exactUserSocialProofSizeFilter = new ExactUserSocialProofSizeFilter(0, byteArray,
        new NullStatsReceiver());
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap = new SmallArrayBasedLongToDoubleMap();
    SmallArrayBasedLongToDoubleMap smallArrayBasedLongToDoubleMap1 = new SmallArrayBasedLongToDoubleMap();

    // Act and Assert
    assertFalse(exactUserSocialProofSizeFilter.filterResult(1L, new SmallArrayBasedLongToDoubleMap[]{
        smallArrayBasedLongToDoubleMap, smallArrayBasedLongToDoubleMap1, new SmallArrayBasedLongToDoubleMap()}));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    ExactUserSocialProofSizeFilter actualExactUserSocialProofSizeFilter = new ExactUserSocialProofSizeFilter(10,
        byteArray, new NullStatsReceiver());

    // Assert
    assertTrue(actualExactUserSocialProofSizeFilter.scopedStatsReceiver instanceof NullStatsReceiver);
    assertSame(actualExactUserSocialProofSizeFilter.inputCounter, actualExactUserSocialProofSizeFilter.filteredCounter);
  }
}

