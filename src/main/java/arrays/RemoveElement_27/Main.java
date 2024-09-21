package arrays.RemoveElement_27;

import common.Difficulty;
import common.Topic;
import common.Topics;

import java.util.Arrays;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/remove-element">Remove Element</a>
 */
@Difficulty(EASY)
@Topics({
        Topic.ARRAYS,
        Topic.TWO_POINTERS
})
class Main {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(new Solution().removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }
}
