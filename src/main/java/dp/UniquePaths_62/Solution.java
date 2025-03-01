package dp.UniquePaths_62;

import common.Difficulty;
import common.Topics;

import java.util.Arrays;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.DYNAMIC_PROGRAMMING;

/**
 * <a href="https://leetcode.com/problems/unique-paths">Unique Paths</a>
 */
@Difficulty(MEDIUM)
@Topics(DYNAMIC_PROGRAMMING)
class Solution {

    private int[][] memo;

    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }

        return dp(m - 1, n - 1);
    }

    private int dp(int row, int col) {
        if (row + col == 0) {
            return 1;
        }

        if (memo[row][col] != -1) {
            return memo[row][col];
        }

        int ans = 0;
        if (row > 0) {
            ans += dp(row - 1, col);
        }
        if (col > 0) {
            ans += dp(row, col - 1);
        }
        memo[row][col] = ans;
        return ans;
    }
}
