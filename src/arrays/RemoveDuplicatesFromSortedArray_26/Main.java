package arrays.RemoveDuplicatesFromSortedArray_26;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a>
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 3};
        System.out.println(new Solution().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
