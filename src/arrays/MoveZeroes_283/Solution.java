package arrays.MoveZeroes_283;

public class Solution {

    public void moveZeroes(int[] nums) {
        for (int i = 0, lastNonZeroPosition = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, lastNonZeroPosition++, i);
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }

        int num = nums[left];
        nums[left] = nums[right];
        nums[right] = num;
    }
}
