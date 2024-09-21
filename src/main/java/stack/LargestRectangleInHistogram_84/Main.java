package stack.LargestRectangleInHistogram_84;

import common.Difficulty;

import static common.DifficultyLevel.HARD;

/**
 * <a href="https://leetcode.com/problems/largest-rectangle-in-histogram">Largest Rectangle in Histogram</a>
 * <p>
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 * return the area of the largest rectangle in the histogram.
 * </p>
 */
@Difficulty(HARD)
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(new Solution().largestRectangleArea(new int[]{2, 4}));
    }
}
