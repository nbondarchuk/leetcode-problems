package strings.ValidPalindrome_125;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome">Valid Palindrome</a>
 */
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        assertThat(new Solution2().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }
}
