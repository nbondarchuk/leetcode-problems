package strings.WordBreak_139;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void wordBreakTest() {
        assertThat(solution.wordBreak("leetcode", List.of("leet", "code"))).isTrue();
        assertThat(solution.wordBreak("applepenapple", List.of("apple", "pen"))).isTrue();
        assertThat(solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))).isFalse();
    }
}
