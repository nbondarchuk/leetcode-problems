package arrays.JumpGame_55;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/jump-game">Jump Game</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().canJump(new int[]{2, 3, 1, 1, 4})).isTrue();
        assertThat(new Solution().canJump(new int[]{3, 2, 1, 0, 4})).isFalse();
    }
}
