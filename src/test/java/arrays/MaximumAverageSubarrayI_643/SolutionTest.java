package arrays.MaximumAverageSubarrayI_643;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void findMaxAverageTest() {
        assertThat(new Solution().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)).isEqualTo(12.75000);
        assertThat(new Solution().findMaxAverage(new int[]{5}, 1)).isEqualTo(5.00000);
    }
}
