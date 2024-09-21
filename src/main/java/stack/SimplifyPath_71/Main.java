package stack.SimplifyPath_71;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/simplify-path">Simplify Path</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().simplifyPath("/home//foo/")).isEqualTo("/home/foo");
        assertThat(new Solution().simplifyPath("/home/user/Documents/../Pictures")).isEqualTo("/home/user/Pictures");
        assertThat(new Solution().simplifyPath("/../")).isEqualTo("/");
        assertThat(new Solution().simplifyPath("/.../a/../b/c/../d/./")).isEqualTo("/.../b/d");
        assertThat(new Solution().simplifyPath("/.../a/../b/c/../d/./e")).isEqualTo("/.../b/d/e");
    }
}
