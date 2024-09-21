package arrays.JumpGameII_45;

import org.assertj.core.api.Assertions;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii">Simplify Path</a>
 */
class Main {

    public static void main(String[] args) {
        Assertions.assertThat(new Solution().jump(new int[]{2, 3, 1, 1, 4})).isEqualTo(2);
        Assertions.assertThat(new Solution().jump(new int[]{2, 3, 0, 1, 4})).isEqualTo(2);
    }
}
