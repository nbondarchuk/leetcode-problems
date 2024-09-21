package arrays.ContainerWithMostWater_11;

class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            max = Math.max(max, minHeight * (right - left));
            if (height[left] < height[right]) {
                left++;
                while (height[left] < minHeight && left < right) {
                    left++;
                }
            } else {
                right--;
                while (height[right] < minHeight && left < right) {
                    right--;
                }
            }
        }
        return max;
    }
}
