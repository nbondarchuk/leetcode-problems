package hashtable.TwoSum_1;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/two-sum/description/">Two Sum</a>
 * <br/>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2,7,11,15}, 9)));
    }
}
