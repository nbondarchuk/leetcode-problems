package dp.MinCostClimbingStairs_746;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void minCostClimbingStairsTest() {
        assertThat(new Solution().minCostClimbingStairs(new int[]{10, 15, 20})).isEqualTo(15);
        assertThat(new Solution().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);
    }
}
