package stack.RemoveKDigits_402;

import java.util.Stack;

class Solution {

    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!stack.isEmpty() && ch < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }

            if (!stack.isEmpty() || ch != '0') {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if (stack.isEmpty()) {
            return "0";
        }

        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            s.insert(0, stack.pop());
        }
        return s.toString();
    }
}
