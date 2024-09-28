package arrays.ThreeSum_15;

import common.Difficulty;

import java.util.List;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/3sum">3Sum</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}))
                .isEqualTo(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
    }
}
