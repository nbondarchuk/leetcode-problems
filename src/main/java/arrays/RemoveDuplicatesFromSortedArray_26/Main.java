package arrays.RemoveDuplicatesFromSortedArray_26;

import common.Difficulty;

import java.util.Arrays;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">Remove Duplicates from Sorted Array</a>
 */
@Difficulty(EASY)
public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 1, 2, 2, 2, 2, 3};
        System.out.println(new Solution().removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums1));

        System.out.println("---");

        int[] nums2 = {1, 1, 1, 1, 2, 2, 2, 2, 3};
        System.out.println(new Solution2().removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }
}
