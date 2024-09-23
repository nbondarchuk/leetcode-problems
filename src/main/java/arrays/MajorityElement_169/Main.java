package arrays.MajorityElement_169;

import common.Difficulty;
import common.Topics;

import static common.DifficultyLevel.EASY;
import static common.Topic.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/majority-element">Majority Element</a>
 */
@Difficulty(EASY)
@Topics({
        ARRAYS,
        HASH_TABLE,
        SORTING,
        COUNTING
})
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
        assertThat(new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }
}
