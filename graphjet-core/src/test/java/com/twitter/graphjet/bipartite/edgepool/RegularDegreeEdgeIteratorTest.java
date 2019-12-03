package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegularDegreeEdgeIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = null;

    // Act
    new RegularDegreeEdgeIterator(regularDegreeEdgePool);
  }

  @Test
  public void currentMetadataTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    regularDegreeEdgeIterator.currentMetadata();
  }

  @Test
  public void hasNextTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);

    // Act
    boolean actual = regularDegreeEdgeIterator.hasNext();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void nextIntTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    regularDegreeEdgeIterator.nextInt();
  }

  @Test
  public void nextTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    regularDegreeEdgeIterator.next();
  }

  @Test
  public void resetForNodeTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);
    int node = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    regularDegreeEdgeIterator.resetForNode(node);
  }

  @Test
  public void skipTest() {
    // Arrange
    RegularDegreeEdgeIterator regularDegreeEdgeIterator = new RegularDegreeEdgeIterator(null);
    int i = 0;

    // Act
    int actual = regularDegreeEdgeIterator.skip(i);

    // Assert
    assertEquals(0, actual);
  }
}






