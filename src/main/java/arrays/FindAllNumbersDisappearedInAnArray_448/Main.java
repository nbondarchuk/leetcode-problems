package arrays.FindAllNumbersDisappearedInAnArray_448;

import common.Difficulty;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array">Find All Numbers Disappeared in an Array</a>
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 * </p>
 */
@Difficulty(EASY)
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new Solution().findDisappearedNumbers(nums));
    }
}
