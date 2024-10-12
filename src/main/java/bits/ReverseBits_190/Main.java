package bits.ReverseBits_190;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-bits">Reverse Bits</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().reverseBits(0b00000010100101000001111010011100)).isEqualTo(0b00111001011110000010100101000000);
        assertThat(new Solution().reverseBits(0b11111111111111111111111111111101)).isEqualTo(0b10111111111111111111111111111111);
    }
}
