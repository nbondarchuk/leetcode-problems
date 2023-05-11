package arrays.RemoveDuplicatesFromSortedArray_26;

class Solution2 {

    public int removeDuplicates(int[] nums) {
        // 1, 1, 1, 1, 2, 2, 2, 2, 3
        int slowPtr = 0;
        for (int fastPtr = 0; fastPtr < nums.length; fastPtr++) {
            if (nums[slowPtr] == nums[fastPtr]) {
                continue;
            }
            nums[++slowPtr] = nums[fastPtr];
        }
        return slowPtr + 1; // pointer is zero based, so add one to get number of elements
    }
}
