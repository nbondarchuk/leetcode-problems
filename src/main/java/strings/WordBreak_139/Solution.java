package strings.WordBreak_139;

import common.Difficulty;

import java.util.List;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/word-break">Word Break</a>
 * <p>
 * <a href="https://leetcode.com/problems/word-break/solutions/3860456/100-dp-dfs-video-segmenting-a-string/?envType=study-plan-v2&envId=top-interview-150">Solution</a>
 * </p>
 */
@Difficulty(MEDIUM)
class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        int maxLen = 0;
        for (int i = 0; i < wordDict.size(); i++) {
            maxLen = Math.max(maxLen, wordDict.get(i).length());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(i - maxLen - 1, 0); j--) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
