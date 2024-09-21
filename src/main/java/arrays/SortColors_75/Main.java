package arrays.SortColors_75;

import common.Difficulty;

import java.util.Arrays;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/sort-colors">Sort Colors</a>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        new Solution1().sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2, 0, 2, 1, 1, 0};
        new Solution2().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
