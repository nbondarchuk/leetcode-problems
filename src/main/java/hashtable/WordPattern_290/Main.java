package hashtable.WordPattern_290;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/word-pattern">Word Pattern</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().wordPattern("abba", "dog cat cat dog")).isTrue();
        assertThat(new Solution().wordPattern("abba", "dog cat cat fish")).isFalse();
    }
}
