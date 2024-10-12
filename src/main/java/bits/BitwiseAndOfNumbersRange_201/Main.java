package bits.BitwiseAndOfNumbersRange_201;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/bitwise-and-of-numbers-range">Bitwise AND of Numbers Range</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().rangeBitwiseAnd(5, 7)).isEqualTo(4);
        assertThat(new Solution().rangeBitwiseAnd(1, 2147483647)).isEqualTo(0);
    }
}
