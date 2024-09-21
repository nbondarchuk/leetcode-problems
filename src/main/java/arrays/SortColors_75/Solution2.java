package arrays.SortColors_75;

class Solution2 {

    public void sortColors(int[] nums) {
        int numZeros = 0;
        int numOnes = 0;
        int numTwos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeros++;
            } else if (nums[i] == 1) {
                numOnes++;
            } else {
                numTwos++;
            }
        }

        int idx = 0;
        for (int i = 0; i < numZeros; i++) {
            nums[idx++] = 0;
        }
        for (int i = 0; i < numOnes; i++) {
            nums[idx++] = 1;
        }
        for (int i = 0; i < numTwos; i++) {
            nums[idx++] = 2;
        }
    }
}
