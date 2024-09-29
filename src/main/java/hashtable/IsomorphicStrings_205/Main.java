package hashtable.IsomorphicStrings_205;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/isomorphic-strings">Isomorphic Strings</a>
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * </p>
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * </p>
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * </p>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().isIsomorphic("egg", "add")).isTrue();
        assertThat(new Solution().isIsomorphic("foo", "bar")).isFalse();
        assertThat(new Solution().isIsomorphic("paper", "title")).isTrue();
        assertThat(new Solution().isIsomorphic("badc", "baba")).isFalse();
    }
}
