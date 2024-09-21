package arrays.IntersectionOfTwoArraysII_350;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii">Intersection of Two Arrays II</a>
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * </p>
 * <p>
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
