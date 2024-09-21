package stack.NextGreaterElementII_503;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/next-greater-element-ii">Next Greater Element II</a>
 * <p>
 * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
 * return the next greater number for every element in nums.
 * </p>
 * <br/>
 * <p>
 * The next greater number of a number x is the first greater number to its traversing-order next in the array,
 * which means you could search circularly to find its next greater number.
 * If it doesn't exist, return -1 for this number.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().nextGreaterElements(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(new Solution().nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
    }
}
