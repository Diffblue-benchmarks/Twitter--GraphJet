package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawDegreeEdgeRandomIteratorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void resetForNodeTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new PowerLawDegreeEdgeRandomIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver())))
        .resetForNode(1, 10, null);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    PowerLawDegreeEdgePool powerLawDegreeEdgePool = new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver());

    // Act
    PowerLawDegreeEdgeRandomIterator actualPowerLawDegreeEdgeRandomIterator = new PowerLawDegreeEdgeRandomIterator(
        powerLawDegreeEdgePool);

    // Assert
    assertEquals(0, actualPowerLawDegreeEdgeRandomIterator.regularDegreeEdgeIterators.length);
    assertSame(powerLawDegreeEdgePool, actualPowerLawDegreeEdgeRandomIterator.powerLawDegreeEdgePool);
  }

  @Test(timeout=10000)
  public void currentMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new PowerLawDegreeEdgeRandomIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver())))
            .currentMetadata());
  }

  @Test(timeout=10000)
  public void hasNextTest() {
    // Arrange, Act and Assert
    assertFalse((new PowerLawDegreeEdgeRandomIterator(new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver())))
        .hasNext());
  }
}

