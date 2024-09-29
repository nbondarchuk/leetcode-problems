package arrays.MinimumSizeSubarraySum_209;

class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int len = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (sum >= target) {
                len = Math.min(len, right - left + 1);
                while (sum >= target) {
                    sum -= nums[left++];
                    if (sum >= target) {
                        len = Math.min(len, right - left + 1);
                    }
                }
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
