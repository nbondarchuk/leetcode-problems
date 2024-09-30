package hashtable.LongestSubstringWithoutRepeatingCharacters_3;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">Longest Substring Without Repeating Characters</a>
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * </p>
 * <p>
 * Constraints:
 *     <ul>
 *         <li>0 <= s.length <= 5 * 104</li>
 *         <li>s consists of English letters, digits, symbols and spaces.</li>
 *     </ul>
 * </p>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().lengthOfLongestSubstring("abba")).isEqualTo(2);
    }
}
