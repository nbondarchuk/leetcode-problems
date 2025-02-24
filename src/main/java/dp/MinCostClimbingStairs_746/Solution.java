package dp.MinCostClimbingStairs_746;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs">Min Cost Climbing Stairs</a>
 */
class Solution {

    private final Map<Integer, Integer> memo = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        return dp(cost.length, cost);
    }

    private int dp(int i, int[] cost) {
        if (i <= 1) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        memo.put(i, Math.min(dp(i - 1, cost) + cost[i - 1], dp(i - 2, cost) + cost[i - 2]));

        return memo.get(i);
    }
}
