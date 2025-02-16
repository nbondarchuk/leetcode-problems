package dp.MaximumValueOfKCoinsFromPiles_2218;

import common.Difficulty;

import java.util.Arrays;
import java.util.List;

import static common.DifficultyLevel.HARD;

/**
 * <a href="https://leetcode.com/problems/maximum-value-of-k-coins-from-piles">Maximum Value of K Coins From Piles</a>
 */
@Difficulty(HARD)
class Solution {

    private int n;

    private int[][] memo;

    private List<List<Integer>> piles;

    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        this.piles = piles;
        this.n = piles.size();
        this.memo = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        return dp(0, k);
    }

    private int dp(int i, int remaining) {
        if (i == n || remaining == 0) {
            return 0;
        }

        if (memo[i][remaining] != -1) {
            return memo[i][remaining];
        }

        int curr = 0;
        int ans = dp(i + 1, remaining);
        for (int j = 0; j < Math.min(piles.get(i).size(), remaining); j++) {
            curr += piles.get(i).get(j);
            ans = Math.max(ans, curr + dp(i + 1, remaining - j - 1));
        }

        memo[i][remaining] = ans;

        return ans;
    }
}