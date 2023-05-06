package arrays.RotateImage_48;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/rotate-image/description/">Rotate Image</a>
 */
public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
