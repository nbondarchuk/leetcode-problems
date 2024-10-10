package strings.LongestCommonPrefix_14;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix">Longest Common Prefix</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution1().longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(new Solution2().longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
    }
}
