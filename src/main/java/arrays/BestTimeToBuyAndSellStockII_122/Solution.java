package arrays.BestTimeToBuyAndSellStockII_122;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">Best Time to Buy and Sell Stock II</a>
 */
@Difficulty(MEDIUM)
class Solution {

    private int profit;

    private int lastSold = -1;

    private int lastBought = -1;

    public int maxProfit(int[] prices) {
        profit = 0;
        lastSold = lastBought = -1;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                if (hasStock()) {
                    sell(prices, i);
                }
                break;
            }

            if (prices[i + 1] > prices[i] && !hasStock()) {
                buy(i);
            } else if (prices[i + 1] < prices[i] && hasStock()) {
                sell(prices, i);
            }
        }
        return profit;
    }

    private boolean hasStock() {
        return lastBought > lastSold;
    }

    private void buy(int day) {
        lastBought = day;
    }

    private void sell(int[] prices, int day) {
        profit = profit + (prices[day] - prices[lastBought]);
        lastSold = day;
    }
}
