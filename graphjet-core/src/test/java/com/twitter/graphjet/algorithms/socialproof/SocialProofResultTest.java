package com.twitter.graphjet.algorithms.socialproof;

import com.twitter.graphjet.algorithms.RecommendationType;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SocialProofResultTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    Long node = Long.getLong("aaaaa");
    Byte2ObjectAVLTreeMap<LongSet> byte2ObjectAVLTreeMap = new Byte2ObjectAVLTreeMap<LongSet>();
    Byte resultByte = new Byte((byte) 0);
    LongAVLTreeSet longAVLTreeSet = new LongAVLTreeSet();
    Long.getLong("aaaaa");
    byte2ObjectAVLTreeMap.put((Object) resultByte, longAVLTreeSet);
    double weight = 1.0;
    RecommendationType recommendationType = RecommendationType.HASHTAG;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new SocialProofResult(node, (it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<LongSet>) byte2ObjectAVLTreeMap, weight,
        recommendationType);
  }
}
