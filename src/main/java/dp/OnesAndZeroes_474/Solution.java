package dp.OnesAndZeroes_474;

class Solution {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < strs.length; i++) {
            int[] c = count(strs[i]);
            int zeroes = c[0];
            int ones = c[1];

            for (int j = m; j >= zeroes; j--) {
                for (int k = n; k >= ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeroes][k - ones] + 1);
                }
            }
        }

        return dp[m][n];
    }

    private int[] count(String str) {
        int[] result = new int[2];
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (ch == '0') {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }
}
