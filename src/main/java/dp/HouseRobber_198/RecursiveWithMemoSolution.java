package dp.HouseRobber_198;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/house-robber/solutions/156523/From-good-to-great.-How-to-approach-most-of-DP-problems">House Robber</a>
 */
class RecursiveWithMemoSolution {

    private int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }

        if (memo[i] > -1) {
            return memo[i];
        }
        return memo[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }
}
