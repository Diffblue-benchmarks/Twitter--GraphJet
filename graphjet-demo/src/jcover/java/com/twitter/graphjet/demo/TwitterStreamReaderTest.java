package com.twitter.graphjet.demo;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.demo.TwitterStreamReader
 *
 * @author Diffblue JCover
 */

public class TwitterStreamReaderTest {

    @Test(timeout=10000)
    public void mainArgvIsBroadway() throws Exception {
        String[] argv = new String[] { "Broadway" };
        TwitterStreamReader.main(argv);
    }
}
