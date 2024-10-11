package bits.SingleNumberII_137;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/single-number-ii">Single Number II</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().singleNumber(new int[]{2, 2, 3, 2})).isEqualTo(3);
    }
}
