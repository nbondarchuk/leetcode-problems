package arrays.FindFirstAndLastPositionOfElementInSortedArray_34;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * <br/>
 * If target is not found in the array, return [-1, -1].
 * <br/>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[] {2, 2}, 2)));
    }
}
