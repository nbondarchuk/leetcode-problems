package hashtable.RomanToInteger_13;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer">Roman to Integer</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().romanToInt("LVIII")).isEqualTo(58);
        assertThat(new Solution().romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
