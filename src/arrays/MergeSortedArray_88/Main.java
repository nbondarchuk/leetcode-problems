package arrays.MergeSortedArray_88;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">Merge Sorted Array</a>
 */
public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0};
        new Solution().merge(nums1, 3, new int[]{3, 4}, 2);
        System.out.println(Arrays.toString(nums1));
    }
}
