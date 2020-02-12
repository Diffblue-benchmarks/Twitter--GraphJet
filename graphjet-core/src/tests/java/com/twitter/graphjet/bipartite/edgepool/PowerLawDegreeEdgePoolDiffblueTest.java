package com.twitter.graphjet.bipartite.edgepool;

import static org.junit.Assert.assertFalse;
import com.twitter.graphjet.stats.NullStatsReceiver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerLawDegreeEdgePoolDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void addEdgeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver())).addEdge(2, 2, 1L);
  }

  @Test(timeout=10000)
  public void hasEdgeMetadataTest() {
    // Arrange, Act and Assert
    assertFalse((new PowerLawDegreeEdgePool(10, 1, 10.0, new NullStatsReceiver())).hasEdgeMetadata());
  }
}

