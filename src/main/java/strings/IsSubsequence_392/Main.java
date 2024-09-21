package strings.IsSubsequence_392;

import common.Difficulty;
import common.Topics;

import static common.DifficultyLevel.EASY;
import static common.Topic.STRING;
import static common.Topic.TWO_POINTERS;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/description">Is Subsequence</a>
 */
@Difficulty(EASY)
@Topics({
        STRING,
        TWO_POINTERS
})
class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("abc", "ahbgdc"));
        System.out.println(new Solution().isSubsequence("axc", "ahbgdc"));
    }
}
