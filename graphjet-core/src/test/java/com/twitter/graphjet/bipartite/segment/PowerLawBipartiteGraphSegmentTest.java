package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.bipartite.api.ReusableNodeIntIterator;
import com.twitter.graphjet.bipartite.api.ReusableNodeRandomIntIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeIterator;
import com.twitter.graphjet.bipartite.edgepool.OptimizedEdgePool;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawBipartiteGraphSegmentTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void EdgeIteratorFactoryConstructorTest() {
    // Arrange and Act
    new PowerLawBipartiteGraphSegment.EdgeIteratorFactory();
  }
  @Test
  public void EdgeIteratorFactoryCreateEdgeIteratorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[6] = 655361;
    OptimizedEdgePool edgePool = new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aaaaa"));

    // Act
    ReusableNodeIntIterator actual = PowerLawBipartiteGraphSegment.EdgeIteratorFactory.createEdgeIterator(edgePool);

    // Assert
    assertEquals(Integer.valueOf(0), ((OptimizedEdgeIterator) actual).next());
  }
  @Test
  public void EdgeIteratorFactoryCreateRandomEdgeIteratorTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);
    intArray[6] = 655361;
    OptimizedEdgePool edgePool = new OptimizedEdgePool(intArray, 1, new DefaultStatsReceiver("aaaaa"));

    // Act
    ReusableNodeRandomIntIterator actual = PowerLawBipartiteGraphSegment.EdgeIteratorFactory
        .createRandomEdgeIterator(edgePool);

    // Assert
    assertTrue(actual instanceof com.twitter.graphjet.bipartite.edgepool.OptimizedEdgeRandomIterator);
  }
  @Test
  public void constructorTest() {
    // Arrange
    int expectedNumLeftNodes = 1;
    int expectedMaxLeftDegree = 1;
    double leftPowerLawExponent = 1.0;
    int expectedNumRightNodes = 1;
    int expectedMaxRightDegree = 1;
    double rightPowerLawExponent = 1.0;
    int maxNumEdges = 1;
    IdentityEdgeTypeMask edgeTypeMask = new IdentityEdgeTypeMask();
    DefaultStatsReceiver statsReceiver = new DefaultStatsReceiver("leftNodeEdgePool");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new PowerLawBipartiteGraphSegment(expectedNumLeftNodes, expectedMaxLeftDegree, leftPowerLawExponent,
        expectedNumRightNodes, expectedMaxRightDegree, rightPowerLawExponent, maxNumEdges, edgeTypeMask, statsReceiver);
  }
}



