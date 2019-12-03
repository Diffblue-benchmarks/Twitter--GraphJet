package com.twitter.graphjet.algorithms.salsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import com.twitter.graphjet.stats.DefaultStatsReceiver;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalsaRequestBuilderTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);

    // Act
    SalsaRequest actual = salsaRequestBuilder.build();

    // Assert
    Long2DoubleMap leftSeedNodesWithWeight = actual.getLeftSeedNodesWithWeight();
    int numRandomWalks = actual.getNumRandomWalks();
    int maxNumResults = actual.getMaxNumResults();
    int maxSocialProofTypeSize = actual.getMaxSocialProofTypeSize();
    LongSet toBeFiltered = actual.getToBeFiltered();
    int maxRandomWalkLength = actual.getMaxRandomWalkLength();
    double queryNodeWeightFraction = actual.getQueryNodeWeightFraction();
    byte[] socialProofTypes = actual.getSocialProofTypes();
    double resetProbability = actual.getResetProbability();
    int maxSocialProofSize = actual.getMaxSocialProofSize();
    assertTrue(leftSeedNodesWithWeight instanceof it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap);
    assertEquals(1L, actual.getQueryNode());
    assertEquals(0, maxSocialProofSize);
    assertEquals(0.3, resetProbability, 0.0);
    assertEquals(1, socialProofTypes.length);
    assertEquals(0.9, queryNodeWeightFraction, 0.0);
    assertEquals(1, maxRandomWalkLength);
    assertTrue(toBeFiltered instanceof it.unimi.dsi.fastutil.longs.LongOpenHashSet);
    assertEquals(1, maxSocialProofTypeSize);
    assertEquals(10, maxNumResults);
    assertEquals(1, numRandomWalks);
  }

  @Test
  public void constructorTest() {
    // Arrange
    long queryNode = 1L;

    // Act
    new SalsaRequestBuilder(queryNode);
  }

  @Test
  public void removeNegativeNodesTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    boolean inputRemoveNegativeNodes = true;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.removeNegativeNodes(inputRemoveNegativeNodes);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withLeftSeedNodesTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    Long2DoubleAVLTreeMap inputLeftSeedNodes = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withLeftSeedNodes(inputLeftSeedNodes);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withMaxNumResultsTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    int inputMaxNumResults = 0;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withMaxNumResults(inputMaxNumResults);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withMaxRandomWalkLengthTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    int inputMaxRandomWalkLength = 0;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    salsaRequestBuilder.withMaxRandomWalkLength(inputMaxRandomWalkLength);
  }

  @Test
  public void withMaxSocialProofSizeTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    int inputMaxSocialProofSize = 0;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withMaxSocialProofSize(inputMaxSocialProofSize);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withMaxSocialProofTypeSizeTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    int inputMaxSocialProofTypeSize = 0;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withMaxSocialProofTypeSize(inputMaxSocialProofTypeSize);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withNumRandomWalksTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    int inputNumRandomWalks = 0;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withNumRandomWalks(inputNumRandomWalks);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withQueryNodeWeightFractionTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    double inputQueryNodeWeightFraction = 0.3;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withQueryNodeWeightFraction(inputQueryNodeWeightFraction);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withResetProbabilityTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    double inputResetProbability = 0.3;

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withResetProbability(inputResetProbability);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withResultFilterChainTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ArrayList<ResultFilter> arrayList1 = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList1).add(null);
    ((ArrayList<ResultFilter>) arrayList)
        .add(new ANDFilters((java.util.List<ResultFilter>) arrayList1, new DefaultStatsReceiver("aaaka")));
    ResultFilterChain inputResultFilterChain = new ResultFilterChain((java.util.List<ResultFilter>) arrayList);

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withResultFilterChain(inputResultFilterChain);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withToBeFilteredTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    LongAVLTreeSet inputToBeFiltered = new LongAVLTreeSet();
    Long.getLong("aaaaa");

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withToBeFiltered(inputToBeFiltered);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }

  @Test
  public void withValidSocialProofTypesTest() {
    // Arrange
    SalsaRequestBuilder salsaRequestBuilder = new SalsaRequestBuilder(1L);
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 10);

    // Act
    SalsaRequestBuilder actual = salsaRequestBuilder.withValidSocialProofTypes(byteArray);

    // Assert
    assertSame(salsaRequestBuilder, actual);
  }
}













