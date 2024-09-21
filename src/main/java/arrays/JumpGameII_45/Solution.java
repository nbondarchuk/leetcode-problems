package arrays.JumpGameII_45;

class Solution {

    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int far = 0;
        int range = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length; i++) {
            far = Math.max(far, i + nums[i]);
            if (i == range) {
                jumps++;
                range = far;
                if (range >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
