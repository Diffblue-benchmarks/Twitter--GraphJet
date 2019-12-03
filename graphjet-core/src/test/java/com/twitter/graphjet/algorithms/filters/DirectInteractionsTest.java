package com.twitter.graphjet.algorithms.filters;

import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.DirectInteractions
 */

public class DirectInteractionsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorBipartiteGraphIsNull() {
        DirectInteractions directInteractions = new DirectInteractions(null);
        // pojo DirectInteractions
    }

    @Test
    public void isDirectInteractionResultNodeIsOneReturnsFalse() {
        DirectInteractions directInteractions = new DirectInteractions(null);
        assertFalse(directInteractions.isDirectInteraction(1L));
    }

    @Test
    public void addDirectInteractionsQueryNodeIsOneThrows() {
        DirectInteractions directInteractions = new DirectInteractions(null);
        thrown.expect(NullPointerException.class);
        directInteractions.addDirectInteractions(1L);
    }
}
