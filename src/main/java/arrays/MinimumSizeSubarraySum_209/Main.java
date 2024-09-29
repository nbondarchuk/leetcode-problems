package arrays.MinimumSizeSubarraySum_209;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-size-subarray-sum>Minimum Size Subarray Sum</a>
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * </p>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})).isEqualTo(2);
        assertThat(new Solution().minSubArrayLen(4, new int[]{1, 4, 4})).isEqualTo(1);
        assertThat(new Solution().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})).isEqualTo(0);
    }
}
