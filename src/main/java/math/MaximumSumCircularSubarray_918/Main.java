package math.MaximumSumCircularSubarray_918;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/maximum-sum-circular-subarray">Maximum Sum Circular Subarray</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().maxSubarraySumCircular(new int[]{1, -2, 3, -2})).isEqualTo(3);
        assertThat(new Solution().maxSubarraySumCircular(new int[]{5, -3, 5})).isEqualTo(10);
        assertThat(new Solution().maxSubarraySumCircular(new int[]{-3, -2, -3})).isEqualTo(-2);
    }
}
