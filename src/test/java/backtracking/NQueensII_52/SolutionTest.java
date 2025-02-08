package backtracking.NQueensII_52;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void totalNQueensTest() {
        assertThat(new Solution().totalNQueens(1)).isEqualTo(1);
        assertThat(new Solution().totalNQueens(4)).isEqualTo(2);
    }
}
