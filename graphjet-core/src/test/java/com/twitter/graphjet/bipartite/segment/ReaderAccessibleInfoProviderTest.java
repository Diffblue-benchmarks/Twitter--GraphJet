package com.twitter.graphjet.bipartite.segment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.ReaderAccessibleInfoProvider
 */

public class ReaderAccessibleInfoProviderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorExpectedNumLeftNodesIsOneAndExpectedNumRightNodesIsOneAndLeftNodeEdgePoolIsNullAndRightNodeEdgePoolIsNullAndStatsReceiverIsNull() {
        thrown.expect(NullPointerException.class);
        new ReaderAccessibleInfoProvider(1, 1, null, null, null);
    }
}
