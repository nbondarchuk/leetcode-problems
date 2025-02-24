package dp.SolvingQuestionsWithBrainpower_2140;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void mostPointsTest() {
        assertThat(new Solution().mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}})).isEqualTo(5);
        assertThat(new Solution().mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}})).isEqualTo(7);
    }
}
