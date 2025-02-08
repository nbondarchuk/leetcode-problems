package arrays.MinimumNumberOfArrowsToBurstBalloons_452;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void findMinArrowShots() {
        assertThat(new Solution().findMinArrowShots(
                new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}})).isEqualTo(2);
    }
}
