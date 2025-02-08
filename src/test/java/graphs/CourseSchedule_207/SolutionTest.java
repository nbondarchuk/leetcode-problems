package graphs.CourseSchedule_207;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void canFinishTest() {
        assertThat(new Solution().canFinish(2, new int[][]{{1, 0}})).isTrue();
        assertThat(new Solution().canFinish(2, new int[][]{{0, 1}, {1, 0}})).isFalse();
    }
}
