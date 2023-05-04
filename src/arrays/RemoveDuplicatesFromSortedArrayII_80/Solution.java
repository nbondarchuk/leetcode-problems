package arrays.RemoveDuplicatesFromSortedArrayII_80;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        // 1,2,2,2,3
        int numDups = 0;
        int insertIndex = 1; // last unique element's index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex++] = nums[i];
                numDups = 0;
            } else if (numDups < 1) { // max one dupe is allowed
                nums[insertIndex++] = nums[i];
                numDups++;
            }
        }
        return insertIndex;
    }
}
