package math.PalindromeNumber_9;

class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int orig = x;
        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + (x % 10);
            x = x / 10;
        }

        return orig == reversed;
    }
}
