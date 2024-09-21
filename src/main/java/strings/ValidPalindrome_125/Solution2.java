package strings.ValidPalindrome_125;

class Solution2 {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (isValidCharacter(leftChar) && isValidCharacter(rightChar)) {
                if (Character.toLowerCase(leftChar) == Character.toLowerCase(rightChar)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }

            if (!isValidCharacter(leftChar)) {
                left++;
            }

            if (!isValidCharacter(rightChar)) {
                right--;
            }
        }

        return true;
    }

    private boolean isValidCharacter(char ch) {
        return ch >= 'a' && ch <= 'z'
                || ch >= 'A' && ch <= 'Z'
                || ch >= '0' && ch <= '9';
    }
}
