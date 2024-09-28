package strings.IsSubsequence_392;

import common.Difficulty;
import common.Topics;

import static common.DifficultyLevel.EASY;
import static common.Topic.STRING;
import static common.Topic.TWO_POINTERS;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/is-subsequence">Is Subsequence</a>
 */
@Difficulty(EASY)
@Topics({
        STRING,
        TWO_POINTERS
})
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().isSubsequence("abc", "ahbgdc")).isTrue();
        assertThat(new Solution().isSubsequence("axc", "ahbgdc")).isFalse();
    }
}
