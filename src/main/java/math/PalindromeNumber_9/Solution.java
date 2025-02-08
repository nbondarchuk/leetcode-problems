package math.PalindromeNumber_9;

import common.Difficulty;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/palindrome-number">Palindrome Number</a>
 * <p>
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * </p>
 */
@Difficulty(EASY)
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
