package arrays.MedianOfTwoSortedArrays_4;

import common.Difficulty;

import static common.DifficultyLevel.HARD;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">Median of Two Sorted Arrays</a>
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * </p>
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * </p>
 */
@Difficulty(HARD)
public class Main {

    public static void main(String[] args) {
//        double median = new LinearComplexitySolution().findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6});
//        double median2 = new LogarithmicComplexitySolution().findMedianSortedArrays2(new int[] {1, 2, 3}, new int[] {4, 5, 6});

        double median = new LinearComplexitySolution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        double median2 = new LogarithmicComplexitySolution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        System.out.println(median + " / " + median2);
    }
}
