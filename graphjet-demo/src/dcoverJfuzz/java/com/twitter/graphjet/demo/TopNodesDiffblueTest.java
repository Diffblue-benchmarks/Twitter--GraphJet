package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TopNodesDiffblueTest {
  @Test(timeout=10000)
  public void getNodesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new TopNodes(1)).getNodes().size());
  }
}

