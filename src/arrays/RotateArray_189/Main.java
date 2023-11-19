package arrays.RotateArray_189;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/rotate-array">Rotate Array</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        new Solution().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
