package arrays.RemoveDuplicatesFromSortedArrayII_80;

import common.Difficulty;

import java.util.Arrays;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii">Remove Duplicates from Sorted Array II</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3};
        System.out.println(new Solution().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
