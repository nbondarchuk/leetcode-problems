package dp.HouseRobber_198;

/**
 * <a href="https://leetcode.com/problems/house-robber/solutions/156523/From-good-to-great.-How-to-approach-most-of-DP-problems">House Robber</a>
 */
class IterativeSolutionWithConstantMemoryUsage {

    public int rob(int[] nums) {
        int memo_i_1 = 0;
        int memo_i = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = memo_i;
            memo_i = Math.max(temp, memo_i_1 + nums[i]);
            memo_i_1 = temp;
        }

        return memo_i;
    }
}
