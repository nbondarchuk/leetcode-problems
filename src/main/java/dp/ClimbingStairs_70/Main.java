package dp.ClimbingStairs_70;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs">Climbing Stairs</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution1().climbStairs(4)).isEqualTo(5);
        assertThat(new Solution2().climbStairs(4)).isEqualTo(5);
    }
}
