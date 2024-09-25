package search.SearchInsertPosition_35;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/search-insert-position">Search Insert Position</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
        assertThat(new Solution().searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
        assertThat(new Solution().searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }
}
