package hashtable.TwoSum_1;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/two-sum/description">Two Sum</a>
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * </p>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)).satisfiesAnyOf(
                result -> assertThat(result).isEqualTo(new int[]{0, 1}),
                result -> assertThat(result).isEqualTo(new int[]{1, 0})
        );
    }
}
