package com.twitter.graphjet.algorithms.counting.moment;

import static org.junit.Assert.assertEquals;
import com.twitter.graphjet.algorithms.NodeInfo;
import com.twitter.graphjet.algorithms.RecommendationInfo;
import com.twitter.graphjet.algorithms.filters.ANDFilters;
import com.twitter.graphjet.algorithms.filters.ResultFilter;
import com.twitter.graphjet.algorithms.filters.ResultFilterChain;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class TopSecondDegreeByCountMomentRecsGeneratorTest {
  @Test
  public void generateMomentRecsTest() {
    // Arrange
    Long2DoubleAVLTreeMap long2DoubleAVLTreeMap = new Long2DoubleAVLTreeMap();
    Long.getLong("aaaaa");
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aakaa");
    HashMap<Byte, Integer> hashMap = new HashMap<Byte, Integer>();
    Byte resultByte = new Byte((byte) 0);
    ((HashMap<Byte, Integer>) hashMap).put(resultByte, Integer.getInteger("aaaaa"));
    ArrayList<ResultFilter> arrayList = new ArrayList<ResultFilter>();
    ((ArrayList<ResultFilter>) arrayList).add(null);
    TopSecondDegreeByCountRequestForMoment request = new TopSecondDegreeByCountRequestForMoment(1L,
        long2DoubleAVLTreeMap, longAVLTreeSet, 1, 1, 1, (java.util.Map<Byte, Integer>) hashMap, new byte[21], 1L, 1L,
        new ResultFilterChain((List<ResultFilter>) arrayList));
    ArrayList<NodeInfo> arrayList1 = new ArrayList<NodeInfo>();
    ((ArrayList<NodeInfo>) arrayList1).add(new NodeInfo(1L, 1.0, 1));

    // Act
    List<RecommendationInfo> actual = TopSecondDegreeByCountMomentRecsGenerator.generateMomentRecs(request,
        (List<NodeInfo>) arrayList1);

    // Assert
    assertEquals(0, actual.size());
  }
}
