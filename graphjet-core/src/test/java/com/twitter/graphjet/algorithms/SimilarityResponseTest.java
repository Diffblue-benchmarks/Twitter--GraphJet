package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class SimilarityResponseTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<SimilarityInfo> arrayList = new ArrayList<SimilarityInfo>();
    ((ArrayList<SimilarityInfo>) arrayList).add(new SimilarityInfo(1L, 1.0, 1, 1));
    int queryNodeDegree = 1;

    // Act
    SimilarityResponse similarityResponse = new SimilarityResponse((Iterable<SimilarityInfo>) arrayList,
        queryNodeDegree);

    // Assert
    int degree = similarityResponse.getDegree();
    assertEquals(1, degree);
    assertSame(arrayList, similarityResponse.getRankedSimilarNodes());
  }

  @Test
  public void getDegreeTest() {
    // Arrange
    ArrayList<SimilarityInfo> arrayList = new ArrayList<SimilarityInfo>();
    ((ArrayList<SimilarityInfo>) arrayList).add(new SimilarityInfo(1L, 1.0, 1, 1));
    SimilarityResponse similarityResponse = new SimilarityResponse((Iterable<SimilarityInfo>) arrayList, 1);

    // Act
    int actual = similarityResponse.getDegree();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void getRankedSimilarNodesTest() {
    // Arrange
    ArrayList<SimilarityInfo> arrayList = new ArrayList<SimilarityInfo>();
    ((ArrayList<SimilarityInfo>) arrayList).add(new SimilarityInfo(1L, 1.0, 1, 1));
    SimilarityResponse similarityResponse = new SimilarityResponse((Iterable<SimilarityInfo>) arrayList, 1);

    // Act
    Iterable<SimilarityInfo> actual = similarityResponse.getRankedSimilarNodes();

    // Assert
    assertEquals(1, ((ArrayList<SimilarityInfo>) actual).size());
  }
}


