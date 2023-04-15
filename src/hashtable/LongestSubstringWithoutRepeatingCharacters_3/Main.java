package hashtable.LongestSubstringWithoutRepeatingCharacters_3;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 * <p>
 *     Given a string s, find the length of the longest substring without repeating characters.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.lengthOfLongestSubstring("abba");
        System.out.print(result);
    }
}
