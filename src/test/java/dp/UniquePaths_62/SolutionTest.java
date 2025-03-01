package dp.UniquePaths_62;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void uniquePathsTest() {
        assertThat(new Solution().uniquePaths(3, 7)).isEqualTo(28);
        assertThat(new Solution().uniquePaths(3, 2)).isEqualTo(3);
    }
}
