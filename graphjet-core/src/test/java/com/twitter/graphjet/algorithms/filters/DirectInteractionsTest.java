package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.bipartite.LeftIndexedPowerLawMultiSegmentBipartiteGraph;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DirectInteractionsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void addDirectInteractionsTest() {
    // Arrange
    DirectInteractions directInteractions = new DirectInteractions(null);
    long queryNode = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    directInteractions.addDirectInteractions(queryNode);
  }

  @Test
  public void constructorTest() {
    // Arrange
    LeftIndexedPowerLawMultiSegmentBipartiteGraph bipartiteGraph = null;

    // Act
    new DirectInteractions(bipartiteGraph);
  }

  @Test
  public void isDirectInteractionTest() {
    // Arrange
    DirectInteractions directInteractions = new DirectInteractions(null);
    long resultNode = 1L;

    // Act
    boolean actual = directInteractions.isDirectInteraction(resultNode);

    // Assert
    assertFalse(actual);
  }
}


