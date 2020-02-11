package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.servlet.ServletConfig;
import org.junit.Test;

public class GetEdgesServletDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GetEdgesServlet actualGetEdgesServlet = new GetEdgesServlet(null, GetEdgesServlet.Side.LEFT);

    // Assert
    ServletConfig actualServletConfig = actualGetEdgesServlet.getServletConfig();
    assertNull(actualServletConfig);
    assertEquals("", actualGetEdgesServlet.getServletInfo());
  }
}

