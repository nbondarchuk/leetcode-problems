package hashtable.RansomNote_383;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/ransom-note">Ransom Note</a>
 * <p>
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * </p>
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 * </p>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new MapSolution().canConstruct("a", "b")).isFalse();
        assertThat(new MapSolution().canConstruct("aa", "ab")).isFalse();
        assertThat(new MapSolution().canConstruct("aa", "aab")).isTrue();

        assertThat(new ArraySolution().canConstruct("a", "b")).isFalse();
        assertThat(new ArraySolution().canConstruct("aa", "ab")).isFalse();
        assertThat(new ArraySolution().canConstruct("aa", "aab")).isTrue();
    }
}
