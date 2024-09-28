package arrays.TrappingRainWater_42;

import common.Difficulty;

import static common.DifficultyLevel.HARD;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/trapping-rain-water">Trapping Rain Water</a>
 */
@Difficulty(HARD)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})).isEqualTo(6);
    }
}
