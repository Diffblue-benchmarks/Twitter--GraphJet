package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.LeftIndexedReaderAccessibleInfoProvider
 */

public class LeftIndexedReaderAccessibleInfoProviderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftNodeEdgePoolIsNullAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new LeftIndexedReaderAccessibleInfoProvider(1, 1, null, null);
    }
}
