package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NodeValueEntryDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NodeValueEntry actualNodeValueEntry = new NodeValueEntry(1L, 10.0);

    // Assert
    long actualNode = actualNodeValueEntry.getNode();
    assertEquals(1L, actualNode);
    assertEquals(10.0, actualNodeValueEntry.getValue(), 0.0);
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new NodeValueEntry(1L, 10.0)).getValue(), 0.0);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("(1, 10.0)", (new NodeValueEntry(1L, 10.0)).toString());
  }

  @Test(timeout=10000)
  public void getNodeTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new NodeValueEntry(1L, 10.0)).getNode());
  }

  @Test(timeout=10000)
  public void compareToTest4() {
    // Arrange
    NodeValueEntry nodeValueEntry = new NodeValueEntry(0L, 10.0);

    // Act and Assert
    assertEquals(-1, nodeValueEntry.compareTo(new NodeValueEntry(1L, 10.0)));
  }

  @Test(timeout=10000)
  public void compareToTest3() {
    // Arrange
    NodeValueEntry nodeValueEntry = new NodeValueEntry(1L, 10.0);

    // Act and Assert
    assertEquals(1, nodeValueEntry.compareTo(new NodeValueEntry(1L, 0.5)));
  }

  @Test(timeout=10000)
  public void compareToTest2() {
    // Arrange
    NodeValueEntry nodeValueEntry = new NodeValueEntry(1L, 0.5);

    // Act and Assert
    assertEquals(-1, nodeValueEntry.compareTo(new NodeValueEntry(1L, 10.0)));
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    NodeValueEntry nodeValueEntry = new NodeValueEntry(1L, 10.0);

    // Act and Assert
    assertEquals(1, nodeValueEntry.compareTo(new NodeValueEntry(1L, 10.0)));
  }
}

