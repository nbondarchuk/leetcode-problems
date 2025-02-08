package arrays.BestTimeToBuyAndSellStock_121;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1})).isZero();
        assertThat(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }
}
