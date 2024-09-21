package arrays.FindFirstAndLastPositionOfElementInSortedArray_34;

import common.Difficulty;

import java.util.Arrays;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array">Find First and Last Position of Element in Sorted Array</a>
 * <p>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * </p>
 * <p>
 * If target is not found in the array, return [-1, -1].
 * </p>
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * </p>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{2, 2}, 2)));
    }
}
