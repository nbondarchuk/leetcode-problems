package bits.AddBinary_67;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/add-binary">Add Binary</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().addBinary("11", "1")).isEqualTo("100");
        assertThat(new Solution().addBinary("1010", "1011")).isEqualTo("10101");
    }
}
