package hashtable.LongestConsecutiveSequence_128;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence">Longest Consecutive Sequence</a>
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * </p>
 * <p>
 * You must write an algorithm that runs in O(n) time.
 * </p>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})).isEqualTo(4);
        assertThat(new Solution().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})).isEqualTo(9);
    }
}
