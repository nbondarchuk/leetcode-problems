package strings.ReverseString_344;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">Reverse String</a>
 *
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
