package arrays.MergeIntervals_56;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/merge-intervals">Merge Intervals</a>
 */
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})).isEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }
}
