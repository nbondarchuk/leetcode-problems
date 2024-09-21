package arrays.RemoveElement_27;

class Solution {

    public int removeElement(int[] nums, int val) {
        int slowPtr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slowPtr++] = nums[i];
            }
        }
        return slowPtr;
    }
}
