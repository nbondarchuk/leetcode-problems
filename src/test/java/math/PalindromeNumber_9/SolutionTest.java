package math.PalindromeNumber_9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void isPalindrome() {
        assertThat(new Solution().isPalindrome(1221)).isTrue();
        assertThat(new Solution().isPalindrome(-1221)).isFalse();
    }
}
