package hashtable.LongestSubstringWithoutRepeatingCharacters_3;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
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
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.lengthOfLongestSubstring("abba"));
    }
}
