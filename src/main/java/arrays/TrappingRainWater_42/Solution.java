package arrays.TrappingRainWater_42;

class Solution {

    public int trap(int[] height) {
        int trapped = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                trapped += leftMax - height[left];
                left++;
            } else {
                trapped += rightMax - height[right];
                right--;
            }
        }

        return trapped;
    }
}
