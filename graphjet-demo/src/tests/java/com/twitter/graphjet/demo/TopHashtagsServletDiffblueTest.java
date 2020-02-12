package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.servlet.ServletConfig;
import org.junit.Test;

public class TopHashtagsServletDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TopHashtagsServlet actualTopHashtagsServlet = new TopHashtagsServlet(null, null);

    // Assert
    ServletConfig actualServletConfig = actualTopHashtagsServlet.getServletConfig();
    assertNull(actualServletConfig);
    assertEquals("", actualTopHashtagsServlet.getServletInfo());
  }
}

