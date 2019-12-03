package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegularDegreeEdgeRandomIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa"));

    // Act
    new RegularDegreeEdgeRandomIterator(regularDegreeEdgePool);
  }

  @Test
  public void hasNextTest() {
    // Arrange
    RegularDegreeEdgeRandomIterator regularDegreeEdgeRandomIterator = new RegularDegreeEdgeRandomIterator(
        new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa")));

    // Act
    boolean actual = regularDegreeEdgeRandomIterator.hasNext();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void nextIntTest() {
    // Arrange
    RegularDegreeEdgeRandomIterator regularDegreeEdgeRandomIterator = new RegularDegreeEdgeRandomIterator(
        new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa")));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    regularDegreeEdgeRandomIterator.nextInt();
  }

  @Test
  public void resetForNodeTest() {
    // Arrange
    RegularDegreeEdgeRandomIterator regularDegreeEdgeRandomIterator = new RegularDegreeEdgeRandomIterator(
        new RegularDegreeEdgePool(1, 1, new DefaultStatsReceiver("aaaaa")));
    int node = 1;
    int numSamplesToGet = 1;
    Random randomGen = new Random();

    // Act
    RegularDegreeEdgeRandomIterator actual = regularDegreeEdgeRandomIterator.resetForNode(node, numSamplesToGet,
        randomGen);

    // Assert
    assertSame(regularDegreeEdgeRandomIterator, actual);
  }
}



