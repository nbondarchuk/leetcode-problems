package strings.LongestPalindromicSubstring_5;

/**
 * <a href="https://codeforces.com/blog/entry/12143?locale=ru">Алгоритм Манакера и читаемость кода</a>
 * <a href="https://habr.com/ru/articles/653617/">Алгоритм поиска самой длинной подстроки-палиндрома</a>
 */
class ManachersAlgorithmSolution {

    public String longestPalindrome(String s) {
        String orig = s;
        s = preprocessString(s);

        int left = 0;
        int right = 0;
        int[] palindromeLengths = new int[s.length()];
        for (int i = 1; i < s.length() - 1; i++) {
            palindromeLengths[i] = i > right ? 0 : Math.min(palindromeLengths[left + right - i], right - i);
            while (left >= 0 && right < s.length()
                    && s.charAt(i - 1 - palindromeLengths[i]) == s.charAt(i + 1 + palindromeLengths[i])) {
                palindromeLengths[i]++;
            }

            if (i + palindromeLengths[i] > right) {
                left = i - palindromeLengths[i];
                right = i + palindromeLengths[i];
            }
        }

        int maxLength = 0;
        int maxCenter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (palindromeLengths[i] > maxLength) {
                maxLength = palindromeLengths[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLength) / 2;
        int end = start + maxLength;

        return orig.substring(start, end);
    }

    private String preprocessString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("#");
        }
        sb.append("$");
        return sb.toString();
    }
}
