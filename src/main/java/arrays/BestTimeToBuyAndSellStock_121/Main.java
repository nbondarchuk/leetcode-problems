package arrays.BestTimeToBuyAndSellStock_121;

import common.Difficulty;
import common.Topics;

import static common.DifficultyLevel.EASY;
import static common.Topic.ARRAYS;
import static common.Topic.DYNAMIC_PROGRAMMING;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">Best Time to Buy and Sell Stock</a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * </p>
 */
@Difficulty(EASY)
@Topics({
        ARRAYS,
        DYNAMIC_PROGRAMMING
})
public class Main {

    public static void main(String[] args) {
        assertThat(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }
}
