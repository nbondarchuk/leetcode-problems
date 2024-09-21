package arrays.SortColors_75;

class Solution1 {

    public void sortColors(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, insertPos++, i);
            }
        }

        for (int i = insertPos; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, insertPos++, i);
            }
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
