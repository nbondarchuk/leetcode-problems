package dp.LongestIncreasingSubsequence_300;

import java.util.Arrays;

/**
 * <a href="https://habr.com/ru/articles/343210/">Решаем задачу нахождения длины наибольшей возрастающей подпоследовательности</a>
 */
class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int j = 1; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j] && dp[j] <= dp[i]) {
                    dp[j] = dp[i] + 1;
                }
            }
        }

        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
