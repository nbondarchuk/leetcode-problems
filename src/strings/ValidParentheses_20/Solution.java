package strings.ValidParentheses_20;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {

    private static final Set<Character> OPEN_BRACKETS = new HashSet<>();

    static {
        OPEN_BRACKETS.add('(');
        OPEN_BRACKETS.add('{');
        OPEN_BRACKETS.add('[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (OPEN_BRACKETS.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character pop = stack.pop();
                if (pop == '(' && c != ')'
                        || pop == '{' && c != '}'
                        || pop == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
