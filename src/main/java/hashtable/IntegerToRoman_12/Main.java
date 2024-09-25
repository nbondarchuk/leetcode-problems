package hashtable.IntegerToRoman_12;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/description/">Integer to Roman</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().intToRoman(3)).isEqualTo("III");
        assertThat(new Solution().intToRoman(58)).isEqualTo("LVIII");
        assertThat(new Solution().intToRoman(1994)).isEqualTo("MCMXCIV");
    }
}
