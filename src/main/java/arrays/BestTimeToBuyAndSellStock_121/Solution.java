package arrays.BestTimeToBuyAndSellStock_121;

import common.Difficulty;
import common.Topics;

import static common.DifficultyLevel.EASY;
import static common.Topic.ARRAYS;
import static common.Topic.DYNAMIC_PROGRAMMING;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">Best Time to Buy and Sell Stock</a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * </p>
 */
@Topics({
        ARRAYS,
        DYNAMIC_PROGRAMMING
})
@Difficulty(EASY)
class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
