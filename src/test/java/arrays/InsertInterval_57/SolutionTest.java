package arrays.InsertInterval_57;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void insertTest() {
        assertThat(new Solution().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})).isDeepEqualTo(new int[][]{{1, 5}, {6, 9}});
    }
}
