package arrays.MoveZeroes_283;

import common.Difficulty;
import common.Topics;

import java.util.Arrays;

import static common.DifficultyLevel.EASY;
import static common.Topic.ARRAYS;
import static common.Topic.TWO_POINTERS;

/**
 * <a href="https://leetcode.com/problems/move-zeroes">Move Zeroes</a>
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * </p>
 */
@Difficulty(EASY)
@Topics({
        ARRAYS,
        TWO_POINTERS
})
public class Main {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
