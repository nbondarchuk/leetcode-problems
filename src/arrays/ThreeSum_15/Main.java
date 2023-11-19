package arrays.ThreeSum_15;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/3sum">3Sum</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
