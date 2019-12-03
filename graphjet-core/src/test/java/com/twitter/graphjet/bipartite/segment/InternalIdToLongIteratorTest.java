package com.twitter.graphjet.bipartite.segment;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.bipartite.segment.InternalIdToLongIterator
 */

public class InternalIdToLongIteratorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorEdgeTypeMaskIsNullAndNodesIndexMapIsNull() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        // pojo InternalIdToLongIterator
    }

    @Test
    public void resetWithIntIteratorInputIntIteratorIsNull() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        com.twitter.graphjet.bipartite.api.EdgeIterator result = internalIdToLongIterator.resetWithIntIterator(null);
        assertTrue(result instanceof InternalIdToLongIterator);
        assertSame(internalIdToLongIterator, ((InternalIdToLongIterator)result));
    }

    @Test
    public void currentEdgeTypeThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.currentEdgeType();
    }

    @Test
    public void currentMetadataThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.currentMetadata();
    }

    @Test
    public void hasNextThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.hasNext();
    }

    @Test
    public void nextThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.next();
    }

    @Test
    public void removeThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.remove();
    }

    @Test
    public void skipIIsOneThrows() {
        InternalIdToLongIterator internalIdToLongIterator = new InternalIdToLongIterator(null, null);
        thrown.expect(NullPointerException.class);
        internalIdToLongIterator.skip(1);
    }
}
