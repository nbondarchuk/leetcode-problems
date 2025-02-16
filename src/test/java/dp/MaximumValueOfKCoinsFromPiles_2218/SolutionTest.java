package dp.MaximumValueOfKCoinsFromPiles_2218;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void maxValueOfCoinsTest() {
        assertThat(new Solution().maxValueOfCoins(List.of(List.of(1, 100, 3), List.of(7, 8, 9)), 2)).isEqualTo(101);
    }
}
