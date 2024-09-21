package stack.LargestRectangleInHistogram_84;

import java.util.Stack;

class Solution {

    public int largestRectangleArea(int[] heights) {
        int res = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int left = !stack.isEmpty() ? stack.peek() : -1;
                res = Math.max(res, (i - 1 - left) * height);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int left = !stack.isEmpty() ? stack.peek() : -1;
            res = Math.max(res, (heights.length - 1 - left) * height);
        }

        return res;
    }
}
