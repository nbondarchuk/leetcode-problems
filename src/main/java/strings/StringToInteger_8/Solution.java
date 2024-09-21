package strings.StringToInteger_8;

class Solution {

    public int myAtoi(String s) {
        int iter = 0;

        // skip whitespaces
        while (iter < s.length() && s.charAt(iter) == ' ') iter++;

        if (iter >= s.length()) return 0;

        boolean negate = s.charAt(iter) == '-';
        if (negate || s.charAt(iter) == '+') {
            iter++;
        }

        int result = 0;
        while (iter < s.length() && s.charAt(iter) >= '0' && s.charAt(iter) <= '9') {
            int dig = s.charAt(iter) - '0';
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && dig > 7) {
                return negate ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + dig;
            iter++;
        }
        return negate ? -result : result;
    }
}
