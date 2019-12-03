package com.twitter.graphjet.bipartite.edgepool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecyclePoolMemoryTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void recyclePowerLawDegreeEdgePoolTest() {
    // Arrange
    PowerLawDegreeEdgePool powerLawDegreeEdgePool = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    RecyclePoolMemory.recyclePowerLawDegreeEdgePool(powerLawDegreeEdgePool);
  }
  @Test
  public void recycleRegularDegreeEdgePoolTest() {
    // Arrange
    RegularDegreeEdgePool regularDegreeEdgePool = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    RecyclePoolMemory.recycleRegularDegreeEdgePool(regularDegreeEdgePool);
  }
}

