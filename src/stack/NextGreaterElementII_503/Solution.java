package stack.NextGreaterElementII_503;

import java.util.Stack;

class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        int maxElementIndex = findMaxElementIndex(nums);

        for (int i = maxElementIndex; i >= 0; i--) {
            handleElement(stack, i, nums, result);
        }

        for (int i = nums.length - 1; i > maxElementIndex; i--) {
            handleElement(stack, i, nums, result);
        }

        return result;
    }

    private int findMaxElementIndex(int[] nums) {
        int maxElementIndex = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    private static void handleElement(Stack<Integer> stack, int index, int[] nums, int[] result) {
        while (!stack.isEmpty() && stack.peek() <= nums[index]) {
            stack.pop();
        }

        if (!stack.isEmpty()) {
            result[index] = stack.peek();
        } else {
            result[index] = -1;
        }

        stack.push(nums[index]);
    }
}
