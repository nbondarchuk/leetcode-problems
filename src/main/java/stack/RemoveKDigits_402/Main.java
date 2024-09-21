package stack.RemoveKDigits_402;

/**
 * <a href="https://leetcode.com/problems/remove-k-digits">Remove K Digits</a>
 * <p>
 * Given string num representing a non-negative integer num, and an integer k,
 * return the smallest possible integer after removing k digits from num.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().removeKdigits("1432219", 3));
        System.out.println(new Solution().removeKdigits("10200", 1));
        System.out.println(new Solution().removeKdigits("10", 2));
        System.out.println(new Solution().removeKdigits("9", 1));
    }
}
