package com.twitter.graphjet.algorithms.filters;

import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.twitter.graphjet.algorithms.filters.ANDFilters
 */

public class ANDFiltersTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorResultFilterListIsEmptyAndStatsReceiverIsNull() {
        ArrayList<ResultFilter> resultFilterList = new ArrayList<ResultFilter>();
        thrown.expect(NullPointerException.class);
        new ANDFilters(resultFilterList, null);
    }
}
