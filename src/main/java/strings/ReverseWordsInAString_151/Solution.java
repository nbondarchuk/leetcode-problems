package strings.ReverseWordsInAString_151;

import java.util.Stack;

class Solution {

    public String reverseWords(String s) {
        int wordStart = -1;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (wordStart > -1) {
                    stack.add(s.substring(wordStart, i));
                    wordStart = -1;
                }
            } else {
                if (wordStart == -1) {
                    wordStart = i;
                }
            }
        }

        if (wordStart > -1) {
            stack.add(s.substring(wordStart));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
