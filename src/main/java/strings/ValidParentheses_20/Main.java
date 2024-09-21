package strings.ValidParentheses_20;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(){]"));
        System.out.println(new Solution().isValid("(){}"));
    }
}
