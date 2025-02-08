package arrays.BestTimeToBuyAndSellStockII_122;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void maxProfitTest() {
        assertThat(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1})).isZero();
        assertThat(new Solution().maxProfit(new int[]{1, 2, 3, 4, 5})).isEqualTo(4);
        assertThat(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(7);
    }
}
