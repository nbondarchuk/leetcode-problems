package arrays.TwoSumInputArrayIsSorted_167;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted">Two Sum II - Input Array Is Sorted</a>
 * <p>
 *     Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 *     find two numbers such that they add up to a specific target number.
 *     Let these two numbers be <strong>numbers[index1]</strong> and <strong>numbers[index2]</strong>
 *     where <strong>1 <= index1 < index2 < numbers.length</strong>.
 * </p>
 * <p>
 *     Return the indices of the two numbers, index1 and index2,
 *     added by one as an integer array [index1, index2] of length 2.
 * </p>
 * <p>
 *     The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * </p>
 * <p>
 *     Your solution must use only constant extra space.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2,3,4}, 6)));
    }
}
