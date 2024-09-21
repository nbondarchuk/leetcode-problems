package strings.LongestPalindromicSubstring_5;

class ExpandAroundCenterSolution {

    public String longestPalindrome(String s) {
        int[] longestPalindromeIndices = {0 , 0};
        for (int i = 0; i < s.length(); i++) {
            int[] indices = expandAroundCenter(s, i, i);
            if (indices[1] - indices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                longestPalindromeIndices = indices;
            }

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                indices = expandAroundCenter(s, i, i + 1);
                if (indices[1] - indices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                    longestPalindromeIndices = indices;
                }
            }
        }

        return s.substring(longestPalindromeIndices[0], longestPalindromeIndices[1] + 1);
    }

    private int[] expandAroundCenter(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return new int[] {i + 1, j - 1};
    }
}
