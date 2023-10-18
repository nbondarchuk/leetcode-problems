package dp.HouseRobber_198;

/**
 * <a href="https://leetcode.com/problems/house-robber/solutions/156523/From-good-to-great.-How-to-approach-most-of-DP-problems">House Robber</a>
 */
class IterativeSolution {

    public int rob(int[] nums) {
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            memo[i+1] = Math.max(memo[i], memo[i-1] + nums[i]);
        }
        return memo[nums.length];
    }
}
