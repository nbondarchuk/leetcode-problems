package arrays.DailyTemperatures_739;

import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Node> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().temp <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek().index - i;
            }

            stack.push(new Node(temperatures[i], i));
        }
        return result;
    }

    static class Node {

        int temp;

        int index;

        Node(int temp, int index) {
            this.temp = temp;
            this.index = index;
        }
    }
}
