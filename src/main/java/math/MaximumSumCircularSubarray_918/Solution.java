package math.MaximumSumCircularSubarray_918;

/**
 * See <a href="https://leetcode.com/problems/maximum-sum-circular-subarray/solutions/3066636/weird-kadane-explanation-with-images">solution explanation.</a>
 */
class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int localMax = 0;

        int minSum = Integer.MAX_VALUE;
        int localMin = 0;

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            maxSum = Math.max(maxSum, localMax);

            localMin = Math.min(nums[i], localMin + nums[i]);
            minSum = Math.min(minSum, localMin);

            totalSum += nums[i];
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
