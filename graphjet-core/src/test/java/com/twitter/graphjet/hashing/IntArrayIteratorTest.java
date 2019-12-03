package com.twitter.graphjet.hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IntArrayIteratorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    ArrayBasedIntToIntArrayMap arrayBasedIntToIntArrayMap = null;

    // Act
    new IntArrayIterator(arrayBasedIntToIntArrayMap);
  }
  @Test
  public void hasNextTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);

    // Act
    boolean actual = intArrayIterator.hasNext();

    // Assert
    assertFalse(actual);
  }
  @Test
  public void nextIntTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    intArrayIterator.nextInt();
  }
  @Test
  public void nextTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    intArrayIterator.next();
  }
  @Test
  public void resetForNodeTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);
    int node = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    intArrayIterator.resetForNode(node);
  }
  @Test
  public void sizeTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);

    // Act
    int actual = intArrayIterator.size();

    // Assert
    assertEquals(0, actual);
  }
  @Test
  public void skipTest() {
    // Arrange
    IntArrayIterator intArrayIterator = new IntArrayIterator(null);
    int i = 0;

    // Act
    int actual = intArrayIterator.skip(i);

    // Assert
    assertEquals(0, actual);
  }
}






