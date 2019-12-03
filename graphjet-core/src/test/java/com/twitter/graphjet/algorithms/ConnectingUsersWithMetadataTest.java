package com.twitter.graphjet.algorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata
 */

public class ConnectingUsersWithMetadataTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorMetadataIsNullAndUsersIsNull() {
        ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(null, null);
        assertNull(connectingUsersWithMetadata.getConnectingUsers());
        assertNull(connectingUsersWithMetadata.getMetadata());
    }

    @Test
    public void equalsObjIsNull() {
        ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(null, null);
        assertFalse(connectingUsersWithMetadata.equals(null));
    }

    @Test
    public void equalsReturnsTrue() {
        ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(null, null);
        Object obj = new ConnectingUsersWithMetadata(null, null);
        assertTrue(connectingUsersWithMetadata.equals(obj));
    }

    @Test
    public void testequals() {
        ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(null, null);
        Object obj = new StringBuilder();
        assertFalse(connectingUsersWithMetadata.equals(obj));
    }

    @Test
    public void hashCodeThrows() {
        ConnectingUsersWithMetadata connectingUsersWithMetadata = new ConnectingUsersWithMetadata(null, null);
        thrown.expect(NullPointerException.class);
        connectingUsersWithMetadata.hashCode();
    }
}
