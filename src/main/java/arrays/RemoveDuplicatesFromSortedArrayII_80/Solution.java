package arrays.RemoveDuplicatesFromSortedArrayII_80;

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int ptr = 0;
        int numDups = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[ptr]) {
                if (numDups == 0) {
                    numDups += 1;
                    nums[++ptr] = nums[i];
                }
            } else {
                nums[++ptr] = nums[i];
                numDups = 0;
            }
        }

        return ptr + 1;
    }
}
