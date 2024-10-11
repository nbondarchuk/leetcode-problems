package math.NumberOf1Bits_191;

import common.Difficulty;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits">Number of 1 Bits</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(0b00000000000000000000000000001011));
        System.out.println(new Solution().hammingWeight(0b00000000000000000000000010000000));
        System.out.println(new Solution().hammingWeight(0b11111111111111111111111111111101));
    }
}
