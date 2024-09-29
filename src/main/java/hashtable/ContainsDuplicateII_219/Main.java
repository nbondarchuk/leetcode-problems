package hashtable.ContainsDuplicateII_219;

import common.Difficulty;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii">Contains Duplicate II</a>
 * <p>
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * </p>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution1().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
        assertThat(new Solution1().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 3)).isTrue();
        assertThat(new Solution1().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();

        assertThat(new Solution2().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
        assertThat(new Solution2().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 3)).isTrue();
        assertThat(new Solution2().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
    }
}
