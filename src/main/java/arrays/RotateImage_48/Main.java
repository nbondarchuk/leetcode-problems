package arrays.RotateImage_48;

import common.Difficulty;

import java.util.Arrays;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/rotate-image">Rotate Image</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
