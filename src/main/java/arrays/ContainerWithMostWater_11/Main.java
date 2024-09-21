package arrays.ContainerWithMostWater_11;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water">Container With Most Water</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
