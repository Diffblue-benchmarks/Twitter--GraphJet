package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.servlet.ServletConfig;
import org.junit.Test;

public class TopUsersServletDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TopUsersServlet actualTopUsersServlet = new TopUsersServlet(null, null);

    // Assert
    ServletConfig actualServletConfig = actualTopUsersServlet.getServletConfig();
    assertNull(actualServletConfig);
    assertEquals("", actualTopUsersServlet.getServletInfo());
  }
}

