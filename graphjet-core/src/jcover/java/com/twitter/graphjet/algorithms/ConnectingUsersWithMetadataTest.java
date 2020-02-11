package com.twitter.graphjet.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import it.unimi.dsi.fastutil.longs.LongList;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.ConnectingUsersWithMetadata
 *
 * @author Diffblue JCover
 */

public class ConnectingUsersWithMetadataTest {

    @Test(timeout=10000)
    public void equalsObjIsFoo() {
        LongList users = mock(LongList.class);
        LongList metadata = mock(LongList.class);
        assertThat(new ConnectingUsersWithMetadata(users, metadata).equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void equalsObjIsNull() {
        LongList users = mock(LongList.class);
        LongList metadata = mock(LongList.class);
        assertThat(new ConnectingUsersWithMetadata(users, metadata).equals(null), is(false));
    }

    @Test(timeout=10000)
    public void getConnectingUsers() {
        LongList users = mock(LongList.class);
        LongList metadata = mock(LongList.class);
        assertThat(new ConnectingUsersWithMetadata(users, metadata).getConnectingUsers(), sameInstance(users));
    }

    @Test(timeout=10000)
    public void getMetadata() {
        LongList users = mock(LongList.class);
        LongList metadata = mock(LongList.class);
        assertThat(new ConnectingUsersWithMetadata(users, metadata).getMetadata(), sameInstance(metadata));
    }
}
