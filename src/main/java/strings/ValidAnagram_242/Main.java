package strings.ValidAnagram_242;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-anagram">Valid Anagram</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().isAnagram("anagram", "nagaram")).isTrue();
        assertThat(new Solution().isAnagram("rat", "car")).isFalse();

        assertThat(new Solution2().isAnagram("anagram", "nagaram")).isTrue();
        assertThat(new Solution2().isAnagram("rat", "car")).isFalse();
    }
}
