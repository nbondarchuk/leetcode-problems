package arrays.BestTimeToBuyAndSellStockII_122;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">Best Time to Buy and Sell Stock II</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(new Solution().maxProfit(prices));
    }
}
