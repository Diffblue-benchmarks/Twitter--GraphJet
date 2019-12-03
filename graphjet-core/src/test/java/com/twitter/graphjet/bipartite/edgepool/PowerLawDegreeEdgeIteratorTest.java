package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawDegreeEdgeIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    PowerLawDegreeEdgePool powerLawDegreeEdgePool = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new PowerLawDegreeEdgeIterator(powerLawDegreeEdgePool);
  }
}
