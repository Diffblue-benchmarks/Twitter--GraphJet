package com.twitter.graphjet.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.servlet.ServletConfig;
import org.junit.Test;

public class GetSimilarHashtagsServletDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GetSimilarHashtagsServlet actualGetSimilarHashtagsServlet = new GetSimilarHashtagsServlet(null, null);

    // Assert
    ServletConfig actualServletConfig = actualGetSimilarHashtagsServlet.getServletConfig();
    assertNull(actualServletConfig);
    assertEquals("", actualGetSimilarHashtagsServlet.getServletInfo());
  }
}

