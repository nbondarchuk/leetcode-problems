package strings.LongestPalindromicSubstring_5;

/**
 * <h2><a href="https://leetcode.com/problems/longest-palindromic-substring">Longest Palindromic Substring</a></h2>
 * <p>
 * Given a string <em>s</em>, return the longest palindromic substring in <em>s</em>.
 * </p>
 * <br/>
 * <p>
 * <b>Constraints:</b>
 *     <ul>
 *         <li>1 <= s.length <= 1000</li>
 *         <li>s consist of only digits and English letters.</li>
 *     </ul>
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new ExpandAroundCenterSolution().longestPalindrome("baabaad"));
        System.out.println(new ManachersAlgorithmSolution().longestPalindrome("baabaad"));
    }
}
