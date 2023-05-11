package arrays.RemoveDuplicatesFromSortedArray_26;

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        // 1,1,1,2
        int insertIndex = 1; // last unique element's index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex++] = nums[i];
            }
        }
        return insertIndex;
    }
}
