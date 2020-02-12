package com.twitter.graphjet.algorithms.counting.tweet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;

import com.twitter.graphjet.algorithms.RecommendationType;
import com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.twitter.graphjet.algorithms.counting.tweet.TweetMetadataRecommendationInfo
 *
 * @author Diffblue JCover
 */

public class TweetMetadataRecommendationInfoDiffblueTest {

    @Test(timeout=10000)
    public void addToTweetSocialProofsMaxTweetSocialProofSizeIsOneAndMaxUserSocialProofSizeIsZeroAndRightNodeIsOneAndSocialProofTypeIsOne() {
        new TweetMetadataRecommendationInfo(-1, com.twitter.graphjet.algorithms.RecommendationType.HASHTAG, 1.0, new java.util.HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).addToTweetSocialProofs((byte)1, new SmallArrayBasedLongToDoubleMap(), 1L, 0, 1);
    }

    @Test(timeout=10000)
    public void addToWeightDeltaIsOne() {
        TweetMetadataRecommendationInfo tweetMetadataRecommendationInfo = new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>());
        tweetMetadataRecommendationInfo.addToWeight(1.0);
        assertEquals(2.0, tweetMetadataRecommendationInfo.getWeight(), 0);
    }

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new TweetMetadataRecommendationInfo(0, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).compareTo(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, Double.NaN, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>())), is(1));
        assertThat(new TweetMetadataRecommendationInfo(0, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).compareTo(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>())), is(0));
    }

    @Test(timeout=10000)
    public void getRecommendation() {
        assertThat(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).getRecommendation(), is(1));
        assertThat(new TweetMetadataRecommendationInfo(0, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).getRecommendation(), is(0));
    }

    @Test(timeout=10000)
    public void getRecommendationTypeReturnsHASHTAG() {
        assertThat(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, java.util.Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).getRecommendationType(), is(RecommendationType.HASHTAG));
    }

    @Test(timeout=10000)
    public void getSocialProof() {
        Map<Byte, Map<Long, it.unimi.dsi.fastutil.longs.LongList>> socialProof = new HashMap<Byte, Map<Long, it.unimi.dsi.fastutil.longs.LongList>>();
        assertThat(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, socialProof).getSocialProof(), sameInstance(socialProof));
    }

    @Test(timeout=10000)
    public void getWeightReturnsOne() {
        assertEquals(1.0, new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).getWeight(), 0);
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).equals("foo"), is(false));
        assertThat(new TweetMetadataRecommendationInfo(1, RecommendationType.HASHTAG, 1.0, new HashMap<Byte, Map<Long, it.unimi.dsi.fastutil.longs.LongList>>()).equals(null), is(false));
    }
}
