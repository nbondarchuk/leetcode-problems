package dp.SolvingQuestionsWithBrainpower_2140;

import common.Difficulty;
import common.Topics;

import java.util.HashMap;
import java.util.Map;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.ARRAYS;
import static common.Topic.DYNAMIC_PROGRAMMING;

/**
 * <a href="https://leetcode.com/problems/solving-questions-with-brainpower">Solving Questions With Brainpower</a>
 */
@Topics({
        ARRAYS,
        DYNAMIC_PROGRAMMING
})
@Difficulty(MEDIUM)
class Solution {

    private final Map<Integer, Long> memo = new HashMap<>();

    public long mostPoints(int[][] questions) {
        return dp(0, questions);
    }

    private long dp(int i, int[][] questions) {
        if (i >= questions.length) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        long skip = dp(i + 1, questions);
        long take = questions[i][0] + dp(i + questions[i][1] + 1, questions);

        long c = Math.max(skip, take);
        memo.put(i, c);
        return c;
    }
}
