package math.MaximumSubarray_53;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray">Maximum Subarray</a>
 * <p>
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * </p>
 */
class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertThat(new Solution().maxSubArray(nums)).isEqualTo(6);
        assertThat(new BruteForceSolution().maxSubArray(nums)).isEqualTo(6);
    }
}
