package stack.SimplifyPath_71;

import java.util.Stack;

class Solution {

    private final Stack<String> stack = new Stack<>();

    public String simplifyPath(String path) {
        int start = -1;
        boolean inSegment = false;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                if (inSegment) {
                    inSegment = false;
                    handleSegment(path.substring(start, i));
                }
            } else {
                if (!inSegment) {
                    start = i;
                    inSegment = true;
                }
                if (i == path.length() - 1) {
                    handleSegment(path.substring(start));
                }
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.toString();
    }

    private void handleSegment(String segment) {
        if (".".equals(segment)) {
            return;
        }

        if ("..".equals(segment)) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else {
            stack.push(segment);
        }
    }
}
