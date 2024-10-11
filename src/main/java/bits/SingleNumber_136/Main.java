package bits.SingleNumber_136;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/single-number">Single Number</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }
}
