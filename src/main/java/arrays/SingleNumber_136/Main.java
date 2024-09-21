package arrays.SingleNumber_136;

import common.Difficulty;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/single-number">Single Number</a>
 */
@Difficulty(EASY)
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{2, 2, 1}));
    }
}
