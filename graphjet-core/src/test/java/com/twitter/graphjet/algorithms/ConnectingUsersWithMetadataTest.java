package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import it.unimi.dsi.fastutil.longs.AbstractLongList;
import it.unimi.dsi.fastutil.longs.LongList;
import org.junit.Test;

public class ConnectingUsersWithMetadataTest {
  @Test
  public void constructorTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(null, 0, 0);
    Long.getLong("aaaaa");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("akaaa");
    AbstractLongList.LongSubList users = new AbstractLongList.LongSubList(longSubList1, 0, 0);
    Long.getLong("aaaaa");

    // Act
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(users, longSubList1);

    // Assert
    assertEquals("connectingUsers = [], metadata = []", connectingUsersWithMetadata.toString());
  }

  @Test
  public void equalsTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaak");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("aaaaa");
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(longSubList1,
        longSubList1);
    String obj = "aaaaa";

    // Act
    boolean actual = connectingUsersWithMetadata.equals(obj);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getConnectingUsersTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaak");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("aaaaa");
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(longSubList1,
        longSubList1);

    // Act
    LongList actual = connectingUsersWithMetadata.getConnectingUsers();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getMetadataTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaak");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("aaaaa");
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(longSubList1,
        longSubList1);

    // Act
    LongList actual = connectingUsersWithMetadata.getMetadata();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaak");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("aaaaa");
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(longSubList1,
        longSubList1);

    // Act
    int actual = connectingUsersWithMetadata.hashCode();

    // Assert
    assertEquals(1, actual);
  }

  @Test
  public void toStringTest() {
    // Arrange
    AbstractLongList.LongSubList longSubList = new AbstractLongList.LongSubList(
        new AbstractLongList.LongSubList(null, 0, 0), 0, 0);
    Long.getLong("aaaak");
    AbstractLongList.LongSubList longSubList1 = new AbstractLongList.LongSubList(longSubList, 0, 0);
    Long.getLong("aaaaa");
    ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(longSubList1,
        longSubList1);

    // Act
    String actual = connectingUsersWithMetadata.toString();

    // Assert
    assertEquals("connectingUsers = [], metadata = []", actual);
  }
}





