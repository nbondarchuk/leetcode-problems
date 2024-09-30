package strings.SubstringWithConcatenationOfAllWords_30;

import common.Difficulty;

import java.util.List;

import static common.DifficultyLevel.HARD;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words">Substring with Concatenation of All Words</a>
 */
@Difficulty(HARD)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})).isEqualTo(List.of(0, 9));
    }
}
