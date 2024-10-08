package arrays.SummaryRanges_228;

import common.Difficulty;

import java.util.List;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/summary-ranges">Summary Ranges</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().summaryRanges(new int[]{0, 1, 2, 4, 5, 7})).isEqualTo(List.of(
                "0->2",
                "4->5",
                "7"
        ));
    }
}
