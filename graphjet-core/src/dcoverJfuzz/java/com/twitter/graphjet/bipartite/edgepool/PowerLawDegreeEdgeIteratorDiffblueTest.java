package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawDegreeEdgeIteratorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new PowerLawDegreeEdgeIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver()))).resetForNode(1);
  }

  @Test(timeout=10000)
  public void skipTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new PowerLawDegreeEdgeIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver()))).skip(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    PowerLawDegreeEdgeIterator actualPowerLawDegreeEdgeIterator = new PowerLawDegreeEdgeIterator(
        new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver()));

    // Assert
    assertTrue(actualPowerLawDegreeEdgeIterator.powerLawDegreeEdgePool instanceof PowerLawDegreeEdgePool);
    assertEquals(0, actualPowerLawDegreeEdgeIterator.regularDegreeEdgeIterators.length);
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange, Act and Assert
    assertFalse(
        (new PowerLawDegreeEdgeIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver()))).hasNext());
  }
}

