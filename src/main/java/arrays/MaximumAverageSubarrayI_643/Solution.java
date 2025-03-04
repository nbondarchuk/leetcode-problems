package arrays.MaximumAverageSubarrayI_643;

import common.Difficulty;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i">Maximum Average Subarray I</a>
 */
@Difficulty(EASY)
class Solution {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double ans = (double) sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, (double) sum / k);
        }
        return ans;
    }
}