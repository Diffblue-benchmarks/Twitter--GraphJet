package com.twitter.graphjet.demo;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.demo.PageRankGraphJetDemo
 *
 * @author Diffblue JCover
 */

public class PageRankGraphJetDemoTest {

    @Test(timeout=10000)
    public void mainArgvIsFoo() throws Exception {
        String[] argv = new String[] { "foo" };
        PageRankGraphJetDemo.main(argv);
    }
}
