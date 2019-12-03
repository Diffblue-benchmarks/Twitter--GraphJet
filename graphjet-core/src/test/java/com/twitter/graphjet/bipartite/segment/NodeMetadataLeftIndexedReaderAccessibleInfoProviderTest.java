package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.NodeMetadataLeftIndexedReaderAccessibleInfoProvider
 */

public class NodeMetadataLeftIndexedReaderAccessibleInfoProviderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNumRightNodeMetadataTypesIsOne() {
        thrown.expect(NullPointerException.class);
        new NodeMetadataLeftIndexedReaderAccessibleInfoProvider(1, 1, 1, null, null);
    }

    @Test
    public void constructorNumRightNodeMetadataTypesIsZero() {
        thrown.expect(NullPointerException.class);
        new NodeMetadataLeftIndexedReaderAccessibleInfoProvider(1, 1, 0, null, null);
    }
}
